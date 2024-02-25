import java.util.Scanner;
abstract class Special
{
    abstract void special(int n);
}
class Square extends Special
{
    void special(int n)
    {
      int i,j;
      for(i=0;i<n;i++)
      {
        for(j=i;j<=i;j++)
        {
            if(i==(j*j))
            System.out.println(+i);
        }
      }
    }
}

class Perfect
{
    public static void main(String arg[])
    {
        Scanner s=new Scanner (System.in);
        Square p =new Square();
        int n;
        System.out.println("enter the number:");
        n=s.nextInt();
        p.Special(n);
    }
}

