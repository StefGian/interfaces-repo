package interfaces;


public class Teacher extends Employee {

    public Teacher() {
    }

    public Teacher(String name, double salary) {
        super(name, salary);
    }

    
    @Override
    public void work() {
        System.out.println("Work like a teacher");
    }
    
}
