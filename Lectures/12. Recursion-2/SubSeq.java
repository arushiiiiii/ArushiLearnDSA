import java.util.ArrayList;

public class SubSeq {
    public static void main(String[] args) {
        subsetASCII("", "abc");
        System.out.println(subsetASCII2("", "abc"));;
    }

    static void subset(String p, String up){
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        subset(p + ch, up.substring(1));
        subset(p, up.substring(1));
    }

    static ArrayList<String> subset2(String p, String up){
        ArrayList<String> list = new ArrayList<>();
        if (up.isEmpty()) {
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
        ArrayList<String> left = subset2(p + ch, up.substring(1));
        ArrayList<String> right = subset2(p, up.substring(1));

        left.addAll(right);
        return left;
    }

    static void subsetASCII(String p, String up){
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        subsetASCII(p + ch, up.substring(1));
        subsetASCII(p, up.substring(1));
        subsetASCII(p + (ch + 0), up.substring(1));
    }

    static ArrayList<String> subsetASCII2(String p, String up){
        ArrayList<String> list = new ArrayList<>();
        if (up.isEmpty()) {
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
        ArrayList<String> first = subsetASCII2(p + ch, up.substring(1));
        ArrayList<String> second = subsetASCII2(p, up.substring(1));
        ArrayList<String> third = subsetASCII2(p + (ch + 0), up.substring(1));
        first.addAll(second);
        first.addAll(third);
        return first;
    }
}
