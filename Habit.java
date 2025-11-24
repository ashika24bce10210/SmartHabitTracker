package com.vityarthi.smarthabit;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

public class Habit implements Serializable {
    private static final long serialVersionUID = 1L;
    private String name;
    private String description;
    private Set<LocalDate> doneDates;

    public Habit(String name, String description) {
        this.name = name;
        this.description = description;
        this.doneDates = new HashSet<>();
    }

    public String getName() { return name; }
    public String getDescription() { return description; }

    public void markDone(LocalDate date) { doneDates.add(date); }
    public boolean isDoneOn(LocalDate date) { return doneDates.contains(date); }
    public int totalCompletions() { return doneDates.size(); }

    // simple streak: consecutive days ending today
    public int currentStreak() {
        int streak = 0;
        LocalDate d = LocalDate.now();
        while (doneDates.contains(d)) {
            streak++;
            d = d.minusDays(1);
        }
        return streak;
    }

    @Override
    public String toString() {
        return name + " - " + description + " | Total completions: " + totalCompletions()
                + " | Current streak: " + currentStreak();
    }
}
