package mg.rgbcircles;

/**
 * Created by Максим on 06.04.2016.
 */
public class SimpleCircle {
    protected int x;
    protected int y;
    protected int radius;
    public int color;
    public SimpleCircle getCircleArea;

    public SimpleCircle(int x,int y, int radius)
    {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getRadius() {
        return radius;
    }

    public int getColor() {
        return color;
    }

    public  void setColor (int color)
    {
        this.color = color;
    }

    public SimpleCircle getGetCircleArea(){
        return new SimpleCircle(x,y,radius*3);
    }

    public boolean isIntersect(SimpleCircle circle) {

        return radius + circle.radius >= Math.sqrt(Math.pow(x - circle.x, 2) + Math.pow(y - circle.y, 2));
    }
}