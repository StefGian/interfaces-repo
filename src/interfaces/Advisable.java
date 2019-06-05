package interfaces;


public interface Advisable {
    
    public final static String advice = "Beginner"; //mporw na paraleipsw ta "public final static. O compiler ta bazei automata
                                                   //ta var sta interfaces einai public final static panta***
    
    void giveAdvice(); //einai public abstract giati einai sto interface
    
    default void giveSpecialAdvice(){ //den einai abstract, gia auto xrhsimopoioun default kai swma
        System.out.println("gib special advice");
    }
    
    static void giveStaticAdvice(){
        System.out.println("gib static advice");
    }
    
}
