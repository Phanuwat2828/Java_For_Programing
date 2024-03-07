package kai;

// ====================== library =====================

public class function_in_java {
    // ===================== Function ====================
    private static void for_int() {
        System.out.println("==========================Integer==========================");
        int x[] = { 45, 30, 25 }, y[] = { 25, 30, 45 };
        for (int i = 0; i < 3; i++) {
            System.out.printf("compare(%d,%d) = %d\n", x[i], y[i], Integer.compare(x[i], y[i]));
        }
    }

    // ====================== mian ====================
    public static void main(String[] args) {
        String data_string = "Phanuwat_Khamtha";
        int data_integer = 66034;
        boolean data_boolean = false;
        char data_char = 'K';
        for_int();
    }

}