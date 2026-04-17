package DaysOfMonth;

import java.util.Scanner;

public class DaysOfMonth {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        String[] fullNames = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        String[] abbreviations = {"Jan.", "Feb.", "Mar.", "Apr.", "May", "June", "July", "Aug.", "Sept.", "Oct.", "Nov.", "Dec."};
        String[] threeLetters = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
        String[] numbers = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12"};

        int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        while (true) {
            System.out.print("Please enter a month (full name, abbreviation, 3 letters, or number): ");
            String monthInput = keyboard.nextLine().trim();
            
            System.out.print("Please enter a year: ");
            String yearInput = keyboard.nextLine().trim();

            int year = -1;
            try {

                year = Integer.parseInt(yearInput);
            } catch (NumberFormatException e) {

            }
            
            if (year < 0) {
                System.out.println("Invalid year. Please enter a valid non-negative year.\n");
                continue;
            }

            int monthIndex = -1;
            for (int i = 0; i < 12; i++) {

                if (monthInput.equalsIgnoreCase(fullNames[i]) ||
                    monthInput.equalsIgnoreCase(abbreviations[i]) ||
                    monthInput.equalsIgnoreCase(threeLetters[i]) ||
                    monthInput.equals(numbers[i])) {
                    
                    monthIndex = i;
                    break;
                }
            }
            
            if (monthIndex == -1) {
                System.out.println("Invalid month. Please try again.\n");
                continue; 
            }

            boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
            
            int days = daysInMonth[monthIndex];

            if (monthIndex == 1 && isLeapYear) {
                days = 29;
            }

            System.out.println(fullNames[monthIndex] + " " + year + " has " + days + " days.");
            break; 
        }
        
        keyboard.close();
    }
}