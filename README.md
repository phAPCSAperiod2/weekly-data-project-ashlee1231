[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-22041afd0340ce965d47ae6ef1cefeee28c7c493a6346c4f15d667ab976d596c.svg)](https://classroom.github.com/a/jLmsEuC8)
[![Open in Codespaces](https://classroom.github.com/assets/launch-codespace-2972f46106e565e64193e422d61a12cf1da4916b45550586e14ef0a7c637dd04.svg)](https://classroom.github.com/open-in-codespaces?assignment_repo_id=22208098)
# AP CSA Project: Weekly Data Analyzer  

---

## 📌 Project Overview

In this project, you will design and build a **Weekly Data Analyzer** in Java. Your program will allow a user to enter **7 days of data** for something meaningful to them—such as steps taken, hours of sleep, money spent, mood ratings, screen time, or another approved idea.

Your program will store this data in an **array**, analyze it using **array algorithms**, and present useful results to the user. You will apply **object-oriented programming (OOP)** principles by creating a custom data class that encapsulates both the data and the logic used to analyze it.

This project simulates how developers build **reusable, well-structured code** that separates:
- Data storage  
- Data processing  
- User interaction  

---

## 🎯 Learning Goals

By completing this project, you will demonstrate that you can:

- Declare and use arrays to store related data  
- Develop array algorithms (total, average, minimum, maximum, etc.)  
- Apply encapsulation using private instance variables and public methods    
- Write clean, readable Java code with clear method responsibilities  
- Format output for readability  

---

## 🧠 Choose Your Data Theme

You may choose **any type of weekly data**, as long as it meets the project requirements.

### Example Ideas  
(You may use these or create your own)

- Step Counter (steps per day)  
- Sleep Tracker (hours of sleep per night)  
- Budget Analyzer (money spent per day)  
- Study Time Tracker (minutes studied per day)  
- Mood Tracker (ratings 1–10)  
- Screen Time Tracker (hours per day)  
- etc

---

## 🧩 Program Structure & Requirements

Your project must include **two main classes**.

---

## 📦 Data Class (Your Custom Class)

You may name this class based on your project theme  
(e.g., `StepData`, `SleepData`, `BudgetData`, etc.)

### 🔒 Instance Variables (private)

- An array representing **7 days of data**
- Additional instance variables as needed (e.g., total, min, max)

---

### 🏗 Constructor

- Accepts an array as a parameter  
- Creates an internal array of the same size  
- Copies values into the internal array  

⚠️ **Do NOT use reference aliasing**  
(The internal array must be a deep copy.)

---

### ✅ Required Methods

Your class **must** include methods that calculate:

- `getTotal()`  
- `getAverage()`  
- `getHighest()` (maximum)  
- `getLowest()` (minimum)  

You may include additional methods if they make sense for your data.

---

### 🖨 `toString()` Method

- Returns a **multi-line `String`**
- Displays all **7 days of data**
- Values should be formatted **clearly and consistently**

---

## 🧪 Main Class (User Interaction & Testing)

The `Main` class is responsible for:

- Creating an array for **7 days of data**
- Prompting the user for input using a `for` loop  
- Validating input using a `while` loop (no invalid values allowed)  
- Creating an object of your Data class  
- Calling methods to display results clearly  

---

## 📋 Required Output

Your program must display:

- Total for the week  
- Average per day  
- Highest value  
- Lowest value  
- All daily values (using `toString()`)
- Valuable insights the user would want about their data

All numeric output should be **formatted appropriately**  
(e.g., two decimal places if needed).

---

## ✅ Project Checklist

Before submitting, confirm that:

- [ ] You used an array to store 7 days of data  
- [ ] The array is private and encapsulated in a class  
- [ ] All calculations use loops (no hard-coded math)  
- [ ] Input is validated using a `while` loop 
- [ ] Methods return correct results for typical and edge cases  
- [ ] Output is clean, readable, and clearly labeled  
- [ ] Code compiles and runs without errors
- [ ] Code is appriately commented with JavaDoc comments 

---

## 🛠 How to Run the Project

1. Accept the assignment in GitHub classroom
2. Open the project codespaces or clone repository using GitHub Deskopt / VS Code
3. Complete your **Data class** first  
4. Implement the **Main class** to test your logic  
5. Run the program and verify correct output  

---

## 🧪 Sample Output  
### Example: Screen Time Tracker
Enter screentime hours for Monday: 2.5
Enter screentime hours for Tuesday: 3.0
Enter screentime hours for Wednesday: 2.8
Enter screentime hours for Thursday: 4.0
Enter screentime hours for Friday: 1.5
Enter screentime hours for Saturday: 5.0
Enter screentime hours for Sunday: 3.2

Weekly Summary:
Total Screentime: 22.0 hours
Average Screentime: 3.14 hours
Highest Day: 5.0 hours
Lowest Day: 1.5 hours

All Daily Values:
Day 1: 2.5
Day 2: 3.0
Day 3: 2.8
Day 4: 4.0
Day 5: 1.5
Day 6: 5.0
Day 7: 3.2

Results:
You spent 2.0 hours over your weekly screentime goal. Try to cut back next week!

---

## 🌟 Optional Extensions (Extra Challenge)

- Add a method like `getMedian()` or `getDayOfHighest()`  
- Allow the user to choose the number of days  
- Label days by name (Mon–Sun)  
- Track multiple weeks using a **2D array**  
- Add a simple menu system  

---

## � Author Information

- **Name:** Ashlynn Kirchoff
- **Project Theme:** Screen Time Tracker
- **Description:** This program helps users track and analyze their weekly screen time. It prompts for a weekly goal and daily screen time hours, then provides statistics like total, average, max, and min screen time, along with a comparison to the goal.

---

## �📄 Submission Instructions

You must:

- Push your completed code to this GitHub repository  
- Update this README to include:
  - Your name  
  - Your chosen project theme  
  - A short description of your program



