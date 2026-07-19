package relations.aggrgation;
import java.util.*;

class Professor {
    private String name;

    public Professor(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }
    
}

/**
 * Department */
class Department{
    public String name;
    public List<Professor> professors;

    public Department(String name,List<Professor> professors){
        this.name = name;
        this.professors = professors;
    }
    
}

public class Main{
    public static void main(String[] args) {
        Professor pro1 = new Professor("Aditya");
        Professor pro2 = new Professor("Ved");
        Professor pro3 = new Professor("Piyush");
        List<Professor> pro = new ArrayList<>();
        pro.add(pro1);
        pro.add(pro2);
        pro.add(pro3);
        Department dep1 = new Department("Computer Science", pro);
        System.out.println(dep1.name);
    }
}

