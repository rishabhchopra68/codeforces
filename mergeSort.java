public class mergeSort {
    static void mergeSort(int[] input){
        if(input.length<=1){
            return;
        }
        int[] arr1= new int[input.length/2];
        int[] arr2= new int[input.length-arr1.length];
        for(int i=0;i<arr1.length;i++){
            arr1[i]=input[i];
        }
        for(int i=0;i<arr2.length;i++){
            arr2[i]=input[arr1.length+i];
        }
        mergeSort(arr1);
        mergeSort(arr2);
        merge(arr1,arr2,input);
    }

    private static void merge(int[] arr1, int[] arr2,int[] arr) {
        int c1=0,c2=0,c3=0;
        while(c1<arr1.length && c2<arr2.length){
            if(arr1[c1]>arr2[c2]){
                arr[c3++]= arr2[c2++];
            }
            else{
                arr[c3++]= arr1[c1++];
            }
        }
        while(c1<arr1.length){
            arr[c3++]=arr1[c1++];
        }
        while(c2<arr2.length){
            arr[c3++]=arr2[c2++];
        }
    }

    public static void main(String[] args){
        int[] arr= {4,5,1,2,3,8,5,1};
        mergeSort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
