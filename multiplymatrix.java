import java.util.*;
public class multiplymatrix{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int i,j,k,r1,c1,r2,c2;
System.out.println("enter r1,c1 and r2,c2:");
r1=sc.nextInt();
c1=sc.nextInt();
r2=sc.nextInt();
c2=sc.nextInt();
if(c1==r2)
{
int a[][]=new int[r1][c1];
System.out.println("enter 1st elements:");
for(i=0;i<r1;i++)
{
for(j=0;j<c1;j++)
{
a[i][j]=sc.nextInt();
}}
int b[][]=new int[r2][c2];
System.out.println("enter 2nd elements:");
for(i=0;i<r2;i++)
{
for(j=0;j<c2;j++)
{
b[i][j]=sc.nextInt();
}}
int res[][]=new int[r1][c2];
System.out.println("the resultant matrix is:");
for(i=0;i<r1;i++)
{
for(j=0;j<c2;j++)
{
res[i][j]=0;
for(k=0;k<r1;k++)
{
res[i][j]=res[i][j]+(a[i][k]*b[k][j]);
}
System.out.print(res[i][j]+" ");
}
System.out.println();
}

}
else
{
System.out.println("matrix multiplication not possible");
}
}}
