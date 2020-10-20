import java.util.Scanner;

public class UserDialogs {
    public static String getUsername() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Enter your name:");
            String name = scanner.nextLine().trim();
            if (name.length() >= 2) {
                return name;
            }
            System.out.println("Name is too short. Try again.");
        }
    }

    /*
    Bezpośrednio po instrukcji switch w nawiasie podajemy wyrażenie,
    którego wartość chcemy sprawdzać.
    Następnie w nawiasie klamrowym umieszczamy sekwencję poleceń case,
    które oznaczają poszczególne przypadki.
    Po każdym słowie case następuje wartość,
    oraz po dwukropku instrukcja która ma zostać wykonana w sytuacji,
    gdy sprawdzane wyrażenie (tu – wartość zapisana w zmiennej calc)
    będzie miało wartość zgodną z wartością wymienioną po słowie case.

    Instrukcja switch może mieć też akcję domyślną, wykonywaną w sytuacji,
    gdy żaden z przypadków wymienionych przy case nie wystąpił.
    Tę instrukcję nazywamy przypadkiem domyślnym i oznaczamy słowem default.
     */


    public static String getUserSelection() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Select calculation (A-add, S-subtract, D-divide, M-multiply):");
            String calc = scanner.nextLine().trim().toUpperCase();
            switch (calc) {
                case "A": return "ADD";
                case "S": return "SUB";
                case "D": return "DIV";
                case "M": return "MUL";
                default:
                    System.out.println("Wrong calculation. Try again.");
            }
        }
    }

    public static int getValue() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number:");
        int val = scanner.nextInt();
        return val;
    }
}
