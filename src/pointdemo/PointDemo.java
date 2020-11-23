package pointdemo;

/**
 *
 * @author Al-Amin Islam Joy
 */
public class PointDemo {

    public static void main(String[] args) {
        Point p1 = new Point(3, 2);
        Point p2 = new Point(2, 5);
        double dis = p1.getDistance(p2);
        System.out.println("Distance is : " + dis);
        System.out.println("Before Translate : " +p1.x+" "+p1.y);
        p1.translate(p2);
        System.out.println("After Translate : " +p1.x+" "+p1.y);
        Point p3=new Point(4,2);
        System.out.println("Before Rotate : " +p3.x+" "+p3.y);
        p3.rotate(10);
        System.out.println("After Rotate : " +p3.x+" "+p3.y);
    }

}
