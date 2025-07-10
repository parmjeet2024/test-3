Developer: Parmjeet Singh
Project: JavaFX Pizza Ordering Application
Purpose: This application allows a user to create, read, update, and delete pizza orders with live bill calculation.

Project Structure
Main.java — Entry point for the JavaFX application.

PizzaOrderPage.java — Contains the UI layout and logic for ordering pizzas.

PizzaOrder.java — Defines the PizzaOrder model with properties for name, mobile number, pizza size, toppings, and total bill.

BillCalculator.java — Contains logic for calculating the total pizza bill including 15% HST.

SampleData.java — Loads example orders when the app starts.

Features
User input fields for:

Customer Name

Mobile Number

Pizza Size (XL, L, M, S)

Number of Toppings

CRUD Operations:

Create: Add a new pizza order.

Read: Load selected order details into the input fields.

Update: Modify an existing order.

Delete: Remove an order.

Clear: Clear input fields and selections.

TableView: Displays all pizza orders in a table.

Bill Calculation:

Pizza prices: XL ($15.00), L ($12.00), M ($10.00), S ($8.00).

Each topping: $1.50.

Adds 15% HST to subtotal.

Example Bill Calculation
Size	Base Price	Toppings	Toppings Cost	Subtotal	HST (15%)	Total
L	$12.00	4	$6.00	$18.00	$2.70	$20.70
XL	$15.00	5	$7.50	$22.50	$3.38	$25.88
M	$10.00	2	$3.00	$13.00	$1.95	$14.95

How to Run
Clone or download this project.

Open in an IDE that supports JavaFX (e.g., IntelliJ IDEA or Eclipse).

Make sure JavaFX is configured properly.

Run Main.java to launch the application.

Notes
This project demonstrates:

JavaFX Scene structure

JavaFX properties and bindings

Basic CRUD operations with in-memory storage

Live calculation of total pizza bill

Use of a sample data loader

The data is not saved permanently; it exists only while the application is running.
