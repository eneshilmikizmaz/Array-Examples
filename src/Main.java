import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AverageOfElements elements = new AverageOfElements();
        int [] arr = {14,22,34,5,3,5,9};
        System.out.println("Harmonik Ortalama : " + elements.harmonicAvr(arr));
    }
}