import java.util.*;
public class binsearch{
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
int front=0,back=n-1,mid;
while(front<=back)
{
mid=(front+back)/2;
if(a[mid]<temp)
{
front=mid+1;
}
else if(a[mid]==temp)
{
System.out.println("element "+temp+" found at index "+mid);
break;
}
else
{
back=mid-1;
}
}
}}