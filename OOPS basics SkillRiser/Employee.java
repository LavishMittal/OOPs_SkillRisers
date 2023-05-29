// Object is a God Class. It is a parent class of every class.

public class Employee extends Object {
    private int id;
    private String Name;
    private double salary;

    public void takeInput(int id, String Name, double salary){
        // id =id; // Local var = Local var
        // Instance var = local var
        if(id<=0 || salary < 0){
            System.out.println("Invalid id or salary");
            return;
        }
        else if (Name == null) {
            System.out.println("Invalid name");
            return;
        }
        this.id = id;
        this.Name = Name;
        this.salary = salary;
    }

    // @Override
    // public int hashCode(){
    //     return 1;
    // }

        
    @Override
    public String toString() {
        return "Employee [id=" + id + ", Name=" + Name + ", salary=" + salary + "]";
    }

    Employee(int id , String Name , double salary){
        this.id = id;
        this.Name = Name;
        this.salary = salary;
    }


    public void printEmployee(){
        // this is a keyword (current calling object reference)
        System.out.println(this.id + this.Name + this.salary);
    }
}
