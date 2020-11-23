package pointdemo;

/**
 *
 * @author Al-Amin Islam Joy
 */
public class Point {

    double x, y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getDistance(Point that) {
        double dx = x - that.x;
        double dy = y - that.y;
        double d = Math.sqrt((dx * dx) + (dy * dy));
        return d;
    }
    public void translate(Point that){
        x=this.x+that.x;
        y=this.y+that.y;
    }
    public void rotate(double rotateInDegree){
        double theta=Math.toRadians(rotateInDegree);
        double xp=x*Math.cos(theta)-y*Math.sin(theta);
        double yp=x*Math.sin(theta)+y*Math.cos(theta);
        x=xp;
        y=yp;
    }
}
