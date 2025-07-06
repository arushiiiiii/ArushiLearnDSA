import java.util.ArrayList;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {2,7,3,5,7,7,9,4};
        System.out.println(search(arr, 1, 0));
        System.out.println(findAllIndex(arr, 7, 0, new ArrayList<>()));
        System.out.println(findAllIndex2(arr, 7, 0));
    }
    static int search (int[] arr,int target, int i) {
        if (i == arr.length) {
            return -1;
        }
        if (arr[i] == target) {
            return i;
        }
        else {
            return search(arr, target, i + 1);
        }
    }

//    static ArrayList<Integer> list = new ArrayList<>();
//    static void findAllIndex(int[] arr, int target, int i) {
//        if (i == arr.length) {
//            return;
//        }
//        if (arr[i] == target) {
//            list.add(i);
//        }
//        findAllIndex(arr, target, i + 1);
//    }

    static ArrayList<Integer> findAllIndex(int[] arr, int target, int i, ArrayList<Integer> list) {
        if (i == arr.length) {
            return list;
        }
        if (arr[i] == target) {
            list.add(i);
        }
        return findAllIndex(arr, target, i + 1, list);
    }

    static ArrayList<Integer> findAllIndex2(int[] arr, int target, int i) {
        ArrayList<Integer> list = new ArrayList<>();
        if (i == arr.length) {
            return list;
        }
        // this will contain ans for the current function call only
        if (arr[i] == target) {
            list.add(i);
        }
        ArrayList<Integer> ansFromBelowCalls = findAllIndex2(arr, target, i + 1);
        list.addAll(ansFromBelowCalls);
        return list;
    }
}
