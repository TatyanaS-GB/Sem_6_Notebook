package Notebook.Notebook;



import java.util.*;

public class NotebookFilter {
    public static void main(String[] args) {
        Notebook notebook1 = new Notebook(1, 8, 256, "Windows", "Black");
        Notebook notebook2 = new Notebook(2, 16, 512, "Windows", "White");
        Notebook notebook3 = new Notebook(3, 16, 512, "Linux", "Black");
        Notebook notebook4 = new Notebook(4, 32, 1024, "Linux", "White");
        Notebook notebook5 = new Notebook(5, 64, 1024, "MacOS", "Silver");

        Set<Notebook> notebooks = new LinkedHashSet<>(Arrays.asList(notebook1, notebook2, notebook3, notebook4, notebook5));
        for (Notebook notebook : notebooks)
            System.out.println(notebook);


        Map<String, String> criteria = new HashMap<>();
        criteria.put("1", "RAM");
        criteria.put("2", "HDD");
        criteria.put("3", "OS");
        criteria.put("4", "Color");

        Map<String, Object> minValues = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose a criteria for filtering: ");
        for (Map.Entry<String, String> entry : criteria.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
        System.out.println("Введите число от 1 до 4: ");

        String choice = scanner.nextLine();

        switch (choice) {
            case "1":
                int minRam = RamCriteria.getMinRam();
                minValues.put("RAM", minRam);
                break;
            case "2":
                int minHdd = HddCriteria.getMinHdd();
                minValues.put("HDD", minHdd);
                break;
            case "3":
                String os = OsCriteria.getOs();
                minValues.put("OS", os);
                break;
            case "4":
                String color = ColorCriteria.getColor();
                minValues.put("Color", color);
                break;
        }

        List<Notebook> filteredNotebooks = NotebookFilterMethods.filterNotebooks(new ArrayList<>(notebooks), minValues);
        System.out.println("Filtered Notebooks: ");
        for (Notebook notebook : filteredNotebooks) {
            System.out.println(notebook);
        }
    }
}
