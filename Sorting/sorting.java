public class sorting {
    static void merge(int arr[] , int l, int mid, int r){
        int left[] = new int[mid-l+1];
        int right[] = new int[r-mid];
        int i , j, k;
        for( i = 0; i<mid-l + 1; i++){
            left[i++] = arr[l+i]; 
        }
        for( j = 0; j<r-mid; j++){
            right[j++] = arr[mid+1+j]; 
        }
        i = 0;
        j = 0;
        k = l;
        while(i<mid-l+1 && j < r-mid){
            
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
        int arr[] = {4,1,3,5,2};
        System.out.println("Array before sorting: ");
         for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        mergesort(arr,0,arr.length-1);
        System.out.println("Array after sorting: ");
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
