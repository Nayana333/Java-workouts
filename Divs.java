class Divs
{
public static void main(String arg[])
{
int count=0,sum=0,i;
for(i=100;i<200;i++)
{
if(i%7==0)
{
count++;
sum=sum+i;
}
}
System.out.println("count="+count);
System.out.println("sum="+sum);
}
}