public class Marks
{
int adno,m,p,c,total;
double avg;
void getMarks(int no,int s1,int s2,int s3)
{
 adno=no;
 m=s1;
 p=s2;
 c=s3;
}

void putMarks()
{
total = m+p+c;
avg=total/3.0;
System.out.println("Adno="+adno);
System.out.println("Total="+total);
System.out.println("Average="+avg);
}
public static void main(Srtings[] args)
{
Marks.student = new Marks();
student.getMarks(1,85,90,88);
student.putMarks();
}
}

