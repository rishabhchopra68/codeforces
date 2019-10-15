public class quickSort {
    static void quickSort(int[] input,int start, int end){
        if(start>end){
            return;
        }
        int pivotIndex= partition(input,start,end);
        //System.out.println(pivotIndex);
        quickSort(input,start,pivotIndex-1);
        quickSort(input,pivotIndex+1,end);
    }

    private static int partition(int[] input,int si,int ei) {
        int pE= input[ei];
        int pI= -1;
        int count=0;
        for(int i=si;i<ei;i++){
            if(input[i]<pE){
                count++;
            }
        }
        pI= si+count;
        int tem= input[pI];
        input[pI]= pE;
        input[ei]= tem;
        int i=si,j=ei;
        while(i<pI && j>pI){
            if(input[i]<pE){
                i++;
            }else if(input[j]>pE){
                j--;
            }
            else{
                int temp= input[i];
                input[i]= input[j];
                input[j]=temp;
                i++;
                j--;
            }
        }

        return pI;
    }
    public static void main(String[] args){
        int[] arr= {4,5,7,1};
        quickSort(arr,0,arr.length-1);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
