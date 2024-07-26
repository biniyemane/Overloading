package org.example;

public class CounterMain {
    public static void main(String[] args) {
        // Create Counter objects using different constructors
        Counter counter1 = new Counter(10);
        Counter counter2 = new Counter();

        // Print initial values
        System.out.println("Initial value of counter1: " + counter1.value());
        System.out.println("Initial value of counter2: " + counter2.value());

        // Use increase and decrease methods
        counter1.increase();
        counter2.increase(5);
        counter1.decrease();
        counter2.decrease(3);

        // Print values after operations
        System.out.println("Value of counter1 after operations: " + counter1.value());
        System.out.println("Value of counter2 after operations: " + counter2.value());

        // Use overloaded increase and decrease methods with invalid values
        counter1.increase(-2);
        counter2.decrease(-4);

        // Print values after invalid operations
        System.out.println("Value of counter1 after invalid operations: " + counter1.value());
        System.out.println("Value of counter2 after invalid operations: " + counter2.value());
    }
}
