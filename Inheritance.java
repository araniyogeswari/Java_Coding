class Bus{
    void bus()
    {
        System.out.println("Benze");
    }
}

class Bike extends Bus
{
    void bike()
    {
        System.out.println("GT650");
    }
}
class Car extends Bike
{
    Car()
    {
        System.out.println("BMW");
    }
    Car(int n)
    {
        for (int i = 1; i < n; i++) 
        {
            System.out.println("RollsRoyce");    
        }
    }
    Car(String car)
    {
        System.out.println(car);
    }
    Car(String car,int n)
    {
        for (int i = 1; i < n; i++) {
            System.out.println(car);
        }
    }
}
public class Inheritance extends Car {
    public static void main(String[] args) {
        Inheritance I=new Inheritance();
        Car c=new Car(6);
        Car C=new Car("Ferrari");
        Car d=new Car("Thar",8);
        for (int j = 1; j < 5; j++) 
        {
        I.bike();   
        }           
    }
}
/*
class Bike {
    // Default bike method
    void bike() {
        System.out.println("GT650");
    }

    // Overloaded method with int parameter
    void bike(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.println("GT650 " + i);
        }
    }

    // Overloaded method with String parameter
    void bike(String model) {
        System.out.println("Bike model: " + model);
    }

    // Overloaded method with String and int parameters
    void bike(String model, int n) {
        for (int i = 1; i <= n; i++) {
            System.out.println(model + " " + i);
        }
    }
}

class Car extends Bike {
    Car() {
        System.out.println("BMW");
    }

    Car(int n) {
        for (int i = 1; i < n; i++) {
            System.out.println("RollsRoyce");
        }
    }

    Car(String car) {
        System.out.println(car);
    }

    Car(String car, int n) {
        for (int i = 1; i < n; i++) {
            System.out.println(car);
        }
    }
}

public class Inheritance extends Car {
    public static void main(String[] args) {
        Inheritance I = new Inheritance();

        // Car constructors
        Car c = new Car(6);
        Car C = new Car("Ferrari");
        Car d = new Car("Thar", 8);

        // Demonstrating bike overloading
        I.bike();                  // Default bike
        I.bike(3);                 // Prints GT650 three times
        I.bike("Ducati");          // Prints Ducati
        I.bike("RoyalEnfield", 4); // Prints RoyalEnfield four times
    }
}
*/