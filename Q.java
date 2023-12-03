public class Q {

    public static void quick(int[] arr,int low,int high){
        if(low<high){

            int p=partsion(arr,low,high);

            quick(arr, low, p-1);
            quick(arr, p+1, high);
        }
    }

    private static int partsion(int[] arr,int low,int high){

        int i=low-1;
        int pivot=arr[high];

        for(int j=low;j<high;j++){
            if(arr[j]<pivot){
                i++; 
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }

        int temp=arr[i+1];
        arr[i+1]=arr[high];
        arr[high]=temp;

        return i+1;


    }

    public static void main(String[] args) {
        int[] arr={4,7,3,1,6};
        quick(arr,0,arr.length-1);

        for(int a:arr){
            System.out.print(a);
        }
    }
    
}
