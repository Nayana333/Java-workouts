class Room
{
    int length,breadth;
    Room(int x,int y) 
  {
    length=x;
    breadth=y;
  }
  Room(int a)
  {
    length=breadth=a;
  }
  int area()
  {
    return(length*breadth);
  }
}
  class Rooms
  {
    public static void main(String arg[])
    {
        Room r1=new Room(10,20);
        Room r2=new Room(10);
        float area1=r1.area();
        float area2=r2.area();
        System.out.println("Area1="+area1);
        System.out.println("Area2="+area2);
    }


}