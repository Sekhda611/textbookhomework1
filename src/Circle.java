/*
 * @class Circle
 * @author: Sonal Sekhda
 * @course: ITEC 2140 - 04, spring 2023
 * @date: January 27, 2023
  */
public class Circle {
    public static void main(String[] args){
        double radius = 9.5;
        double area;
        area = radius * radius * Math.PI;
        System.out.println("area of the circle  = " + area);
        double perimeter;
        perimeter = 2 * radius * Math.PI;
        System.out.println("perimeter of the circle = " + perimeter);
    }
}
