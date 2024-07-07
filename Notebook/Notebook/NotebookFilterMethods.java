package Notebook.Notebook;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class NotebookFilterMethods {
    public static List<Notebook> filterNotebooks(List<Notebook> notebooks, Map<String, Object> criteria) {
        return notebooks.stream().filter(notebook -> {
            boolean matches = true;
            if (criteria.containsKey("RAM")) {
                matches &= notebook.getRam() >= (int) criteria.get("RAM");
            }
            if (criteria.containsKey("HDD")) {
                matches &= notebook.getHdd() >= (int) criteria.get("HDD");
            }
            if (criteria.containsKey("OS")) {
                matches &= notebook.getOs().equals(criteria.get("OS"));
            }
            if (criteria.containsKey("Color")) {
                matches &= notebook.getColor().equals(criteria.get("Color"));
            }
            return matches;
        }).collect(Collectors.toList());
    }
}

