package qap3_java.Prob3;

public class demo {
    public static void main(String[] args) {
        Point p = new Point(1.0f, 1.0f);
        System.out.println(p);


        MovablePoint mp = new MovablePoint(1.0f, 2.0f, 0.5f, 1.5f);
        System.out.println(mp);

        mp.move();
        System.out.println(mp);


    }
}
