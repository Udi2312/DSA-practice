import java.util.Map;
import java.util.HashMap;
import java.util.LinkedList;

public class hashmap1 {
    public static class MyHashMap<K, V> {
        public static final int DEFAULT_CAPACITY = 4;
        public static final float DEFAULT_LOAD_FACTOR = 0.75f;

        private class Node {
            K key;
            V value;

            Node(K key, V value) {
                this.key = key;
                this.value = value;
            }
        }

        private int n;
        private LinkedList<Node>[] buckets;

        private int Hashfunc(K Key) {
            int hc = Key.hashCode();
            return (Math.abs(hc)) % buckets.length;
        }

        private void initBuckets(int n) {
            buckets = new LinkedList[n];
            for (int i = 0; i < buckets.length; i++) {
                buckets[i] = new LinkedList<>();
            }
        }

        private int searchinBucket(LinkedList<Node> ll, K key) {
            for (int i = 0; i < ll.size(); i++) {
                if (ll.get(i).key == key) {
                    return i;
                }
            }
            return -1;
        }

        public MyHashMap() {
            initBuckets(DEFAULT_CAPACITY);
        }

        private void rehash(){
            LinkedList<Node>[] oldBuckets = buckets;
            n = 0;
            initBuckets(oldBuckets.length * 2);
            for(var bucket : oldBuckets){
                for(var node : bucket){
                    put(node.key , node.value);
                }
            }
        }

        public void put(K key, V value) {
            int bi = Hashfunc(key);
            LinkedList<Node> currbucket = buckets[bi];
            int ei = searchinBucket(currbucket, key);
            if (ei == -1) {
                Node node = new Node(key, value);
                currbucket.add(node);
                n++;
            } else {
                Node currNode = currbucket.get(ei);
                currNode.value = value;
            }

            if(n >= buckets.length * DEFAULT_LOAD_FACTOR){
                rehash();
            }
        }

        public V get(K key) {
            int bi = Hashfunc(key);
            LinkedList<Node> currbucket = buckets[bi];
            int ans = searchinBucket(currbucket, key);
            if (ans == -1) {
                // System.out.println("The value does not exists");
                return null;
            } else {
                Node currNode = currbucket.get(ans);
                return currNode.value;
            }
        }

        public V remove(K key) {
            int bi = Hashfunc(key);
            LinkedList<Node> currbucket = buckets[bi];
            int ans = searchinBucket(currbucket, key);
            if (ans == -1) {
                // System.out.println("The value does not exists");
                return null;
            } else {
                Node currNode = currbucket.get(ans);
                V val = currNode.value;
                currbucket.remove(ans);
                n--;
                return val;
            }
        }

        public int size() {
            return n;
        }

        public int capacity(){
            return buckets.length;
        }
        public float load(){
            return (n*1.0f)/buckets.length;
        }
    }

    public static void HashmapMethods() {
        // Map<String , Integer> mp = new HashMap<>();
        // mp.put("a" , 21);
        // mp.put("b" , 31);
        // mp.put("c" , 41);
        // mp.put("d" , 51);
        // mp.put("e" , 61);

        // Getting value of a key
        // System.out.println(mp.get("b"));
        // System.out.println(mp.get("f"));

        // Updating value of a key
        // mp.put("a" , 25);
        // System.out.println(mp.get("a"));

        // Remove value pair
        // System.out.println(mp.remove("b"));

        // Check if the key exists
        // System.out.println(mp.containsKey("a"));
        // System.out.println(mp.containsKey("h"));

        // Adding a new entry if the key doesn't already exists
        // mp.putIfAbsent("h", 46);

        // Get all the keys
        // System.out.println(mp.keySet());

        // Get all the values
        // System.out.println(mp.values());

        // Get all the entries
        // System.out.println(mp.entrySet());

        // Traverse along the hashmap
        // for(String key : mp.keySet()){
        // System.out.println(key + " = " + mp.get(key));
        // }
        // for(Map.Entry<String , Integer> e : mp.entrySet()){
        // System.out.println(e.getKey() + " = " + e.getValue());
        // }
        // for(var e : mp.entrySet()){
        // System.out.println(e.getKey() + " = " + e.getValue());
        // }
    }

    public static void main(String[] args) {
        // HashmapMethods();

        // Most frequent element in array

        // int arr[] = {1,2,4,1,3,1,5,5,1,6};
        // Map<Integer , Integer> a = new HashMap<>();
        // for(int i = 0; i<arr.length; i++){
        // if(!a.containsKey(arr[i])){
        // a.put(arr[i],1);
        // }
        // else{
        // a.put(arr[i],a.get(arr[i])+1);
        // }
        // }
        // System.out.println(a.entrySet());
        // int max = -1;
        // int maxele = -1;
        // for (var i : a.entrySet()) {
        // if(i.getValue() > max){
        // max = i.getValue();
        // maxele = i.getKey();
        // }
        // }
        // System.out.println(maxele);

        // Implement custom hashmap function
        MyHashMap<String, Integer> mp = new MyHashMap<>();
        System.out.println("Testing put");
        mp.put("a", 21);
        mp.put("b", 31);
        System.out.println("Capacity " + mp.capacity());
        System.out.println("Load " + mp.load());
        mp.put("c", 41);
        mp.put("d", 51);
        mp.put("e", 61);
        System.out.println("Testing size " + mp.size());
        System.out.println("Capacity " + mp.capacity());
        System.out.println("Load " + mp.load());
        mp.put("e", 71);
        System.out.println("Testing size " + mp.size());

        System.out.println("Testing get");
        System.out.println(mp.get("a"));
        System.out.println(mp.get("b"));
        System.out.println(mp.get("e"));
        System.out.println(mp.get("h"));

        System.out.println("Testing remove");
        System.out.println(mp.remove("c") + " " + mp.size());
        System.out.println(mp.remove("c"));
    }
}
