class A 
{
int a,b;
A(int x, int y)
{
a=x;
b=y;
}
void put()
{
  System.out.println("a="+a);
  System.out.println("b="+b);
}
}
class B extends A
{
int c,d;
B(int m,int n,int p,int q)
{
super(m,n);
c=p;
d=q;
}
void put()
{
super.put();
System.out.println("c="+c);
System.out.println("b="+b);
}
public static void main(String arg[])
{
new B(10,20,30,40).put();
}
}