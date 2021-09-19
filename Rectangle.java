/* Q1.Check weather the area of the rectangle is greater than the perimeter of the rectangle of length =5 and breadth= 10*/
public class Rectangle {
    public static void main(String [] args){
        int length=5;
        int breadth=10;
        int area=length *breadth;
        int perimeter=2*(length+breadth);
        System.out.println("area="+area+" "+"perimeter="+perimeter);
        if(area>perimeter)
        {
            System.out.println("The area of the rectangle is greater than perimeter");
        }
        else{
            System.out.println("The perimeter of the rectangle is greater than area");
        }
    }
}