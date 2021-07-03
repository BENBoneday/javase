import org.w3c.dom.ls.LSOutput;

public class HomeWork {
    public static void main(String[] args) {
        Vehicle s1 = new Vehicle();
        System.out.println(s1.getSize());
        System.out.println(s1.getSpeed());
        s1.setSpeed(200);
        s1.speedDown(s1.getSpeed());
        System.out.println(s1.getSpeed());
    }


}
class Vehicle{
    private int speed;
    private int size;
    public void move(){
        System.out.println("yidong");
    }
    public void speedUp(int speed){
        this.speed=speed+100;
    }
    public void speedDown(int speed){
        this.speed=speed-100;
    }

    public Vehicle() {
    }

    public Vehicle(int speed, int size) {
        this.speed = speed;
        this.size = size;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}