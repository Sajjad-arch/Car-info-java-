//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

/*
Task 1: Car Class
Create a class Car with:
• Fields: brand, model, year
• Methods: displayDetails()
• Constructors: default & parameterized
Expected Output:
Car: Toyota Corolla (2022)
Car: Tesla Model 3 (2024)
 */



public class Main {
    public static void main(String[] args) {

        Car c1 = new Car();
        c1.brand = "Toyota ";
        c1.model = "Corolla (2022)";
      c1.displayDetails();


       Car c2 = new Car( "Tesla", "Model 3 (2024)");
       c2.displayDetails();


    }
}