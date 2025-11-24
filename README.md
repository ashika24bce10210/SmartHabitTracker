# Smart Habit Tracker (Java)

**Project type:** Console-based Java application  
**Language:** Java

## Overview
Smart Habit Tracker is a small Java console application to record daily habits and track consistency.  
It demonstrates Object Oriented concepts, Collections, File-based persistence (serialization), and basic exception handling — meeting the course requirements.

---

## Features
- Add / Remove habits  
- Mark habit done for today  
- Show all habits with total completions and current streak  
- Save and load data from a local file (`habits.dat`)  

---

## Technologies / Tools Used
- **Java 8+ / Java 11** – Core programming language  
- **Collections Framework** – For managing habits (Map, Set)  
- **Java Serialization** – For saving and loading data  
- **LocalDate API** – To record daily completions  
- **Exception Handling** – For safe file I/O operations  
- **Git & GitHub** – Version control and project hosting  
- **VS Code / IntelliJ (optional)** – For development  

---

## How to compile and run

1. Open terminal in the `src` folder  
2. Compile:
   ```
   javac com/vityarthi/smarthabit/*.java
   ```
3. Run:
   ```
   java com.vityarthi.smarthabit.Main
   ```

---

## Instructions for Testing

To verify that the project works correctly, follow these steps:

### **1. Add a Habit**
- Select option **1**
- Enter a habit name (e.g., *Drink Water*)
- Enter a description  
**Expected:** Habit appears in the habit list.

---

### **2. Mark Habit Done**
- Select option **4**
- Enter the habit name  
**Expected:** Program shows “Marked done for today.”

---

### **3. List Habits**
- Select option **3**  
**Expected:**  
Displays habit name, total completions, current streak.

---

### **4. View Habit Details**
- Select option **5**  
**Expected:**  
Shows description, total completions, and streak count.

---

### **5. Remove a Habit**
- Select option **2**  
- Enter habit name  
**Expected:** Habit is removed.

---

### **6. Save & Restart to Test Persistence**
- Select option **6** (Save & Exit)  
- Run program again  
**Expected:**  
Habits load automatically from `habits.dat`.

---

## Notes
- This project is designed to be lightweight and easy to run on any system with Java installed.  
- Data persistence uses Java’s built-in serialization and creates a `habits.dat` file automatically.  
