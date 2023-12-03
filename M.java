public class M {

    public static void merging(int[] arr, int l,int mid,int r){
        int[] merge=new int[r-l+1];
        int x=l;
        int y=mid+1;
        int k=0;

        while(x<=mid && y<=r){
            if(arr[x]<=arr[y]){
                merge[k++]=arr[x++];

            }
            else{
                merge[k++]=arr[y++];
            }
        }

        while(x<=mid){
            merge[k++]=arr[x++];

        }

        while(y<=r){
            merge[k++]=arr[y++];
        }

        for(int i=0,j=l;i<merge.length;i++,j++){
            arr[j]=merge[i];
        }
    }

    public static void merge(int[] arr, int l,int r){
        if(l<r){

            int mid=l+(r-l)/2;
            merge(arr, l, mid);
            merge(arr, mid+1, r);
            merging(arr,l,mid,r);
        }
    }


    public static void main(String[] args) {
        int arr[]={5,3,6,44,33};
        merge(arr,0,arr.length-1);
        for(int a:arr){
            System.out.println(a);
        }
    }
    
}
