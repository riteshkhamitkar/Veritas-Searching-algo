public class Main{
    
    public static int linearsearch(int arr[],int value){
        for(int i = 0; i < arr.length; i++){
            if(arr[i]==value){
                System.out.println("Found "+i);
                return -1;
            }
        }
        System.out.println("Not found "+ value);
        return -1;
    }
    
    //binary
    
    public static int binarysearch(int arr[], int value){
        int start = 0;
        int end = arr.length -1;
        int middle = (start+end/2);
        while(arr[middle] != value && start <= end){
            if(value < arr[middle]){
                end = middle -1;
            }else{
                start = middle +1;
            }
            middle = (start+end)/2;
        }
        if(arr[middle] == value){
            System.out.println("Found "+middle);
            return middle;
        }else{
            System.out.println("Not found "+value);
            return -1;
        }
    }
    
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,7,8};
        Main ritesh = new Main();
        ritesh.linearsearch(arr,8);
        ritesh.binarysearch(arr,4);
    }
}
