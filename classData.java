class Data
{
int a,b;
void get()
{
System.out.println("Enter first value");
a=new java.util.Scanner(System.in).nextInt();
System.out.println("Enter second value");
b=new java.util.Scanner(System.in).nextInt();
}
void put()
{
System.out.println("a="+a);
System.out.println("b="+b);
}
}
class munni extends Data
{
int add,sub;
void calc()
{
add=a+b;
sub=a-b;
}
void put()
{
super.put();
System.out.println("Add result="+add);
System.out.println("Sub result="+sub);
}
public static void main(String[] args)
{
munni k= new munni();
k.get();
k.calc();
k.put();
}
}
