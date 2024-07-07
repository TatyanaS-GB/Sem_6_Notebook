package Notebook.Notebook;

import java.util.Scanner;

public class HddCriteria {
    public static int getMinHdd() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the minimum HDD size 256, 512, 1024(in GB):");
        return scanner.nextInt();
    }
}
