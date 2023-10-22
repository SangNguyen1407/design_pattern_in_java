public class PikachuContext {
    private AttackStrategy attackStrategy;

    public PikachuContext(AttackStrategy strategy){
        attackStrategy = strategy;
    }

    public void attack(){
        attackStrategy.attack();
    }
    
}
