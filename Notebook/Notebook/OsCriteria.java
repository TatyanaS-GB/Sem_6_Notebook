package Notebook.Notebook;

import java.util.Scanner;

public class OsCriteria {
    public static String getOs() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the operating system (Windows, Linux, MacOS):");
        return scanner.nextLine();
    }
}
