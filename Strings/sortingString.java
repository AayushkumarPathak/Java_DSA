public class sortingString {
    public static void main(String[] args) {
        
        String s = "Aayush";

        char arr[] = s.toCharArray();
        char temp;

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length-1;j++){
                if(arr[j]>arr[i]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println(arr);
    }
    
}
