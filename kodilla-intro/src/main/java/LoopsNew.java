public class LoopsNew {
    public static void main(String[] args) {

        int[] numbers = {100, 5, 6, 5, 9};

        int summation = 0;

        for(int i=0; i < numbers.length; i++) {
            summation += numbers[i];
        }

        System.out.println("Suma liczb w tablicy: " + summation);

    }
}