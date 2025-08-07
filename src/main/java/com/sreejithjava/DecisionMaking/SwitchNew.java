package com.sreejithjava.DecisionMaking;

import java.util.Scanner;

public class SwitchNew {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the day of the week :");
        String day = input.nextLine();
        String alarm;
        alarm = switch (day) {
            case "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" -> "Wake up at 7 AM";
            case "Saturday", "Sunday" -> "Wake up at 8 AM";
            default -> "Invalid day";
        };
        System.out.println("Alarm for " + day + ": " + alarm);

        System.out.println("Enter the day of the week :");
        day = input.nextLine();
        alarm = switch (day) {
            case "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" :  {
                System.out.println("Setting alarm for weekday");
                yield "Wake up at 7 AM";
            }
            case "Saturday", "Sunday" :  {
                System.out.println("Setting alarm for weekend");
                yield "Wake up at 8 AM";
            }
            default :  {
                System.out.println("Invalid day entered");
                yield "Invalid day";
            }
        };
        System.out.println("Alarm for " + day + ": " + alarm);
    }
}
