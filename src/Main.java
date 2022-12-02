import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Random random = new Random();
        ArrayList<ArrayList<Integer>> integers = new ArrayList<>();
        ArrayList<Integer>number1 = new ArrayList<>();
        ArrayList<Integer>number2 = new ArrayList<>();
        for (int i = 0; i < 50; i++) {
            int number = random.nextInt(1,100);
            if (number %2 == 0){
                number1.add(number);
            }else {
                number2.add(number);
            }
        }
        integers.add(number1);
        integers.add(number2);
        System.out.println("Obshyi sandar: "+integers);
        System.out.println("Jup sandar: "+number1);
        System.out.println("Tak sandar: "+number2);
    }
}