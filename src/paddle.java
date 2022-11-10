public class paddle {
int x;
int y;
int width;

paddle() {
 x = 0;
 y = 0;
 width = 10;
}

    public paddle(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public paddle(int x, int y, int width) {
        this.x = x;
        this.y = y;
        this.width = width;
    }

    public void moveup() {
    y -= 1;
    }
    public void movedown() {
    y += 1;
    }

    @Override
    public String toString() {
        return "paddle{" +
                "x=" + x +
                ", y=" + y +
                ", width=" + width +
                '}';
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getWidth() {
        return width;
    }
}
