class Shape
{
    void draw()
    {
        System.out.println("drawing shape");
    
    }
}
class Triangle extends Shape
{
    void draw()
    {
        System.out.println("drawing triangle");
    
    }

}
class Rectangle extends Shape
{
    void draw()
    {
        System.out.println("drawing rectangle");
    }

}
class Test
{
    public static void main(String arg[])
    {
        Shape s=new Shape();
        s=new Shape();
        s.draw();
        s=new Rectangle();
        s.draw();
        s=new Triangle();
        s.draw();
        
    }
}