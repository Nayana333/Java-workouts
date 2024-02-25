package salarypack;
public class Salarypack
{
int empno,bpay;
String name;
double total,hra,da,pf; 
public void salary( String n,int id,int b)
{
name=n;
empno=id;
bpay=b;
}
public void display()
{
 da=bpay*2;
 hra=bpay*2;
 pf=bpay*.5;
 total=da+hra+bpay-pf;
 System.out.println("salary slip"); 
 System.out.println("name="+name); 
 System.out.println("emp id="+empno); 
 System.out.println("total="+total); 
}
}
