import static java.util.stream.IntStream.range;

//Viết chương trình xuất ra tổng các số là bội số của 7 (từ 1 đến 100)
public class Main {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 7; i < 101; i+= 7){
                if (i % 7 == 0){
                    sum += i;
                }
        }
        System.out.println(sum);
    }
}