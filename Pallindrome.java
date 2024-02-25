class Pallindrome
{
public static void main(String arg[])
{
    int rev,sum=0,temp;
    int n=Integer.parseInt(arg[0]);
    temp=n;
    while(n>0)
    {
        rev=n%10;
        sum=(sum*10)+rev;
        n=n/10;
    }
    if(temp==sum)
    {
        System.out.println("pallindrome");
    }
    else
    {
        System.out.println("not pallindrome");
    }
}
}