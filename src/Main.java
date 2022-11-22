import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        String[] arr = {"Денис", "Василий", "Егор", "Денис", "Антон", "Александр", "Василий", "Антон", "Денис", "Андрей"};

        statistic(arr);
    }

    public static void statistic(String[] arr) {
        HashMap<String, ArrayList<NameEditor>> statistic = new HashMap<>();

        for (String a : arr) {
            if (statistic.containsKey(a)) {
                ArrayList<NameEditor> lst = statistic.get(a);
                lst.add(new NameEditor(a));

            } else {
                ArrayList<NameEditor> lst = new ArrayList<>();
                lst.add(new NameEditor(a));
                statistic.put(a, lst);
            }
        }

        for (Map.Entry<String, ArrayList<NameEditor>> item : statistic.entrySet()) {
            System.out.print(item.getKey());
            int counter = 0;
            for (NameEditor nameEditor : item.getValue()) {
                counter++;
            }
            System.out.printf(" - встречается %d раза в массиве\n", counter);
        }
    }
}