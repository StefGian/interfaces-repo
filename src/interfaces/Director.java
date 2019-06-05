package interfaces;


public class Director extends Employee implements Advisable {

    public Director() {
    }

    public Director(String name, double salary) {
        super(name, salary);
    }


    @Override
    public void work() {
        System.out.println("Work like a director");
    }

    @Override
    public void giveAdvice() {
        System.out.println("give advice like a director");
    }
    
}
