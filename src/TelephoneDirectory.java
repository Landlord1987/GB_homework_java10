import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class TelephoneDirectory {

    public static void main(String[] args) {

        String[] telephoneDirectory = {
                "Панкратов 89993361772",
                "Панкратов 89963221782",
                "Семин 89518845036",
                "Семин 89325562876"
        };

        statisticTD(telephoneDirectory);

    }

    public static void statisticTD(String[] telephoneDirectory) {
        HashMap<String, ArrayList<TD>> statisticTD = new HashMap<>();

        for (String a : telephoneDirectory) {
            String[] parts = a.split(" ");

            if (statisticTD.containsKey(parts[0])) {
                ArrayList<TD> lst = statisticTD.get(parts[0]);
                lst.add(new TD(parts[0], parts[1]));

            } else {
                ArrayList<TD> lst = new ArrayList<>();
                lst.add(new TD(parts[0], parts[1]));
                statisticTD.put(parts[0], lst);
            }
        }

        for (Map.Entry<String, ArrayList<TD>> item : statisticTD.entrySet()) {
            System.out.print("\n" + item.getKey() + ":");

            for (TD td : item.getValue()) {
                System.out.printf("\nТел. %s", td.getNumber());
            }

        }
    }

    public static class TD {

        String surname;
        String number;

        public String getSurname() {
            return surname;
        }

        public String getNumber() {
            return number;
        }

        public TD(String surname, String number) {
            this.surname = surname;
            this.number = number;
        }
    }
}
