public class sorting {
    static int partition(int arr[] , int st, int end){
        int pivot = arr[st];
        int counter = 0;
        for(int i = st+1; i<=end; i++){
            if(arr[i] <= pivot){
                counter++;
            }
        }
        int pi = st + counter;
        int c = arr[st];
        arr[st] = arr[pi];
        arr[pi] = c;

        int i = st, j = end;
        while(i<pi && j>pi){
            if(arr[i] <= pivot){
                i++;
            }
            if(arr[j] > pivot){
                j--;
            }
            if(i < pi && j > pi){
                int c1 = arr[i];
                arr[i] = arr[j];
                arr[j] = c1;
                i++;
                j--;
            }
        }
        return pi;
    }
    static void quicksort(int arr[], int st, int end){
        if(st>=end){
            return;
        }
        
       int pi = partition(arr,st,end);
       quicksort(arr, st, pi-1);
       quicksort(arr, pi+1, end);
    }
    static void merge(int arr[] , int l, int mid, int r){
        int left[] = new int[mid-l+1];
        int right[] = new int[r-mid];
        int i , j, k;
        for( i = 0; i<mid-l + 1; i++){
            left[i] = arr[l+i]; 
        }
        for( j = 0; j<r-mid; j++){
            right[j] = arr[mid+1+j]; 
        }
        i = 0;
        j = 0;
        k = l;
        while(i<mid-l+1 && j < r-mid){
            if(left[i] < right[j]){
                arr[k++] = left[i++];
            }
            else{
                arr[k++] = right[j++];
            }
        }
        while(i<mid-l+1){
            arr[k++] = left[i++];
        }
        while(j<r-mid){
            arr[k++] = right[j++];
        }
    }
    static void mergesort(int arr[], int l, int r){
        if(l>=r){
            return;
        }
        int mid = (l+r)/2;
        mergesort(arr, l, mid);
        mergesort(arr, mid+1, r);
        merge(arr,l,mid,r);
    }
    public static void main(String[] args) {
        // Merge Sort
        // int arr[] = {4,1,3,5,2};
        // System.out.println("Array before sorting: ");
        //  for(int i = 0; i<arr.length; i++){
        //     System.out.print(arr[i] + " ");
        // }
        // mergesort(arr,0,arr.length-1);
        // System.out.println();
        // System.out.println("Array after sorting: ");
        // for(int i = 0; i<arr.length; i++){
        //     System.out.print(arr[i] + " ");
        // }


        // Quick Sort
        // int arr[] = {7,13,8,5,10,2,2,7,4,5};
        // System.out.println("Array before sorting: ");
        //  for(int i = 0; i<arr.length; i++){
        //     System.out.print(arr[i] + " ");
        // }
        // quicksort(arr,0,arr.length-1);
        // System.out.println();
        // System.out.println("Array after sorting: ");
        // for(int i = 0; i<arr.length; i++){
        //     System.out.print(arr[i] + " ");
        // }
    }
}
