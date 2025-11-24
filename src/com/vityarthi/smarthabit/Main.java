package com.vityarthi.smarthabit;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        HabitManager manager = new HabitManager();
        manager.loadFromFile(); // load saved habits if any
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("\n=== SMART HABIT TRACKER ===");
            System.out.println("1. Add Habit");
            System.out.println("2. Remove Habit");
            System.out.println("3. List Habits");
            System.out.println("4. Mark Habit Done (today)");
            System.out.println("5. Show Habit Details");
            System.out.println("6. Save & Exit");
            System.out.print("Choose: ");
            String choice = sc.nextLine().trim();
            switch (choice) {
                case "1": manager.addHabitInteractive(sc); break;
                case "2": manager.removeHabitInteractive(sc); break;
                case "3": manager.listHabits(); break;
                case "4": manager.markHabitDoneInteractive(sc); break;
                case "5": manager.showHabitDetailsInteractive(sc); break;
                case "6":
                    manager.saveToFile();
                    System.out.println("Saved. Goodbye!");
                    sc.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}
