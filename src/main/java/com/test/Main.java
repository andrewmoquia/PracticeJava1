package com.test;
import com.test.components.BankAccount;
import com.test.components.Manager;
import com.test.utilities.Debug;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        DataTypes();
        TypeCasting();
        Operators();
        StringFunc();
        RandomizeNum();
        ConditionsStatement();
        SwitchStatement();
        WhileLoop();
        ForLoop();
        BreakContinue();
        Arrays();

        int sumValues = AddValues(1,6);
        System.out.println("Sum of Values: " + sumValues);

        double doubleSumValues = AddValues(11231.13, 123131.123);
        System.out.println("Double Sum Values: " + doubleSumValues);

        Main myObkj = new Main();
        System.out.println(myObkj.AddValues(10,6));

        Second second = new Second();
        System.out.println(second.a);

        second.a = 13;
        System.out.println(second.a);
        String myName = second.GetName();
        System.out.println(myName);

        Cat.PrintCatName();

        Car car = new Car(4, "Toyota");
        int carWheels = car.GetCarWheels();
        System.out.println("Car wheels: " + carWheels);

        Payment creditCard = new CreditCardPayment();
        Payment payPal = new PayPalPayment();

        creditCard.processPayment(100.0);
        payPal.processPayment(200.0);

//        PackageFunc();

        // Polymorphism - method overloading
        String debugTest = "Debug this variable string.";
        Debug.log(debugTest);

        // Polymorphism - method overriding
        Manager manager = new Manager("John", "IT", 5);
        manager.displayDetails();
        manager.login();

        // Inner Class
        BankAccount account = new BankAccount();
        account.deposit(100);
        BankAccount.Transaction transaction = account.createTransaction("Deposit", 100);
        transaction.printTransaction();

        account.withdraw(50);
        transaction = account.createTransaction("Withdraw", 50);
        transaction.printTransaction();
    }
    public static void PackageFunc() {
        Scanner myScanner = new Scanner(System.in);

        System.out.println("Enter username: ");

        String username = myScanner.nextLine();
        System.out.println("Username is: " + username);
    }

    public static int AddValues(int x, int y) {
        return x + y;
    }

    public static double AddValues(double x, double y) {
        return x + y;
    }

    public static void Arrays() {
        String[] fruits = {"apple", "orange", "avocado", "banana"};
        System.out.println("Stored fruits: " + fruits.length);
        fruits[3] = "durian";
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // Multi dimensional array
        String[][] classes = {{"Jess", "Carlo"}, {"Jennifer", "Fernando"}};
        for (String[] names : classes) {
            for (String name : names) {
                System.out.printf("%s\n", name);
            }
        }
    }

    public static void BreakContinue() {
        int i = 0;

        // Break - stop the loop
        while (i < 10) {
            System.out.println("Break at 3 : " + i);
            i++;
            if (i == 3) {
                break;
            }
        }

        int x = 0;
        while (x < 5) {
            if (x == 3) {
                x++;
                continue;
            }
            System.out.println("Skip at 3 : " + x);
            x++;
        }

        // Continue - skip the loop
    }

    public static void ForLoop() {
        //For Loop
        for (int i = 0; i < 2; i++) {
            System.out.println("For Loop" + i);
        }

        // Nested For Loop
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // For each loop
        String[] names = {"John", "Andrew", "Moquia"};
        for (String name : names) {
            System.out.println(name);
        }
    }

    public static void WhileLoop() {
        int i = 0;
        while (i < 4) {
            i++;
            System.out.println("while loop: " + i);
        }

        do {
            System.out.println("run once do while loop");
        } while (i < 0); {
            System.out.println("do while loop: " + i);
        };
    }

    public static void SwitchStatement() {
        int day = 2;
        switch(day) {
            case 1:
                System.out.println("Today is Monday!");
                break;
            case 2:
                System.out.println("Today is Tuesday!");
                break;
            default:
                System.out.println("Today is Monday!");
        }
    }

    public static void ConditionsStatement() {
        String password = "123";
        String currPassword = "1123";
        if (password.equals(currPassword)) {
            System.out.println("Passwords match");
        } else if (!password.equals(currPassword)) {
            System.out.println("Passwords do not match");
        } else {
            System.out.println("Passwords do not match");
        }

        // Shorthand
        String oldPassword = "123";
        String newPassword = "123";
        String result = oldPassword.equals(newPassword) ? "Passwords match" : "Passwords do not match";
        System.out.println(result);
    }

    public static void RandomizeNum() {
        int minNum = 5;
        int maxNum = 100;

        int randomNum = (int) (Math.random() * (maxNum - minNum + 1) + minNum);
        System.out.println("Random number: " + randomNum);
    }

    public static void StringFunc() {
        String txt1 = "Hello World";
        String lowerCaseString = txt1.toLowerCase();
        String upperCaseString = txt1.toUpperCase();

        System.out.println("lowerCaseString: " + lowerCaseString);
        System.out.println("upperCaseString: " + upperCaseString);

        // Concatenation
        String firtsName = "John";
        String lastName = "Moquia";
        String fullName = firtsName + " " + lastName;
        System.out.println("fullName: " + fullName);

        // Special Characters
        String password = "1231ad#41\'\\";
        System.out.println("password: " + password);

    }

    public static void Operators() {
        // Assignment =
        int a = 1;
        System.out.println("a" + a);

        // Comparison
        int x = 5;
        int y = 14;

        boolean equals = x == y;
        System.out.println("equals x == y: " + equals);

        boolean notEquals = x != y;
        System.out.println("notEquals x != y: " + notEquals);

        boolean lessThanEquals = x < y;
        System.out.println("lessThanEquals x < y: " + lessThanEquals);

        boolean greaterThanEquals = x > y;
        System.out.println("greaterThanEquals x > y: " + greaterThanEquals);

        // Logical Operators
        String fruit1 = "apple";
        String fruit2 = "apple";

        boolean isSameFruit = fruit1.equals(fruit2);
        System.out.println("isSameFruit" + isSameFruit);

    }

    public static void TypeCasting() {
        // Widening Casting
        int value1 = 12;
        double value2 = value1;

        // Narrowing Casting
        double value3 = 15.9;
        int value4 = (int) value3;

        System.out.println("Widening value: = " + value2);
        System.out.println("Narrowing value = " + value4);
    }

    public static void DataTypes() {
        System.out.println("Hello World");

        String firstName = "John Andrew";
        String lastName = "Moquia";
        String fullName = firstName + " " + lastName;
        int age = 18;
        float meter = 10.5f;
        boolean boo = true;
        byte block = 12;
        long cryptoId = 12351951353233L;
        double cryptoBalance = 12325.12332d;

        int length  = 1;
        int width = 10;
        int area = length * width;

        System.out.println("My fullname: " + fullName);
        System.out.println("My age: " + age);
        System.out.println("My meter: " + meter);
        System.out.println("My boo: " + boo);
        System.out.println("Acc Block: " + block);
        System.out.println("Acc ID: " + cryptoId);
        System.out.println("Acc Balance: " + cryptoBalance);

        int items = 50;
        float costPerItem = 1.5f;
        char currency = '$';

        System.out.println("Items: " + items);
        System.out.println("Cost Per Item: " + costPerItem);
        System.out.println("Currency: " + currency);
    }
}

class Second {
    int a = 1;
    private String name = "John Andrew";

    String GetName() {
        return name;
    }
}

class Cat {
    static void PrintCatName() {
        System.out.println("Casper");
    }
}
