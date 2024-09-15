import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int num = input.nextInt();
        int TongSoChan = 1;
        int TongSoLe = 2;
        for (int i = 1; i <= num; i++) {
            if (num % 2 == 0){
                TongSoChan += 2;

            }
            else {
                TongSoLe += 2;
            }
        }
        if (num % 2 == 0){
            System.out.println(TongSoChan);
        }
        else {
            System.out.println(TongSoLe);
        }

    }
}