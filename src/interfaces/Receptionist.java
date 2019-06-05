package interfaces;


public class Receptionist extends Employee {

    public Receptionist() {
    }

    public Receptionist(String name, double salary) {
        super(name, salary);
    }

    
    @Override
    public void work() {
        System.out.println("Work like a receptionist");
    }
    
}
