public class Demo
{
public static void main(String[] args)
{
int a[]={11,22,33,44,55};
int s=0;
for(int el:a)//el is a loop var

{
s=s+el;
System.out.println(s);
}
}
}

/* el: A temporary variable that holds the value of each element in the array a during each iteration of the enhanced for loop.
The loop helps calculate the cumulative sum of all elements in the array, which is stored in s.*/

/* class Demo
{
public static void main(String[] args)
{
int a[]={11,22,33,44,55};
System.out.println("using for:");
for(int i=0;i<a.length;i++)
System.out.println("Using for each:");
for(int el:a)
System.out.println(el);
}
} */
