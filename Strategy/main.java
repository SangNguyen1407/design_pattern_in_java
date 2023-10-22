public class main {
    public static void main(String[] args) throws Exception {
        PikachuContext pikachu;

        pikachu = new PikachuContext(new ToBadTypeConcreteStrategy());
        pikachu.attack();

        pikachu = new PikachuContext(new ToGoodTypeConcreteStrategy());
        pikachu.attack();
    }
}
