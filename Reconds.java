import java.util.ArrayList;

public class Reconds {
    private ArrayList<Emp_Dependents> list = new ArrayList();
    public void add(Emp_Dependents list){
        this.list.add(list);
    }
    public void viewAllReconds(){
        System.out.println("View all records");
        System.out.println("======================");
        for(int i = 0; i < list.size(); i++){
            list.get(i).display();
        }

    }
}
