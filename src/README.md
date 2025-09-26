# 📚 Library Management System (Java OOP)

## 📌 Objective
A simple **Library Management System** built using **Object-Oriented Programming (OOP) in Java**.  
It manages books, users, and supports issuing and returning of books.

---

## 🛠 Features
- Add books to library
- Show available books
- Issue a book to a user
- Return a book
- Demonstrates OOP concepts: **Abstraction, Encapsulation, Inheritance, Polymorphism**

---

## 📂 Project Structure
LibraryManagementSystem/
├── src/
│ ├── Book.java
│ ├── User.java
│ ├── Library.java
│ └── Main.java
└── README.md

yaml
Copy code

---

## 🚀 How to Run
1. Clone the repository:
   ```bash
   git clone https://github.com/Hindu309/LibraryManagementSystem.git
   cd LibraryManagementSystem/src
Compile the Java files:

bash
Copy code
javac *.java
Run the program:

bash
Copy code
java Main
📖 Sample Output
vbnet
Copy code
Java Basics added to library.
Python Crash Course added to library.
C++ Primer added to library.

📚 Available Books:
Java Basics by James Gosling (Available)
Python Crash Course by Eric Matthes (Available)
C++ Primer by Stanley Lippman (Available)

Alice issued Java Basics

📚 Available Books:
Python Crash Course by Eric Matthes (Available)
C++ Primer by Stanley Lippman (Available)

Alice returned Java Basics

📚 Available Books:
Java Basics by James Gosling (Available)
Python Crash Course by Eric Matthes (Available)
C++ Primer by Stanley Lippman (Available)

❌ Book not available: Unknown Book
📝 Concepts Covered
Encapsulation: Private fields with getters/setters.

Abstraction: User doesn’t worry about how books are managed.

Polymorphism: toString() overriding in classes.

Inheritance: (Can be extended further if needed).