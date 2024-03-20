class arrayq5{
    public static void main(String[] args){
        int arr[] = {1,2,3,4,5,6};
        int l = arr.length;
        int mid = l/2;
        int temp;
        for(int i=0;i<mid;i++){
            temp = arr[i];
            arr[i] = arr[l-1-i];
            arr[l-1-i] = temp;
        }
        for(int element:arr){
            System.out.println(element);
        }
    }
}