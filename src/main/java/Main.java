public class Main {
    public static void main(String[] args) {
        System.out.println(first(1, 3));
        second(0);
        System.out.println(third(-2));
        fourth("Hello!", 3);
        System.out.println(fifth(2020));
    }

    public static boolean first(int a, int b) {

        return a + b >= 10 && a + b <= 20;
    }


    public static void second(int a) {

        if (a >= 0) {
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательное");
        }
    }


    public static boolean third(int a){
        return a < 0;
    }


    public static void fourth(String text, int number) {
        for (int i  = 0 ; i < number; i++) {
            System.out.println(text);
        }
    }


    public static boolean fifth(int a) {
        return a % 4 == 0 && a % 100 != 0 || a % 400 == 0;
    }
}
