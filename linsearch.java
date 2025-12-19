import java.util.*;
public class linsearch{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int n,i,temp;
System.out.println("enter array size:");
n=sc.nextInt();
int a[]=new int[n];
System.out.println("enter elements:");
for(i=0;i<n;i++)
{
a[i]=sc.nextInt();
}
System.out.println("enter element to search:");
temp=sc.nextInt();
for(i=0;i<n;i++)
{
if(a[i]==temp)
{
System.out.println("element "+temp+" found at index "+i);
}}
}}
