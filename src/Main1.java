public class Main1 {
    public static void main(String[] args) {

        Shape s;

        s=new Circle(44);
        System.out.println("Radius of Circle: "+s.area()+"\n");

        s= new Rectangle(776,88);
        System.out.println("Area of Rectangle: "+s.area()+"\n");

        Student s1= new Student("ALi",88);
        System.out.println("Name: "+s1.getName());
        System.out.println("Marks: "+s1.getMarks());

        s1.setName("Hamza");
        s1.setMarks(55);
    }
}
abstract class Shape{

    abstract double area();
}
class Circle extends Shape{
    private double radius;

    public Circle(double radius){
        this.radius=radius;
    }

    @Override
    double area(){
        double a= Math.PI*radius*radius;
        return a;
    }
}
class Rectangle extends Shape{
    private double height;
    private double width;

    public Rectangle(double height, double width){

        this.height=height;
        this.width=width;
    }

    @Override
    double area(){
        return height*width;
    }
}
class Student{

    private String name;
    private double marks;

    public Student(String name, double marks){
            this.name=name;
            this.marks=marks;
    }

    void setName(String name){
        this.name=name;
        System.out.println("Update Name: "+this.name+"\n"); //“update this object’s name to the value passed in parameter”
    }

    void setMarks(double marks){
        this.marks=marks;
        System.out.println("Updated Marks: "+this.marks+"\n");//“update this object’s marks to the value passed in parameter”
    }

    String getName(){
        return this.name;
    }

    double getMarks(){
        return this.marks;
    }
}
