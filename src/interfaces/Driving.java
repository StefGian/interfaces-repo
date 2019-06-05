package interfaces;


public interface Driving {
    
    default void drive(){
        System.out.println("driving");
    }
}
