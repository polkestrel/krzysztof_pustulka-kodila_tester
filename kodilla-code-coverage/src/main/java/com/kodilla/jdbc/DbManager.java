package com.kodilla.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DbManager {
    private Connection conn;                                 // [1]
    private static DbManager dbManagerInstance;              // [2]

    private DbManager() throws SQLException {                // [3]
        Properties connectionProps = new Properties();        // [4]
        connectionProps.put("user", "kodilla_user");          // [5]
        connectionProps.put("password", "kodilla_password");  // [6]
        conn = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/kodilla_tester?serverTimezone=Europe/Warsaw"
                        + "&useSSL=False",
                connectionProps);             // [7]
    }                                                       // [8]

    public static DbManager getInstance() throws SQLException {  // [9]
        if (dbManagerInstance == null) {                          // [10]
            dbManagerInstance = new DbManager();                   // [11]
        }                                                         // [12]
        return dbManagerInstance;                                 // [13]
    }                                                           // [14]

    public Connection getConnection() {                          // [15]
        return conn;                                             // [16]
    }                                                            // [17]
}
//
//    W liniach [1] i [2] znajdują się deklaracje pól klasy:
//
//        pole conn typu Connection przechowujące referencję do obiektu reprezentującego połączenie do bazy danych.
//        Connection jest interfejsem dostarczanym przez bibliotekę java.sql.
//        Interfejs ten udostępnia szereg metod związanych z zadawaniem zapytań do bazy danych oraz obsługą połączenia.
//        pole dbManagerInstance przechowujące referencję do instancji klasy DbManager –
//        potrzebne jest nam ono po to, aby w pamięci komputera dostępna była zawsze
//        tylko jedna instancja obiektu klasy DbManager.
//        W liniach [3]-[8] znajduje się definicja konstruktora klasy DbManager.
//        Konstruktor ten jest prywatny – nie ma więc możliwości wywołania go spoza metod klasy DbManager.
//        Jest on celowo "ukryty", aby uniemożliwić użytkownikowi
//        (w tym przypadku innemu programiście wykorzystującemu nasz kod) samodzielne jego wywoływanie.
//        Klasa DbManager sama zarządza powoływaniem do życia swojej instancji,
//        przy pomocy metody getInstance() zdefiniowanej w liniach [9]-[14] (zgodnie ze wzorcem Singleton).
//
//        Przyjrzyjmy się teraz samemu konstruktorowi:
//
//        W linii [4] tworzymy obiekt klasy Properties (dostarczanej przez bibliotekę java.util).
//        Klasa Properties jest bardzo podobna do kolekcji HashMap –
//        przechowuje pary wartości klucz-wartość (ang. key-value). Jeżeli chcesz dowiedzieć się o niej więcej,
//        sięgnij do dokumentacji. Przydatną cechą obiektów tej klasy jest możliwość zapisywania i
//        odczytywania wartości właściwości z plików .properties.
//
//        Linie[5] i [6] ustawiają wartość właściwości user oraz password –
//        są to wartości zdefiniowane przez nas wcześniej podczas tworzenia użytkownika w bazie danych.
//
//        W linii [7] tworzymy połączenie do bazy danych przy pomocy statycznej metody
//        getConnection(String url, Properties info) klasy DriverManager dostarczanej przez bibliotekę java.sql.
//        Pierwszy parametr tej metody (url) to tak zwany "connection string". Poszczególne jego części oznaczają:
//
//        stały tekst jdbc:mysql:// mówiący o tym, że korzystamy ze sterownika jdbc właściwego dla bazy danych MySQL,
//        serwer i port: localhost:3306/,
//        baza danych na tym serwerze, o którą nam chodzi: kodilla_tester,
//        strefa czasowa, w jakiej działa serwer: ?serverTimezone=Europe/Warsaw,
//        parametr &useSSL=False wyłączający używanie protokołu SSL (w przeciwnym razie potrzebowalibyśmy certyfikatów do nawiązania połączenia).
//        Drugi z parametrów (info) to obiekt typu Properties. Obiekt ten w najprostszej, używanej przez nas,
//        postaci zawiera nazwę i hasło użytkownika.
//
//        W liniach [9] - [14] znajduje się definicja metody getInstance(),
//        która tworzy (w razie potrzeby – gdy nie był wcześniej utworzony) i udostępnia obiekt klasy DbManager.
//        Metoda ta stosuje podejście tzw. leniwej inicjalizacji (ang. lazy instantiating),
//        czyli tworzy obiekt dopiero wtedy, gdy jest on potrzebny, tj. przy pierwszym wywołaniu tej metody.
//
//        W liniach [15]-[17] znajduje się definicja metody getConnection(), która zwraca obiekt klasy Connection,
//        czyli obiekt przechowujący połączenie z bazą danych – będziemy używali go do tworzenia zapytań do bazy danych