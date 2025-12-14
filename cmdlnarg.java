public class cmdlnarg{
public static void main(String[] args){
if(args.length==0)
{
System.out.println("no command line arguments provided");
}
else
{
for(int i=0;i<args.length;i++)
{
System.out.println(args[i]);
}}
}}