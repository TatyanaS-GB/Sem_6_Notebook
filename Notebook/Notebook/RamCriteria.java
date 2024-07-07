package Notebook.Notebook;
import java.util.Scanner;

public class RamCriteria {
    public static int getMinRam() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the minimum RAM size 8, 16, 32, 64 (in GB):");
        return scanner.nextInt();
    }
}