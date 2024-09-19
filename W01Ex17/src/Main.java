import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập so n: ");
        n = sc.nextInt();

        if (n % 2 == 0 && n != 0){
            System.out.println(n + " la so chan");
        } else if (n % 2 != 0) {
            System.out.println(n + " la so le");
        } else {
            System.out.println("zero");
        }
    }
}