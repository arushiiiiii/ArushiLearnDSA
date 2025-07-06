import java.util.ArrayList;
import java.util.List;

public class Dice {
    public static void main(String[] args) {
        dice("", 7, 8);
        System.out.println(diceRet("", 4));
    }

    static void dice (String p, int target, int faces) {
        if (target == 0) {
            System.out.println(p);
            return;
        }

        for (int i = 1; i <= faces; i++) {
            int diff = target - i;
            if (diff >= 0) {
                dice(p + i, diff, faces);
            }
        }
    }

    static List<String> diceRet (String p, int target) {
        List<String> list = new ArrayList<>();
        if (target == 0) {
//            List<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        for (int i = 1; i <= 6; i++) {
            int diff = target - i;
            if (diff >= 0) {
                list.addAll(diceRet(p + i, diff));
            }
        }
        return list;
    }
}
