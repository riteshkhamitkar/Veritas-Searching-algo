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
    
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,7};
        Main ritesh = new Main();
        ritesh.linearsearch(arr,8);
    }
}
