package Interfaces;
// Interface is an abstract class without body
interface Polygon{
    public  void getArea(int length,int breadth);
}
 class Rectangle implements Polygon{
    public void getArea(int length,int breadth){
        System.out.println("Area of Rectangle is "+(length*breadth));
    }

}
public class javaInterface {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle();
        rect.getArea(5,7);

    }
}
