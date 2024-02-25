class Rectangle

    {
    int a,b,h;
    int rectarea(int x,int y )
    {
     a=x;
     b=y;
     int a1=a*b;
     System.out.println("area="+a1);
    }
}
class Box extends Rectangle
{
 int boxarea(int x,int y,int z)
 {
 a=x;
 b=y;
 h=z;
 int a2=a*b*h;
 System.out.println("area of box="+a2);
 }
}
class Areas
{
    public static void main(String arg[])
    {
        Box ob=new Box();
        ob.rectarea(10,20);
        ob.boxarea(10,20,30);

   }

}
