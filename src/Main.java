import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AverageOfElements elements = new AverageOfElements();
        int[] arr = {15, 12, 788, 1, -1, -778, 2, 0};
        System.out.println("Harmonik Ortalama : " + elements.harmonicAvr(arr));

        FindingTheClosestNumber closestNumber = new FindingTheClosestNumber();
        closestNumber.find(arr, 5);
    }
}