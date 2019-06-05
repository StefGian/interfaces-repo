package interfaces;


public class Secretary extends Employee{

    public Secretary() {
    }

    
    
    public Secretary(String name, double salary) {
        super(name, salary);
    }

    
    
    
    @Override
    public void work() {
        System.out.println("Work like a secretary");
    }
    
}
