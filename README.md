# 🔍 Lost & Found Management System

A robust desktop application built from scratch to streamline the process of reporting, tracking, and matching lost and found items within an organization or campus.

##  Core Features
* **User Authentication:** Secure login and registration for administrators and standard users.
* **Item Logging:** Easy-to-use forms to report lost or found items with detailed descriptions, categories, dates, and locations.
* **Smart Matching:** An automated lookup or filtering system to match reported lost items with found inventory.
* **Database Persistence:** Full CRUD (Create, Read, Update, Delete) operations tied to an SQL backend to ensure data integrity.

##  Tech Stack
* **Frontend/UI:** Java Swing / JForms (Graphical User Interface)
* **Backend Logic:** Java (OOP principles)
* **Database:** SQL (MySQL)

##  Database Schema
*Briefly describe or show a text-based representation of your tables here. For example:*
* `Users`: id, username, password, role
* `Items`: id, item_name, category, status (Lost/Found), date_logged, user_id

##  How to Run
1. Clone the repository: `git clone https://github.com/AyeshaK007/LostAndFoundManagementSystem.git`
2. Open the project in your preferred IDE (NetBeans).
3. Set up the SQL database using the provided `.sql` script.
4. Run the main class to launch the JForms application.
