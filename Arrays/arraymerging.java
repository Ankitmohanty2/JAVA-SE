public class MergeArrays {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3};
        int[] array2 = {4, 5, 6};
        
        int length = array1.length + array2.length;
        int[] mergedArray = new int[length];
        
        int pos = 0;
        for (int element : array1) {
            mergedArray[pos] = element;
            pos++;
        }
        
        for (int element : array2) {
            mergedArray[pos] = element;
            pos++;
        }
        
       
        for (int element : mergedArray) {
            System.out.print(element + " ");
        }
    }
}
