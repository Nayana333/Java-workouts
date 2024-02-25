import java.util.Scanner;
class Armstrongexception extends Exception
{
private int ex;
Armstrongexception(int a)
{
ex=a;
}
public String toString()
{
return "ArmstrongException:"+ex+"is an armstrong number";
}}
