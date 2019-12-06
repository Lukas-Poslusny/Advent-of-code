import java.io.File;
import java.util.Scanner;

public class DayOne {
    static int finalNumber;

    public static void main(String args[]) throws Exception {
        String myArray = new File ("numbers.txt");
        Scanner sc = new Scanner (file);

        while (sc.hasNext()) {
            int number = sc.nextInt();
            finalNumber = finalNumber + number;
        }
        System.out.println(finalNumber);
    }
}