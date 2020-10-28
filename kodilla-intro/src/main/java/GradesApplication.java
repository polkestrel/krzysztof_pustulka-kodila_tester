public class GradesApplication {

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
}
