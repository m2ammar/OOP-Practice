package Practice4;

abstract class Shape {

    protected String color;
    protected double area;

    public Shape(String color){
        this.color=color;
    }

   public String getColor(){
        return this.color;
    }

    public double getArea(){
       return this.area;
    }
    void setColor(String color){
       this.color=color;
    }

    public void setArea(double area){
        this.area=area;
    }

    public abstract void calculateArea();
}

class Circle extends Shape{

    private double radius;

    public Circle(String color, double radius){
        super(color);
        this.radius=radius;
    }

    @Override
    public void calculateArea(){
        double temp= Math.PI*radius*radius;
        this.area=temp;
    }

    public double getRadius(){
        return this.radius;
    }

    public void setRadius(double radius){
        this.radius=radius;
    }
}
class Rectangle extends Shape{
    private double height;
    private double width;

    public Rectangle(String color, double height, double width){
        super(color);
        this.height=height;
        this.width=width;
    }

    @Override
    public void calculateArea(){
        double temp=height*width;
        this.area=temp;
    }

    public double getHeight(){
        return this.height;
    }
    public double getWidth(){
        return this.width;
    }

    public void setHeight(double height){
        this.height=height;
    }
    public void setWidth(double width){
        this.width=width;
    }
}