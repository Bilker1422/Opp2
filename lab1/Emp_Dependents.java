package lab1;

import java.util.ArrayList;

public class Emp_Dependents {
    private Employee Employee;
    private ArrayList<Dependent> dependents_list = new ArrayList();

    public void addEmployee(Employee Employee){
        this.Employee = Employee;

    }
    public void addDependent(Dependent Dependent){
        this.dependents_list.add(Dependent);

    }
    public void display(){
        System.out.println(Employee.getId());
        System.out.println(Employee.getDeptName());
        System.out.println(Employee.getName());
        System.out.println("*** Dependents List ***");
        for(int i = 0; i < dependents_list.size() ; i++){
            Dependent name = dependents_list.get(i) ;
            System.out.println(name.getId() + "\t" +name.getName());
        }
    }
}

