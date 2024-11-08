import java.util.*;
class Student
{
public static void main(String args[])
{
Scanner Sc=new Scanner(System.in);
int Sno,M,P,C,Tot;
String Sname;
float Avg;
System.out.println("Enter the student  number:");
Sno=Sc.nextInt();
System.out.println("Enter the student name:");
Sname=Sc.next();
System.out.println("Enter the student marks in maths:");
M=Sc.nextInt();
System.out.println("Enter the student marks in physics:");
P=Sc.nextInt();
System.out.println("Enter the student marks in chemistry:");
C=Sc.nextInt();
Tot=M+P+C;
Avg=Tot/3;
System.out.println("student number is:"+Sno);
System.out.println("student  name is:"+Sname);
System.out.println("student marks in maths is:"+M);
System.out.println(" student marks in physics is:"+P);
System.out.println("student marks in chemistry is:"+C);
System.out.println("student total marks in all subjects:"+Tot);
System.out.println("student Average in all subjects:"+Avg);
}
}
