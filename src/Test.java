public class Test {
    public static void main(String[] args) {
       paddle pog = new paddle(25,10);
        System.out.println(pog);
        pog.moveup();
        System.out.println("y = " + pog.getY());
        pog.movedown();
        System.out.println("y = " + pog.getY());
    }
}
