import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubSetIteration {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        int[] arr1 = {1,2,2};
        System.out.println(subset(arr));
        List<List<Integer>> ans = subset(arr);
        for (List<Integer> list: ans) {
            System.out.println(list);
        }
        System.out.println(subsetWithDup(arr1));
        System.out.println(subsetWithDup2(arr1));
    }

    static List<List<Integer>> subset(int[] arr){
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());
        for (int num : arr) {
            int n = outer.size();
            for (int i = 0; i < n; i++) {
                List<Integer> inner = new ArrayList<>(outer.get(i));
                inner.add(num);
                outer.add(inner);
            }
        }
        return outer;
    }

    static List<List<Integer>> subsetWithDup(int[] arr){
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());
        for (int num : arr) {
            int n = outer.size();
            for (int i = 0; i < n; i++) {
                List<Integer> inner = new ArrayList<>(outer.get(i));
                inner.add(num);
                if (!outer.contains(inner)) {
                    outer.add(inner);
                }
            }
        }
        return outer;
    }

    static List<List<Integer>> subsetWithDup2(int[] arr){
        Arrays.sort(arr);
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());
        int start = 0;
        int end = 0;
        for (int j = 0; j < arr.length; j++) {
            start = 0;
            // if current and previous element is same,
            if (j > 0 && arr[j] == arr[j-1]) {
                start = end + 1;
            }
            end = outer.size() - 1;
//            int n = outer.size();
            for (int i = start; i <= end; i++) {
                List<Integer> inner = new ArrayList<>(outer.get(i));
                inner.add(arr[j]);
                outer.add(inner);
            }
        }
        return outer;
    }
}
