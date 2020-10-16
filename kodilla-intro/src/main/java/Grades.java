public class Grades {

    public static void main(String[] args) {
        Grades grades = new Grades();
        grades.add(2);
        grades.add(3);
        grades.add(4);
        grades.add(5);
        grades.add(6);
        grades.add(3);
        grades.add(1);
        System.out.println("Ilość dodanych ocen do tablicy to: " + grades.size);
        System.out.println("Ostatnio dodana ocena to: " + grades.lastAddedGrade());
        System.out.println("Średnia ocen w tablicy to: " + grades.AverageOfGrades());

    }

    private int[] grades;           // stworzenie tablicy przechowującej zmienne 'grades'
    private int size;               // zmienna określająca ilość aktualnych elementów w tablicy

    public Grades() {
        this.grades = new int[10];  // zdefiniowanie ilości elementów w tablicy [10]
        this.size = 0;              // ustalenie początkowego stanu tablicy na '0' - czyli jest pusta, nie zawiera żadnych elementów
    }

    public void add(int value) {     // pierwsza metoda - dodająca przekazaną w argumencie ocenę do tablicy
        if (this.size == 10) {      //jeśli tablica ma już '10' elementów to
            return;                 //następuje przerwanie działania 'return' dodawania nowych elementów do tablicy
        }
        this.grades[this.size] = value;     //do tablicy na indeksie równym obecnemu rozmiarowi 'this.size' dodajemy nową wartość 'value' otrzymaną jako argument metody
        this.size++;                        //zwiększamy liczbę elementów tablicy
    }

    public double lastAddedGrade() {           //druga metoda - zwraca ostanio dodaną wartość z tablicy
        int result = this.grades[this.size-1];
        return result;
    }

    public float AverageOfGrades() {       //trzecia metoda - zwraca średnią wszystkich ocen z tablicy
        int sum = 0;
        for(int i = 0; i < size; i++) {
            sum += this.grades[i];
        }
        float average = sum / this.size;
        return average;
    }
}
