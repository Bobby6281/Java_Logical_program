import java.util.*;
class Productbill
{
public static void main(String args[])
{
Scanner Sc=new Scanner(System.in);
int Pno;
String Pname,Plocation;
float Pprice,Pquantity;
System.out.println("Enter the product  number:");
Pno=Sc.nextInt();
System.out.println("Enter the product name:");
Pname=Sc.next();
System.out.println("Enter the product location:");
Plocation=Sc.next();
System.out.println("Enter the product price:");
Pprice=Sc.nextFloat();
System.out.println("Enter the product quantity:");
Pquantity=Sc.nextFloat();

float Bill=Pprice*Pquantity;

System.out.println("product  number is:"+Pno);
System.out.println("product  name is:"+Pname);
System.out.println("product location is:"+Plocation);
System.out.println("product price is:"+Pprice);
System.out.println("product quantity is:"+Pquantity);
System.out.println("product BILL  is:"+Bill);

}
}
