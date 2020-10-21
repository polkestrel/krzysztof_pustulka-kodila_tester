import java.util.Scanner;

public class Colours {

    private static ColoursName colours;

    enum ColoursName {
        B,  //Blue
        Y,  //Yellow
        G,  //Green
    }

    public static void main(String[] args) {
        try {
            colours = ColoursName.valueOf(getColoursName());
        } catch (IllegalArgumentException ex) {
            System.out.println("Wrong letter. Try again.");
            colours = ColoursName.valueOf(getColoursName());
        }

        switch (colours) {
            case B: System.out.println("Blue");
                break;
            case Y: System.out.println("Yellow");
                break;
            case G: System.out.println("Green");
                break;
            default: System.out.println("Wrong colour name. Try again");
        }
    }

    public static String getColoursName() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Try to type only the first letter of your favourite colour. Then wait and see what's gonna happen. Interested ? Ok, let's go. Please type a letter: ");
        String colour = scanner.nextLine().trim().toUpperCase();
        return colour;
    }
}