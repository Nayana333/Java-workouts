import java.util.Scanner.*;
interface Exam
{
    Boolean pass(int mark);
}
interface Classify
{
  String division(int average);
    
}
class Result implements Exam,Classify
{
    Boolean Pass(int mark)
    {
        if (mark>50)
        {
            System.out.println("true");
        }
        else
        {
        System.out.println("false");
        }
    }
    String Division(int average)
    {
        if(average>60)
        {
            System.out.println("first");
        }
        else
        {
         System.out.println("no division");
        }

    }
}
class Resultdemo
{
    public static void main(String arg[])
    {
        Result r=new Result();
        boolean a=r.Pass(70);
        String s=r.Division(70);
        System.out.println("mark="+a);
        System.out.println("average="+s);
    }
}