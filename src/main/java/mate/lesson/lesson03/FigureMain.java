package mate.lesson.lesson03;

public class FigureMain {
    /*
        Write the interface Shape with method ```public Double getArea()```
        and classes Rectangle and Circle.
        All these classes should implement the Shape interface.
        Override method getArea in corresponding way.
     */

    public static void main(String[] args) {
        Circle circle1 = new Circle(10.0);
        Rectangle rectangle1 = new Rectangle(5.0, 4.0);
        rectangle1.getArea();
        circle1.getArea();

//        double sumOfArea = calculateArea(new Shape[]{circle1, rectangle1});
//        System.out.println(sumOfArea);
    }

    private static double calculateArea(Shape[] shapes) {
        double result = 0;
        for (Shape shape: shapes) {
            result = result + shape.getArea();
        }
        return result;
    }
}
