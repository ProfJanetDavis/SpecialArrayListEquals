import java.util.ArrayList;

public class S {
    /**
     *  @return true if a1 is a permutation of a2 (same elements, but not same order)
     */
    public static boolean specialArrayListEquals(ArrayList a1, ArrayList a2) {
        boolean result = true;
        a2 = new ArrayList(a2); // clone a2
        if (a1.size() == a2.size()) {
            for (Object o : a1) {
                result = a2.contains(o);
                if (result) {
                    a2.remove(o);
                } else {
                    break;
                }
            }
        } else {
            result = false;
        }
        return result;
    }
}
