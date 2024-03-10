package Util;

public class RectAngle {

    private final int x;
    private final int y;
    private final int width;
    private final int height;

    public RectAngle(int x, int y, int width, int height){
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    public boolean contains(int x, int y){
        return x >= this.x && x <= this.x + width && y >= this.y && y <= this.y + height;
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

    public int getHeight() {
        return height;
    }

}
