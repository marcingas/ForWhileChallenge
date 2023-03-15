import java.util.Arrays;
import java.util.Scanner;

public class TaskThree {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean flag = true;

        while (flag) {
            System.out.println("Podaj słowo");
            String input = scanner.nextLine();
            String[] word = input.split("");

            if (word.length >= 3) {
//                use for:
                for (int i = 0; i < word.length; i++) {
                    if (word[i].equals("a") || word[i].equals("e") || word[i].equals("i") || word[i].equals("o") ||
                            word[i].equals("u") || word[i].equals("y")) {
                        System.out.println("podane słowo: " + "-" + input + "-" +
                                " ma więcej niż 3 litery i ma przynajmniej jedną samogłoskę: " + word[i]);
                        flag = false;
                        break;
                    }
                }

//                use while:
                System.out.println("----while-----");
                int i = 0;
                while (i < word.length) {
                    if (word[i].equals("a") || word[i].equals("e") || word[i].equals("i") || word[i].equals("o") ||
                            word[i].equals("u") || word[i].equals("y")) {
                        System.out.println("podane słowo: " + "-" + input + "-" +
                                " ma więcej niż 3 litery i ma przynajmniej jedną samogłoskę: " + word[i]);
                        flag = false;
                        break;
                    }
                    i++;
                }
            }
        }
    }
}
