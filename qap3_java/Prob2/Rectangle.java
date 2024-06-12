package qap3_java.Prob2;

public class Rectangle extends Shape{
    private double width;
    private double length;

    public Rectangle(){
        this.width = 1.0;
        this.length = 1.0;
    }
    public Rectangle(double width,double length){
        this.width = width;
        this.length = length;
    }
    public Rectangle(double width,double length,String color,boolean filled){
        super(color, filled);
        this.width = width;
        this.length = length;
    }
    public double getWidth() {
        return width;
    }
    public double getLength() {
        return length;
    }
    public void setLength(double length) {
        this.length = length;
    }
    public void setWidth(double width) {
        this.width = width;
    }
    public double getArea(){
        return(length*width);
    }
    public double getPerimeter(){
        return(2*(length+width));
    }
    @Override
    public String toString(){
        return("Rectangle["+super.toString()+", width="+width+", length="+length+"]");
    }
}
