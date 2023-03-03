import java.util.ArrayList;

public class S {
    /**
     *  @return true if a1 is a permutation of a2 (same elements, but not same order)
     *  Precondition: a1 and a2 contain no duplicate elements
     */
    public static boolean specialArrayListEquals(ArrayList a1, ArrayList a2) {
        boolean result = true;
        a1 = new ArrayList(a1); // clone a1
        a2 = new ArrayList(a2); // clone a2
        if (a1.size() == a2.size()) {
            for (int i = 0; ((i < a1.size()) && (result == true)); i++) {
                Object o = a1.get(i);
                result = a2.contains(o);
                if (result) {
                    a2.remove(o);
                }
            }
        } else {
            result = false;
        }
        return result;
    }
}
