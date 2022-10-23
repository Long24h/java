public class MovablePoint extends Point2d {
    private float xSpeed = 0.0F, ySpeed = 0.0F;

    public float getXSpeed() {
        return this.xSpeed;
    }

    public void setXSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getYSpeed() {
        return this.ySpeed;
    }

    public void setYSpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public MovablePoint() {

    }

    public MovablePoint(float x, float y) {
        super(x, y);
    }

    public MovablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public void setSpeed(float xSpeed, float ySpeed){
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public float[] getSpeed(){
        float[] arr = new float[2];
        arr[0] = this.xSpeed;
        arr[1] = this.ySpeed;
        return arr;
    }
    public String toString(){
        return "This point has coordinate: (" + getX() + ", " + getY() + "), speed = ("
                + getXSpeed() + ", " +getYSpeed() + ")";
    }
    public String move(){
//        float x = getX();
//        float y = getY();
//        x += getXSpeed();
//        y += getYSpeed();
//        System.out.println( x + " , " + y);
        setX(getX() + getXSpeed());
        setY(getY() + getYSpeed());
        return "This point move to: x = " + getX() + ", y = " + getY() + ")";

    }
}
