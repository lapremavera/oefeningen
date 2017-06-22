package be.vdab.constructorOefn;

public class Employee {

    String firstName = "Prema";
    String lastName = "Van den Broecke";
    int salary = 1000;
    String email = "lapremavera@gmail.com";

    public Employee() {
    }
    public Employee(String firstName, String lastName, int salary, String email) {
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public static void main(String[] args) {
        Employee p = new Employee();
        System.out.println("Werknemergegevens: ");
        System.out.println("Voor-en achternaam: "+ p.getFirstName()+" "+ p.getLastName());
        System.out.println ("Salaris:  "+ p.getSalary());
        System.out.println ("Email: "+p.getEmail());

    }
}
