public class pong {
ball ball = new ball();
paddle p1 = new paddle(-5,0);
paddle p2 = new paddle(5, 0);
int width;
int height;

public void pong(int width, int height) {
    this.width = width;
    this.height = height;
}

public void update() {
    ball.move();
}

public void checkcollision() {

}
}
