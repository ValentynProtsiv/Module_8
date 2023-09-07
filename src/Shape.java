interface GettingName{
    String getName();
}

public abstract class Shape implements  GettingName{

    public String getName(){
        return "shape";
    }
}
class Circle extends Shape {
    public String getName(){
        return "circle";
    }
}
class Quad extends Shape {
    public String getName(){
        return "quad";
    }
}
class Triangle extends Shape{
    public String getName(){
        return "triangle";
    }
}
class Rectangle extends Shape{
    public String getName(){
        return "rectangle";
    }
}
class Square extends Shape{
    public String getName(){
        return "square";
    }
}

class Launcher {
    public static void main(String[] args) {
          Circle circle = new Circle();
          Quad quad = new Quad();
          Triangle triangle = new Triangle();
          Rectangle rectangle = new Rectangle();
          Square square = new Square();

          System.out.println(circle.getName());
          System.out.println(quad.getName());
          System.out.println(triangle.getName());
          System.out.println(rectangle.getName());
          System.out.println(square.getName());
    }
}