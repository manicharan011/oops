import java.util.*;
public class minmax5{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int i;
int a[]=new int[5];
System.out.println("enter 5 numbers:");
for(i=0;i<5;i++)
{
a[i]=sc.nextInt();
}
int min=a[0];
for(i=1;i<5;i++)
{
if(a[i]<min)
{
min=a[i];
}}
System.out.println("smallest among them is "+min);
int max=a[0];
for(i=1;i<5;i++)
{
if(a[i]>max)
{
max=a[i];
}}
System.out.println("largest among them is "+max);
}}


