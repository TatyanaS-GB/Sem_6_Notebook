package Notebook.Notebook;

import java.util.Scanner;

public class ColorCriteria {
    public static String getColor() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the color (Black, White, Silver): ");
        return scanner.nextLine();
    }
}
