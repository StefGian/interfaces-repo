package interfaces;


public class Supervisor extends Employee implements Advisable, Driving {

    public Supervisor() {
    }

    public Supervisor(String name, double salary) {
        super(name, salary);
    }

    
    @Override
    public void work() {
        System.out.println("Work like a supervisor");
    }

    @Override
    public void giveAdvice() {
        System.out.println("give advice like a supervisor");
    }
    
    public String toString(){
        return name;
    }
}
