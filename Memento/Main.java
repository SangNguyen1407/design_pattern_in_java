public class Main {
    public static void main(String[] args) throws Exception {
        CareTaker careTaker = new CareTaker();
        Originator originator = new Originator(5, 10);
        System.out.println("State initial: " + originator);
        

        // X: 510 , Y: 10
        originator.setX(originator.getY() * 51);
        careTaker.saveMemento(originator.save(), "SAVE #1");
        System.out.println("State changed: " + originator);

        // X: 510 , Y: 51
        originator.setX(originator.getX() * 10);
        careTaker.saveMemento(originator.save(), "SAVE #2");
        System.out.println("State changed: " + originator);
    }
}
