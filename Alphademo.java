class Alpha
{
    int x;
    Alpha(int a)
    {
        x=a;
    }
    void alphashow()
    {
        System.out.println("x="+x);
    }

}
class Beta extends Alpha
{
int p,q;
Beta(int a,int b,int c)
{
super(a);
p=b;
q=c;
}
void betashow()
{
    System.out.println("p="+p);
    System.out.println("q="+q);
}
}
class Alphademo
{
    public static void main(String arg[])
    {
        Beta b=new Beta(10,20,30);
        b.alphashow();
        b.betashow();
    }
}
