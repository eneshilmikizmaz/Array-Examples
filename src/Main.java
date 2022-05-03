import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AverageOfElements elements = new AverageOfElements();
        int[] arr = {15, 12, 788, 4, 1, -1, -778, 2, 0, 2, 15, 1, 4, 8, 23, 46, 43, 23, 23, 3, 4};
        System.out.println("Harmonik Ortalama : " + elements.harmonicAvr(arr));

        FindingTheClosestNumber closestNumber = new FindingTheClosestNumber();
        closestNumber.find(arr, 5);

        String[][] arr1 = new String[5][3];
        ALetter letter = new ALetter();
        letter.write(arr1);

        FindDuplicateNumber number = new FindDuplicateNumber();
        number.find(arr);
    }
}