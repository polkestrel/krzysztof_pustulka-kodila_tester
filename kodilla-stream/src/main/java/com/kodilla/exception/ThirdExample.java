package com.kodilla.exception;

public class ThirdExample {
    public static void main(String[] args) {
        AirportRepository airportRepository = new AirportRepository();
        try {
            boolean isViennaInUse = airportRepository.isAirportInUse("Vienna");
            System.out.println("Vienna status: " + isViennaInUse);
        } catch (AirportNotFoundException e) {
            System.out.println("Sorry,this airport cannot be served by our airlines.");
        } finally {
            System.out.println("Thank you for using Kodilla Airlines");
        }
    }
    /*
    Umieszczenie dodatkowego bloku o nazwie 'finally' zapewnia, że linia nr 12 wykona się bez względu na to,
    czy w kodzie otoczonym blokiem 'try' wystąpi jakiś wyjątek, czy też nie.
    Jest to rozwiązane używane często do zwalniania zasobów zaalokowanych w bloku
    'try', np. do pozamykania otwartych plików, do zwolnienia otwartego połączenia
    do bazy danych itp.
     */
}
