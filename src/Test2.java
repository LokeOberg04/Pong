public class Test2 {
    public static void main(String[] args) {
        paddle bog = new paddle();
        ball pall = new ball();
        System.out.println(pall);
        pall.move();
        System.out.println(pall);
        pall.bounce();
        pall.move();
        System.out.println(pall);
        pall.bounce(bog);
        pall.move();
        System.out.println(pall);
    }
}
