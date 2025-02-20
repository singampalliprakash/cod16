public class Main {
    public static void main(String[] args) {
        int[] arr = {3, 2, 2, 3};
        int ele = 3;
        int k = 0; 

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != ele) {
                arr[k] = arr[i]; 
                k++;
            }
        }

        System.out.println(k); 
        // Print modified array (first 'k' elements)
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
      
}
