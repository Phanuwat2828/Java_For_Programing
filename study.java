
import java.util.*;

class study {
    private static void kai() {
        try {

        } catch (Exception e) {
            System.out.print(1);
        }
    }

    private static String kai(String kai) {
        StringBuffer st = new StringBuffer(kai);
        String data = st.deleteCharAt(0).toString();
        return st.toString();

    }

    static int kai(int kai, int cai) {
        return 0;
    }

    static int kai(int kai, char test) {

        return 0;
    }

    public static void main(String[] args) {
        String test = "kai";
        System.out.print(kai(test));
    }

}
