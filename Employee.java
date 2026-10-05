public class Employee {
    private int id;
    private String firstName;
    private String lastName;
    private int salary;

    public Employee(int id, String firstName, String lastName, int salary) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getName() {
        return firstName + " " + lastName;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getAnnualSalary() {
        return salary * 12;
    }

    public int raiseSalary(int percent) {
        this.salary += this.salary * percent / 100;
        return this.salary;
    }

    public String toString() {
        return "Employee[id=" + id + ",name=" + firstName + " " + lastName + ",salary=" + salary + "]";
    }


    public static void main(String[] args) {
        Employee e1 = new Employee(8, "Axmed", "Ali", 250);
        System.out.println(e1);

        e1.setSalary(100);
        System.out.println(e1);
        System.out.println("id is: " + e1.getId());
        System.out.println("name is: " + e1.getName());
        System.out.println("annual salary is: " + e1.getAnnualSalary());

        e1.raiseSalary(10);
        System.out.println(e1);
    }
}