import java.util.*;

public class ArraysLists {

    static List<Integer> compareLists(List<Integer> a, List<Integer> b) {
        // The arrays are converted to lists directly
        Integer[] arr1 = a.toArray(new Integer[a.size()]);
        Integer[] arr2 = b.toArray(new Integer[b.size()]);

        int aaa = 0; // Count of elements in `a` greater than in `b`
        int bbb = 0; // Count of elements in `b` greater than in `a`

        // Compare corresponding elements of both arrays
        for (int i = 0; i < a.size(); i++) {
            if (arr1[i] > arr2[i]) {
                aaa++;
            } else if (arr1[i] < arr2[i]) {
                bbb++;
            }
        }

        // Create and return a list containing the counts
        List<Integer> arrFinal = new ArrayList<>();
        arrFinal.add(aaa);
        arrFinal.add(bbb);

        return arrFinal;
    }

    public static void main(String[] args) {
        // Initialize lists with the desired elements
        List<Integer> A = new ArrayList<>(Arrays.asList(20, 30, 40, 50));
        List<Integer> B = new ArrayList<>(Arrays.asList(40, 40, 40, 40));

        // Compare the lists
        List<Integer> result = compareLists(A, B);

        // Output the results
        for (int i = 0; i < result.size(); i++) {
            System.out.println(result.get(i));
        }
    }
}
