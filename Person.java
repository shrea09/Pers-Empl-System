class Person {﻿
    private String name;﻿
    private Date dob;﻿
    private int age;﻿

    public Person(String name, String dob) throws ParseException {﻿
        this.name = name;﻿
        this.dob = new SimpleDateFormat("dd-MM-yyyy").parse(dob);﻿
        this.age = calculateAge();﻿
    }﻿

    private int calculateAge() {﻿
        Date today = new Date();﻿
        long ageInMillis = today.getTime() - dob.getTime();﻿
        return (int) (ageInMillis / (1000L * 60 * 60 * 24 * 365));﻿
    }﻿

    public void displayPersonDetails() {﻿
        System.out.println("Name: " + name);﻿
        System.out.println("Date of Birth: " + new SimpleDateFormat("dd-MM-yyyy").format(dob));﻿
        System.out.println("Age: " + age);﻿
    }﻿

    public static void main(String[] args) throws ParseException {﻿
        Person person = new Person("John Doe", "10-05-1985");﻿
        person.displayPersonDetails();﻿
    }﻿
}﻿

class Employee extends Person {﻿
    private int empId;﻿
    private double salary;﻿

    public Employee(String name, String dob, int empId, double salary) throws ParseException {﻿
        super(name, dob);﻿
        this.empId = empId;﻿
        this.salary = salary;﻿
    }﻿

    public void displayEmployeeDetails() {﻿
        displayPersonDetails();﻿
        System.out.println("Employee ID: " + empId);﻿
        System.out.println("Salary: $" + salary);﻿
    }﻿

    public static void main(String[] args) throws ParseException {﻿
        Employee emp = new Employee("Alice", "15-08-1990", 101, 75000);﻿
        emp.displayEmployeeDetails();﻿
    }﻿
}﻿
