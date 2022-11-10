public class ball {
int x;
int y;
int vx;
int vy;


    @Override
    public String toString() {
        return "ball{" +
                "x=" + x +
                ", y=" + y +
                ", vx=" + vx +
                ", vy=" + vy +
                '}';
    }

    public ball () {
x = 0;
y = 0;
vx = 1;
vy = 1;
}
    public ball(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void move() {
    x += vx;
    y += vy;
    }

    public void bounce() {
    vy = -vy;
    }

    public void bounce(paddle P) {
    vx = -vx;
    }
}

