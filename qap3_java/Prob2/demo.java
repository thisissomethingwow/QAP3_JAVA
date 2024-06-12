package qap3_java.Prob2;

public class demo {
    public static void main(String[] args) {
        Shape S = new Shape("Red", true);

Circle C = new Circle(5.0);

Circle C1 = new Circle(5.0,"blue",true);

Rectangle R = new Rectangle(2.0,3.0);

Rectangle R1 = new Rectangle(2.0,3.0,"green",false);

Square Sq = new Square(4.0);

Square Sq1 = new Square(4.0,"yellow",true);

S.toString();

C.toString();

System.out.println(C.getArea());
System.out.println(C.getPerimeter());

//Print here (C.getArea() and C.getPerimeter())

C1.toString();

System.out.println(C1.getArea());
System.out.println(C1.getPerimeter());

//Print here(C1.getArea() and C1.getPerimeter())

R.toString();

System.out.println(R.getArea());
System.out.println(R.getPerimeter());

//Print(R.getArea() and R.getPerimeter())

R1.toString();

System.out.println(R1.getArea());
System.out.println(R1.getPerimeter());

//Print(R1.getArea() and R1.getPerimeter())

Sq.toString();

System.out.println(Sq.getArea());
System.out.println(Sq.getPerimeter());

// Print(sq.getArea() and sq.getPerimeter())

Sq1.toString();

System.out.println(Sq1.getArea());
System.out.println(Sq1.getPerimeter());

// Print(sq1.getArea() and sq1.getPerimeter())
    }
}
