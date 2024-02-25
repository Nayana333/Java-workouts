class Square
{   double l;
    void area(double a)
    {
        l=a;
        double a1=l*l;
        System.out.println("square="+a1);
    }
class Cube extends Square
{
  
  double a2;
  l=a;
  a2=(6*(l*l));
  System.out.println("area="+a2);
}
}
class Demo
{
    public static void main(String arg[])
    {
    Cube ob=new Cube();
    ob.area();
    }
}