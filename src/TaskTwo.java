import java.util.Arrays;
import java.util.Random;

public class TaskTwo {
    public static void main(String[] args) {
        Random random = new Random();

        int n = 100;
        int[]randomNumbers = new int[n];

        for(int i = 0; i < randomNumbers.length; i++){
//            od razu się przyznam podpowiedź do tego zakresu -1000,1000 znalazłem wkońcu pytając AI:)
            int number = random.nextInt(2001)-1000;
            randomNumbers[i]= number;
        }
        System.out.println("-----for-----");
        System.out.println(Arrays.toString(randomNumbers));

        int i = 0;
        while(i < randomNumbers.length){
            int number = random.nextInt(2001)-1000;
            randomNumbers[i]= number;
            i++;
        }
        System.out.println("----while-------------");
        System.out.println(Arrays.toString(randomNumbers));
    }
}
