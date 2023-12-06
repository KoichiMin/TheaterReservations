package com.pluralsight;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class TheaterReservations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter your name: ");
        String fullName = scanner.nextLine();
        String[] splitName = fullName.split(" ");

        System.out.print("What date will you be coming(MM/dd/yyyy): ");
        String dateOfConfirmation = scanner.nextLine();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        LocalDate reservationDate = LocalDate.parse(dateOfConfirmation, formatter);
        System.out.print("How many tickets would you like? ");
        int numTickets = scanner.nextInt();

        System.out.print(numTickets + " tickets reserved for " + reservationDate + " under " + splitName[1] + ", " + splitName[0]);

    }
}
