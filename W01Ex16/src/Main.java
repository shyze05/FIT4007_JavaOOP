import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a = 0;
        int b = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số a: ");
        a = scanner.nextInt();

        System.out.println("Nhập số b: ");
        b = scanner.nextInt();

        if (a != 0) {
            float x = (float) -b / a;
            System.out.println("x = " + x);
        } else {
            System.out.println("Phương trình vô nghiệm (a không thể bằng 0).");
        }
    }
}
