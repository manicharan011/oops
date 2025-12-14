import java.util.*;
public class employee1{
String emp_name;
int emp_age;
String emp_gender;
float emp_salary;
String emp_desination;
String emp_address;

void insertRecord(String name1,int age1,String gender1,float salary1,String desination1,String address1){
emp_name=name1;
emp_age=age1;
emp_gender=gender1;
emp_salary=salary1;
emp_desination=desination1;
emp_address=address1;
}
void display(){
System.out.println(" name: "+emp_name+" age: "+emp_age+" gender: "+emp_gender+" salary:"+emp_salary+" desination: "+emp_desination+" address: "+emp_address);
}
}


class demo{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int i;
String name;
int age;
String gender;
float salary;
String desination;
String address;
System.out.println("enter number of employees:");
int n=sc.nextInt();
sc.nextLine();
employee1 emp[]=new employee1[n];

for(i=0;i<n;i++){
System.out.println("enter employee "+(i+1)+" details:");
System.out.println("enter name:");
name=sc.nextLine();
System.out.println("enter age:");
age=sc.nextInt();
sc.nextLine();
System.out.println("enter gender:");
gender=sc.nextLine();
System.out.println("enter salary:");
salary=sc.nextFloat();
sc.nextLine();
System.out.println("enter desination:");
desination=sc.nextLine();
System.out.println("enter address:");
address=sc.nextLine();
emp[i] = new employee1();
emp[i].insertRecord(name,age,gender,salary,desination,address);
}
System.out.println("employees details:");
for(i=0;i<n;i++){
emp[i].display();
}
String search;
boolean f=false;
System.out.println("enter employee name to search:");
search=sc.nextLine();
for(i=0;i<n;i++){
if(search.equalsIgnoreCase(emp[i].emp_name)){
emp[i].display();
f=true;
}
}
if(f==false){
System.out.println("details not found of employee "+search);
}
}}


