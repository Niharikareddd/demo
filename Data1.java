public class Data1
{
int x;
static int y;
Data1()
{
x++;
y++;
System.out.println("Instance variable value="+x);
System.out.println("Static variable value="+y);
}
public static void main(String[] args)
{
new Data1();
new Data1();
new Data1();
}
}
