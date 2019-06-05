package interfaces;

import java.util.ArrayList;
import java.util.List;


public class Interfaces {

    
    public static void main(String[] args) {
        
        Teacher t = new Teacher();
        Supervisor s = new Supervisor();
        s.giveAdvice();
        
        Employee e =s;
        Advisable a = new Supervisor();
        Advisable.giveStaticAdvice();
        
        
        //from a list of employees find those who are advisable
        Teacher t1 = new Teacher("Jack", 200);
        Teacher t2 = new Teacher ("John", 300);
        Supervisor s1 = new Supervisor("Anna", 100);
        Supervisor s2 = new Supervisor("Jonathan", 300);
        List <Employee> employees = new ArrayList();
        employees.add(t1);
        employees.add(t2);
        employees.add(s1);
        employees.add(s2);
        
        
        List<Advisable> advisors = new ArrayList();
        for (Employee em:employees){
            if(em instanceof Advisable){
                advisors.add((Advisable) em);//casting
            }
        }
        
        System.out.println("The advisable people are: " +advisors);
    }
    
    
    
}
