# 📱 Simple Calculator App (Android)

A clean and beginner-friendly Android calculator built using **Kotlin + XML layouts**.
This app supports basic arithmetic operations and demonstrates clean architecture with separated logic and responsive UI.

---

## ✨ Features

* ➕ Addition
* ➖ Subtraction
* ✖️ Multiplication
* ➗ Division
* 🧹 Clear inputs instantly
* ⚠️ Divide-by-zero handling
* ✅ Input validation
* 📱 Responsive layout (Portrait + Landscape)
* 🧠 Clean logic separated from UI

---

## 📸 Screenshot
🧮 Main Calculator UI
🔢 Input + Operations
📱 Responsive Layout

<img width="393" height="694" alt="image" src="https://github.com/user-attachments/assets/f2a9a60a-57a5-4ab3-81f5-32d80a832f62" /> <img width="389" height="729" alt="image" src="https://github.com/user-attachments/assets/35fdcd1e-a69a-40d3-8b19-6afb0fbb636a" /> <img width="396" height="693" alt="image" src="https://github.com/user-attachments/assets/68b9851f-5767-4f4b-8bc6-d6b08083cd07" />
---

## 🛠 Tech Stack

* **Language:** Kotlin
* **UI:** XML Layouts
* **Architecture:** Simple separation of concerns
* **Min SDK:** 26
* **Target SDK:** 36
* **IDE:** Android Studio

---

## 📂 Project Structure

```
com.ssmj.calculatorapp01
 ├── MainActivity.kt        # UI Controller
 ├── CalculatorEngine.kt    # Business Logic
 └── res/
     ├── layout/
     │   ├── activity_main.xml
     │   └── layout-land/activity_main.xml
```

---

## 🧠 Architecture

The app follows a simple clean structure:

* **UI Layer:** Handles user interaction
* **Logic Layer:** Performs calculations
* Easy to test and extend

```kotlin
val result = engine.calculate(a, b, op)
```

---

## ⚠️ Error Handling

* Prevents divide-by-zero crashes
* Validates numeric inputs
* Shows friendly error messages

---

## 🔄 Responsive Design

* **Portrait:** Vertical layout
* **Landscape:** Side-by-side layout
* Automatically handled using `layout-land`

---

## 🚀 How to Run

1. Clone the repository:

```bash
git clone https://github.com/your-username/calculator-android.git
```

2. Open in **Android Studio**

3. Click ▶ Run

---

## 📚 Learning Goals

This project is ideal for:

* Android beginners
* Kotlin learners
* First GitHub mobile project
* Understanding UI vs Logic separation

---

## 🔮 Future Improvements

* Material UI design
* ViewBinding
* Dark mode
* Calculation history
* Scientific calculator version
* Jetpack Compose version

---

## 👨‍💻 Author

**Saurabh Madrap**
B.Tech IT | Android Learner | Software Developer

---

## ⭐ Support

If you like this project, consider giving it a ⭐ on GitHub!

