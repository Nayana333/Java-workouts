class Vol
{
  int a,l,b;
  double r,h;
  void volume(int x)
  {
    a=x;
    int v1=a*a;
    System.out.println("volume="+v1);
  }  
  void volume(int x,int y,int z)
  {
    a=x;
    b=y;
    l=z;
    int v2=a*b*l;
    System.out.println("volume="+v2);
  }
  void volume(int x,int y)
  {
  r=x;
  h=y;
  double v3=(3.14*(r*r)*h);
  System.out.println("volume="+v3);
  }
}
class Volumes
{
public static void main(String arg[])
{
   Vol v=new Vol();
   v.volume(10);
   v.volume(10,20,30);
   v.volume(5,10);
}
}