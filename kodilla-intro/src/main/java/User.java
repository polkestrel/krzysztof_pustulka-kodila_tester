import javax.naming.Name;
import java.util.NavigableMap;

public class User {

    String userName;                            //zdefiniowanie typu zmiennych 'imię' i 'wiek'
    int userAge;

    public User (String userName, int userAge) {        //defincja konstruktora odwołującego się do zmiennych 'wiek' i 'imie'
        this.userName = userName;
        this.userAge = userAge;
    }

    public static void main(String[] args) {

        User krzysztof = new User("Krzysztof", 40);         //zdefiniowanie nowych obiektów zawierających dwa parametry 'Imię' i 'Wiek'
        User anna = new User("Anna", 36);
        User mariusz = new User("Mariusz", 39);
        User waldek = new User("Waldek", 50);
        User marek = new User("Marek", 49);
        User stas = new User("Staś", 7);
        User antek = new User("Antek", 5);

        User[] users = {krzysztof, anna, mariusz, waldek, marek, stas, antek};      //stworzenie tablicy z imionami userow

        int result = 0;
        for (int i = 0; i < users.length; i++) {        //petla do wyliczenia sumy iweku wszystkich userow
            result = result + users[i].userAge;
        }   System.out.println("Suma wieku wszystkich user'ow wynosi: " + result);

        int numberOfUsers = users.length;
            System.out.println("Ilosc wszystkich user'ow wynosi: " + numberOfUsers);
        int average = result/numberOfUsers;
            System.out.println("Srednia wieku wszystkich user'ow wynosi: " + average);


        for (int i = 0; i < users.length; i++) {     //petla do sprawdzania który user ma wiek mniejszy od średniej wieku wszystkich userow
            if (users[i].userAge < average) {
                System.out.println("User: " + users[i].userName + " ma " + users[i].userAge + " lat i jego wiek jest niższy od średniej wieku wszystkich userow wynoszącej: " + average);
            }
            else {}
        }
    }
}
