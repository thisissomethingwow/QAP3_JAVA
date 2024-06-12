package qap3_java.Prob3;

public class MovablePoint extends Point{
    private float xSpeed;
    private float ySpeed;

    public MovablePoint(float x,float y,float xSpeed,float ySpeed){
        super(xSpeed, ySpeed);
        this.xSpeed=xSpeed;
        this.ySpeed=ySpeed;
    };
    
    public MovablePoint(float xSpeed,float ySpeed){
        this.xSpeed=xSpeed;
        this.ySpeed=ySpeed;
    }

    public MovablePoint(){
        this.xSpeed=0.0f;
        this.ySpeed=0.0f;
    }

    public float getxSpeed() {
        return xSpeed;
    }
    public float getySpeed() {
        return ySpeed;
    }
    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }
    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }
    public void setSpeed(float xSpeed,float ySpeed){
        this.xSpeed=xSpeed;
        this.ySpeed=ySpeed;
    }
    public float[] getSpeed(){
        return new float[]{xSpeed,ySpeed};
    }
    @Override
    public String toString(){
        return(super.toString()+",Speed=("+xSpeed+ySpeed+")");
    }

    public MovablePoint move(){
        setX(getX()+xSpeed);
        setY(getY()+ySpeed);
        return this;
    }


}
