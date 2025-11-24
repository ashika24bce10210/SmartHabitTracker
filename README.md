# Smart Habit Tracker (Java)

**Project type:** Console-based Java application  
**Language:** Java

## Overview
Smart Habit Tracker is a small Java console application to record daily habits and track consistency.
It demonstrates Object Oriented concepts, Collections, File based persistence (serialization), and basic
exception handling meeting the course requirements.

## Features
 1.Add / Remove habits
 2.Mark habit done for today
 3.Show all habits with total completions and current streak
 4.Save and load data from a local file (`habits.dat`)

## Technologies / Tools Used
1.Java 8+ / Java 11 – Core programming language
2.Collections Framework – For managing habits (Map, Set)
3.Java Serialization – For saving and loading data
4.LocalDate API – To record daily completions
5.Exception Handling – For safe file I/O operations
6.Git & GitHub – Version control and project hosting
7.VS Code / IntelliJ (optional) – For development

## How to compile and run
1. Open terminal in `src` folder  
2. Compile:
   ```
   javac com/vityarthi/smarthabit/*.java
   ```
3. Run:
   ```
   java com.vityarthi.smarthabit.Main
   ```
## Instructions for Testing
To verify that the project works correctly, follow these test steps:
1.Add a Habit
Select option 1
Enter a habit name, e.g., “Drink Water”
Enter a description
Expected result: Habit should appear in the habit list
2.Mark Habit Done
Select option 4
Enter the same habit name
Expected result: Program should confirm “Marked done for today.”
3.List Habits
Select option 3
Expected result: You should see the habit along with:
Total completions
Current streak
4.View Habit Details
Select option 5
Expected result: Shows name, description, total completions, streak count
5.Remove a Habit
Select option 2
Enter habit name
Expected result: Habit is removed from the list
6.Save & Restart Testing
Press 6 to save
Run the program again
Expected result: Previously added habits reappear (data persistence works)
