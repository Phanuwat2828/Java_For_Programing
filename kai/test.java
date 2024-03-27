public class test {
    public static void main(String[] args) {

        String text = "one";
        try {
            int number = Integer.parseInt(text);
            System.out.println(number);
        } catch (NumberFormatException e) {
            System.out.print(e);
        }
    }
}
