public class Osoba {
    /*
    // Kod strukturalny
    public static void main(String[] args) {
        String name = "Adam";
        double age = 40.5;
        double height = 178;

        if (name != null) {
            if (age > 30 && height > 160) {
                System.out.println("User is older than 30 and higher than 160cm");
            } else {
                System.out.println("User is 30 (or younger) or 160cm (or shorter)");
            }
        }
    }
     */

        // Poniżej Kod o cechach obiektowych

        String name;        //zdefiniowanie typu zmiennych
        double age;
        double height;

        public Osoba (String name, double age, double height) {     //zdefiniowanie konstruktora ze zmiennymi 'name', 'age', 'height'
            this.name = name;
            this.age = age;
            this.height= height;
        }

        public static void main(String[] args) {
            Osoba adam = new Osoba ("Adam", 40.5, 178);     //definiuję nowy obiekt Osoba - adam

            Osoba[] osoby = {adam};      //stworzenie tablicy z imionami userow

            for (int i = 0; i < osoby.length; i++) {
                if (osoby[i].age > 30 && osoby[i].height > 160) {
                    System.out.println("User is older than 30 and higher than 160cm");
                } else {
                    System.out.println("User is 30 (or younger) or 160cm (or shorter)");
                }
            }
        }
    }
