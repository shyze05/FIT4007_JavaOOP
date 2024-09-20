public class Main {
    public static void main(String[] args) {
        // count a in chuoi
        String str = "aaaaaaaaaaaa";
        int count_a = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a') {
                count_a++;
            }
        }
        System.out.println("Character 'a' appears " + count_a + " times in the string.");

    }
}