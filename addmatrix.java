import java.util.*;
public class addmatrix {
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int i,j,a,b;
System.out.println("enter row size and column size:");
a=sc.nextInt();
b=sc.nextInt();
int m[][]=new int[a][b];
int n[][]=new int[a][b];
System.out.print("enter 1st elements;");
for(i=0;i<a;i++){
for(j=0;j<b;j++){
m[i][j]=sc.nextInt();
}}
System.out.print("enter 2nd elements;");
for(i=0;i<a;i++){
for(j=0;j<b;j++){
n[i][j]=sc.nextInt();
}}
System.out.println("the elements are");
for(i=0;i<a;i++){
for(j=0;j<b;j++){
System.out.print((m[i][j]+n[i][j])+"\t");
}
System.out.println();
}
}}


