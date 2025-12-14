import java.util.*;
public class calci{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int a,b;
char op;
System.out.println("enter a value:");
a=sc.nextInt();
System.out.println("enter b value:");
b=sc.nextInt();
System.out.println("enter operator:");
op=sc.next().charAt(0);
switch(op){
case'+':System.out.println("the sum is"+(a+b));
break;
case'-':System.out.println("the difference is"+(a-b));
break;
case'*':System.out.println("the product is"+(a*b));
break;
case'/':System.out.println("the answer is"+(a/b));
break;
}}}


