public class Data
{
void main()
{
System.out.println("Zero args");
}
void main(int x)
{
System.out.println("one args");
}
void main(int x,int k)
{
System.out.println("Two args");
}
public static void main(String[] args)
{
Data d = new Data();
d.main(10);
d.main();
d.main(10,20);
}
}