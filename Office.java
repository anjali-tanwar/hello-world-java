import java.util.List;

class Office {
    public static void main(String[] args) {
        List<Employee> employees = List.of(
                new Employee("John", 25, "Software Engineer", 100000),
                new Employee("Jane", 30, "Manager", 200000),
                new Employee("Bob", 35, "Senior Manager", 300000),
                new Employee("Mary", 40, "Director", 400000),
                new Developer("Lary", 45, "CTO", 500000, "Java"),
                new Developer("Bam", 50, "CEO", 600000, "Python")
        );

        employees.forEach(employee -> {
            System.out.println("**********");
            employee.printDetails();
            System.out.println("**********");
        });
    }
}


class Employee {
    private String name;
    private int age;
    private String designation;
    private double salary;

    public Employee(String name, int age, String designation, double salary) {
        this.name = name;
        this.age = age;
        this.designation = designation;
        this.salary = salary;
    }

    public void printDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Designation: " + designation);
        System.out.println("Salary: " + salary);
    }
}

class Developer extends Employee {
    private String language;

    public Developer(String name, int age, String designation, double salary, String language) {
        super(name, age, designation, salary);
        this.language = language;
    }

    public void printDetails() {
        super.printDetails();
        System.out.println("Language: " + this.language);
    }
}

