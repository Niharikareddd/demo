public class person1
{
   String name;
   int age;
   void getPersonData(String s, int a)
   
{
  name=s;
  age=a;
}
void talk()
{
  System.out.println("Hello my name is :"+ name);
  System.out.println("My age is :"+ age);
}
public static void main(String[] args)
{
person1 p1,p2;
p1=new person1();
p2=new person1();
p1.getPersonData("Bubblu",13);
p2.getPersonData("Puppy",21);
p1.talk();
p2.talk();
}
}


/*  {
   String name;
   int age;
   void getPersonData()//method 1
   
{
  name=munni;
  age=22;
}
void talk()//method 2
{
  System.out.println("Hello my name is :"+ name);
  System.out.println("My age is :"+ age);
}
public static void main(String[] args)
{
Person p1=new person1();
p1.getPersonData();
p1.talk();
}
}
*/





