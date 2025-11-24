package com.vityarthi.smarthabit;

import java.io.*;
import java.time.LocalDate;
import java.util.*;

public class HabitManager {
    private Map<String, Habit> habits;
    private final String SAVE_FILE = "habits.dat";

    public HabitManager() {
        habits = new TreeMap<>(String.CASE_INSENSITIVE_ORDER);
    }

    public void addHabitInteractive(Scanner sc) {
        System.out.print("Enter habit name: ");
        String name = sc.nextLine().trim();
        if (name.isEmpty()) {
            System.out.println("Name cannot be empty.");
            return;
        }
        if (habits.containsKey(name)) {
            System.out.println("Habit already exists.");
            return;
        }
        System.out.print("Enter description: ");
        String desc = sc.nextLine().trim();
        Habit h = new Habit(name, desc);
        habits.put(name, h);
        System.out.println("Added: " + name);
    }

    public void removeHabitInteractive(Scanner sc) {
        System.out.print("Enter habit name to remove: ");
        String name = sc.nextLine().trim();
        if (habits.remove(name) != null) System.out.println("Removed: " + name);
        else System.out.println("No such habit.");
    }

    public void listHabits() {
        if (habits.isEmpty()) {
            System.out.println("No habits yet.");
            return;
        }
        System.out.println("\nYour habits:");
        int i = 1;
        for (Habit h : habits.values()) {
            System.out.println(i++ + ". " + h.toString());
        }
    }

    public void markHabitDoneInteractive(Scanner sc) {
        System.out.print("Enter habit name to mark done today: ");
        String name = sc.nextLine().trim();
        Habit h = habits.get(name);
        if (h == null) { System.out.println("No such habit."); return; }
        h.markDone(LocalDate.now());
        System.out.println("Marked done for today.");
    }

    public void showHabitDetailsInteractive(Scanner sc) {
        System.out.print("Enter habit name to view details: ");
        String name = sc.nextLine().trim();
        Habit h = habits.get(name);
        if (h == null) { System.out.println("No such habit."); return; }
        System.out.println("\n" + h.getName());
        System.out.println("Description: " + h.getDescription());
        System.out.println("Total completions: " + h.totalCompletions());
        System.out.println("Current streak: " + h.currentStreak());
    }

    @SuppressWarnings("unchecked")
    public void loadFromFile() {
        File f = new File(SAVE_FILE);
        if (!f.exists()) return;
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(f))) {
            habits = (Map<String, Habit>) ois.readObject();
            System.out.println("Loaded " + habits.size() + " habits.");
        } catch (Exception e) {
            System.out.println("Failed to load save file: " + e.getMessage());
        }
    }

    public void saveToFile() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(SAVE_FILE))) {
            oos.writeObject(habits);
            System.out.println("Saved " + habits.size() + " habits to file.");
        } catch (IOException e) {
            System.out.println("Save failed: " + e.getMessage());
        }
    }
}
