# 🚗 Vehicle Hiring System – Java OOP Console Project

This repository contains a **Java console-based vehicle hiring system** that demonstrates clean Object-Oriented Programming design using abstract classes, interfaces, and custom exceptions.

The project simulates a simple rental workflow where users can list vehicles, rent them, return them, and (in the case of trucks) load cargo.  
Everything is implemented with pure Java, focusing on **clean structure** and **practical OOP fundamentals**.

---

## 🚘 System Overview

The system is built around three main concepts:

- **Vehicle** → Abstract base class for all vehicles  
- **Car / Truck** → Two concrete vehicle types  
- **VehiclePark** → Stores vehicles and handles rental operations  

Users interact through `Test.java`, which provides a menu-driven console interface.

---

## 🧱 Vehicle Types

### 🚙 Car
Cars:
- Can be rented  
- Cannot carry cargo  
- Have simple, clean behavior inherited from `Vehicle`  

When a car is rented:
- The system checks availability  
- Marks it as rented  
- Blocks double-rent attempts with a custom exception  

---

### 🚚 Truck
Trucks extend `Vehicle` **and implement the `Loadable` interface**.

They add:
- A maximum load capacity (kg)
- Current load amount

Actions supported:
- Rent / return  
- Load cargo  
- Unload cargo  

The system ensures:
- Cargo cannot exceed capacity  
- Heavy loading attempts trigger **OverWeightException**  

---

## 📦 Loadable Interface

Defines two operations:
- `load(double kg)`
- `unload(double kg)`

Only `Truck` implements this interface, demonstrating OOP polymorphism.

---

## ❗ Custom Exceptions (Safety & Validation)

Two custom exception types make the system robust:

### 🚫 VehicleUnavailableException
Thrown when:
- Trying to rent an already rented vehicle  
- Trying to drop (return) a vehicle that is not currently rented  

### ⚠️ OverWeightException
Thrown when:
- Cargo exceeds a truck’s maximum load capacity  

These ensure input validation and clean error handling.

---

## 🏢 VehiclePark (Fleet Manager)

The `VehiclePark` class stores all vehicles and handles:

- Listing vehicles  
- Finding vehicles by ID  
- Renting & returning vehicles  
- Loading cargo onto trucks  

Internally:
- Uses an array or collection of `Vehicle` objects  
- Interacts with `Car` and `Truck` polymorphically  
- Throws appropriate exceptions for invalid operations  

---

## 🎮 Console Simulation (Test.java)

The user interacts with the system through a menu:

- List vehicles  
- Rent a vehicle  
- Drop a vehicle  
- Load cargo to a truck  
- Exit  

The program shows meaningful messages:
- Rental success/failure  
- Load success / overweight warning  
- Returning status  
- Vehicle not found  
- Wrong input prevention  

This makes the simulation realistic and easy to follow.

---

## 🧩 Technical Highlights

This project demonstrates:

- **Abstract classes** (`Vehicle`)
- **Inheritance** (`Car`, `Truck`)
- **Interfaces** (`Loadable`)
- **Custom exceptions**
- **Polymorphism**
- **Encapsulation**
- **Menu-driven console application**
- Clean object interactions (`VehiclePark` coordinating everything)

Perfect for showcasing core OOP knowledge in a beginner–intermediate Java portfolio.

---
