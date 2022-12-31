package lab1;

public class Main {
    public static void main(String[] args) {
        Employee e1 = new Employee(111,"shady","Finance");
        Dependent d1 = new Dependent(1,"Ali");
        Dependent d2 = new Dependent(2,"Ahmad");
        Emp_Dependents ed = new Emp_Dependents();
        ed.addEmployee(e1);
        ed.addDependent(d1);
        ed.addDependent(d2);
        Reconds list = new Reconds();
        list.add(ed);
        list.viewAllReconds();
    }
}
