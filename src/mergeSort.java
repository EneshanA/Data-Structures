public class mergeSort {


    void merge(int[] arr,int l,int mid,int r){
        int len1 = mid-l + 1;
        int len2 = r - mid;
        int L[] = new int[len1];
        int R[] = new int[len2];

        for(int i = 0; i< len1; i++){
            L[i] = arr[i+l];
        }
        for(int j = 0; j < len2; j++){
            R[j] = arr[mid+j+1];
        }

        int i = 0;

        int j = 0;

        int k = l;


        while(i < len1 && j < len2){
            if(L[i] <= R[j]){
                arr[k] = L[i];
                i++;
            }
            else{
                arr[k] = R[j];
                j++;
            }
            k++;
        }
        while(i < len1){
            arr[k] = L[i];
            i++;
            k++;
        }
        while(j < len2){
            arr[k] = R[j];
            j++;
            k++;
        }

    }



    void mergeSort(int[] arr, int l, int r){

        if(l < r) {
            int mid = (r + l) / 2;
            mergeSort(arr, l, mid);
            mergeSort(arr, mid + 1, r);
            merge(arr, l, mid, r);
        }

    }
    void print(int []arr){
        for(int num : arr){
            System.out.print(num + " ");
        }
        System.out.println();

    }




    public static void main(String[] args){
        int []arr = {23,15,72,18,35,56,45,53,21,34};
        mergeSort obj = new mergeSort();
        obj.mergeSort(arr,0, arr.length - 1);
        obj.print(arr);

    }
}
