# 🍕 Food Delivery Restaurant Finder

A small Java console project created to apply Java Streams and `Optional` to a simple food-delivery-style restaurant search problem.

## 📌 Problem

A food-delivery application may receive a restaurant ID that does not exist in its available restaurant list.

This project searches for a restaurant by ID and handles both possible outcomes:

* Restaurant exists → display the restaurant
* Restaurant does not exist → display a "Restaurant not found" message

## 🧠 Concepts Practiced

* Java Streams
* Lambda expressions
* `filter()`
* `findFirst()`
* `Optional`
* `isPresent()`
* `get()`

## 🔄 Program Flow

```text
Restaurant List
      ↓
    stream()
      ↓
    filter()
      ↓
  findFirst()
      ↓
Optional<Restaurant>
      ↓
 isPresent()
   ↙       ↘
Found     Not Found
  ↓          ↓
 get()    Message
  ↓
Print Restaurant
```

## 🗂️ Project Structure

```text
FoodDeliveryRestaurantFinder/
│
├── src/
│   ├── Restaurant.java
│   ├── RestaurantService.java
│   └── Main.java
│
└── README.md
```

## 💻 Example

### Restaurant Found

```text
Enter restaurant ID: 102

Restaurant found:
Restaurant{id=102, name='Spice Hub', cuisine='Indian', rating=4.2, open=true}
```

### Restaurant Not Found

```text
Enter restaurant ID: 999

Restaurant not found.
```

## 🎯 Purpose

This is intentionally a small learning project, not a complete food-delivery application.

The goal was to take a Java concept learned today and apply it to a realistic problem rather than using it only in isolated examples.

## 🚀 Future Improvements

Possible extensions for future learning:

* Search only open restaurants
* Search restaurants by cuisine
* Add restaurant rating filters
* Build a simple frontend
* Connect the project to a database
