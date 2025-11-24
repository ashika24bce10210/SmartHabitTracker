# Smart Habit Tracker (Java)

**Project type:** Console-based Java application  
**Language:** Java 11+ (uses serialization for storage)  
**Author:** Ashika Ojha

## Overview
Smart Habit Tracker is a small Java console application to record daily habits and track consistency.
It demonstrates Object-Oriented concepts, Collections, File-based persistence (serialization), and basic
exception handling — meeting the course requirements.

## Features
- Add / Remove habits
- Mark habit done for today
- Show all habits with total completions and current streak
- Save and load data from a local file (`habits.dat`)

## How to compile and run
1. Open terminal in `src` folder (project root has `src`).
2. Compile:
   ```
   javac com/vityarthi/smarthabit/*.java
   ```
3. Run:
   ```
   java com.vityarthi.smarthabit.Main
   ```

## Files
- `src/com/vityarthi/smarthabit/*.java` - source code
- `habits.dat` - binary save file (created after first save)
- `README.md`, `statement.md`, `project_report.txt` - docs

## Notes
- This is intentionally console-based to match the assignment constraints and keep dependencies minimal.
- The save file `habits.dat` is created in the working directory when you save.
