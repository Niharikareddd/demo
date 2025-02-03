public class Person
{
   String name;
   int age;
   Person(String s, int k)// Person()
   
{
  name=s;//munni;
  age=k;//55;
}
void talk()
{
  System.out.println("Hello my name is :"+ name);
  System.out.println("My age is :"+ age);
}
public static void main(String[] args)
{
/*Person p1=new Person();
p1.talk();*/
new Person("Bubblu", 13).talk();//new Person().talk();
new Person("Nikitha",20).talk();
}
}

/*
  
public class Person
{
   String name;
   int age;
   void talk()
{
 System.out.println("Hello my name is :"+ name);
 System.out.println("My age is :"+ age);
}
public static void main(String[] args)
{
Person p1=new Person();
p1.name="bubblu";p1.age=13;
p1.talk();
}
}
*/
