package td3.ex1;

public class Point
{
        private int x;
        private int y;

    public Point(int x, int y) {
    }

    public void Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
        public void deplace(int dx, int dy) {
            x += dx;
            y += dy;
        }
        public int getX() {
            return this.x;
        }


    public  int getY() {
        return this.y;
    }

}