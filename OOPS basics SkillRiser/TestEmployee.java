public class TestEmployee{
    public static void main(String[] args) {

        String x = new String("Ram");
        System.out.println(x.toString());
        Employee Lavish = new Employee(123, "Lavish", 9.8000); // new is used to allocate memory
        // Lavish.id = -126;
        // Lavish.Name = "jkl";
        // Lavish.salary = -987;
        // Lavish.takeInput(-126, "lavi", -98070);
        // Lavish.printEmployee();
        // System.out.println(Lavish.id);
        // System.out.println(Lavish.Name);
        // System.out.println(Lavish.salary);
        // System.out.println(Lavish);
        // System.out.println(Lavish.hashCode());

        System.out.println(Lavish);
        System.out.println("***************");

        Employee Lavi = new Employee(132, "Lavi", 1478526.20);
        // Lavi.takeInput(127, "Lavish Mittal", 9807000);
        // Lavi.printEmployee();
        // System.out.println(Lavi.id);
        // System.out.println(Lavi.Name);
        // System.out.println(Lavi.salary);
        // System.out.println(Lavi);
        // System.out.println(Lavi.hashCode());
        System.out.println(Lavi);
    }

    @Override
    public String toString() {
        return "TestEmployee []";
    }
}