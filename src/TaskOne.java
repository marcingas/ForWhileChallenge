import java.util.Arrays;

public class TaskOne {
    public static void main(String[] args) {
        int n = 100;
        int[]numbers = new int[n];
//        1.
        for(int i = 0; i < n; i++){
            numbers[i] = numbers.length - i;
        }
        System.out.println("-----for-------");
        System.out.println(Arrays.toString(numbers));
        int i = 0;
//        2.
        while(i < numbers.length){
            numbers[i] = numbers.length - i;
            i++;
        }
        System.out.println("----while-------");
        System.out.println(Arrays.toString(numbers));

    }
}
