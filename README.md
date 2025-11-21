# 🚗 Vehicle Hiring System – Java OOP Console Project

The **Vehicle Hiring System** is a simple Java console application that demonstrates core **Object-Oriented Programming** concepts through a minimal vehicle rental workflow.  
The goal is to show clean structure, readable code, and essential OOP techniques without unnecessary detail.

---

## 📌 Overview

The program manages a small set of vehicles:

- **Car** → can be rented but cannot carry load  
- **Truck** → can be rented and can carry load up to a defined capacity  

Users interact with the system through a straightforward console menu where they can:

- List vehicles  
- Rent a vehicle  
- Drop (return) a rented vehicle  
- Load cargo onto a truck  
- See meaningful error messages when operations are invalid  

All data is kept in memory using basic Java collections.

---

## 🧱 OOP Concepts Used

### 🔹 Abstract Class  
`Vehicle` defines shared fields (`id`, `plate`, `dailyFee`, `rented`) and common behaviors such as renting and dropping.  
It also declares the abstract method `load(double amount)`.

### 🔹 Inheritance  
`Car` and `Truck` both extend `Vehicle` and override behavior where necessary.

### 🔹 Interface  
`Loadable` defines the load-handling functionality implemented by `Truck`.

### 🔹 Polymorphism  
`VehiclePark` stores all vehicles as `Vehicle` objects and handles them uniformly.

### 🔹 Custom Exceptions  
- **OverWeightException** → thrown when loading beyond capacity  
- **VehicleUnavailableException** → thrown when renting a missing or already rented vehicle  

These provide clear, structured error handling.
