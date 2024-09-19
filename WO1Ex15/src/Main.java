import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int size = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        size = sc.nextInt();

        int[] arr = new int[size];
        System.out.println("Enter the elements of the array: ");
        int GTLL = arr[0];
        int GTNN = arr[0];
        for (int i = 0; i < size; i++) {
            if (arr[i] > GTLL) {
                GTLL = arr[i];
            }

        }
        for (int j = 0; j < size; j++){
            if (arr[j] < GTNN) {
                GTNN = arr[j];
            }

        }
        System.out.println("GTLL: "+ GTLL);
        System.out.println("GTNN: "+ GTNN);
        }

}