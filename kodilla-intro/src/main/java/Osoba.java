public class Osoba {


        String name;
        double age;
        double height;

        public Osoba (String name, double age, double height) {
            this.name = name;
            this.age = age;
            this.height= height;
        }

        public static void main(String[] args) {
            Osoba adam = new Osoba ("Adam", 40.5, 178);

            Osoba[] osoby = {adam};

            for (int i = 0; i < osoby.length; i++) {
                if (osoby[i].age > 30 && osoby[i].height > 160) {
                    System.out.println("User is older than 30 and higher than 160cm");
                } else {
                    System.out.println("User is 30 (or younger) or 160cm (or shorter)");
                }
            }
        }
    }
