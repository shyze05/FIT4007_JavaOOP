import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào chuỗi bất kì: ");
        String s = scanner.nextLine();

        int count = countDigitsInString(s);
        System.out.println("Số lượng ký tự là số trong chuỗi: " + count);
        }
    public static int countDigitsInString(String s){
        int count = 0;
        for (int i = 0;i < s.length();i++){
            if (Character.isDigit(s.charAt(i))){
                count++;
            }
        }
        return count;
    }
    }

