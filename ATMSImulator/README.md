# ATM Simulator

A small ATM Simulator built using **Java Swing** to practice **Event Delegation and Basic Event Handling**.

### Concepts Used

* `ActionEvent`
* `ActionListener`
* `actionPerformed()`
* `addActionListener()`
* Event Delegation Model
* Basic Swing components

### What it does

* Displays account information
* Takes a withdrawal amount
* Handles the Withdraw button click
* Checks the balance
* Updates the remaining balance

### Event Flow

```text
JButton
   ↓
ActionEvent
   ↓
ActionListener
   ↓
actionPerformed()
```

Built as a small real-world project while learning Java concepts one topic at a time.
