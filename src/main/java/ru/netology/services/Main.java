package ru.netology.services;

public class Main {
    public static void main(String[] args) {
        VacationService service = new VacationService();


        int vacationDays = service.calculate(10_000, 3_000, 20_000);

        System.out.println(vacationDays);

    }
}