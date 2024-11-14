import java.io.*;
import java.util.Scanner;
public class main2()
{
public static void main(String[] args)
{
Scanner scanner=new Scanner(System.in);
BufferedWriter evenwriter=new BufferedWriter(new FileWriter("even.txt"));
BufferedWriter oddwriter=new BufferedWriter(new FileWriter("odd.txt"));
System.out.prinln("enter the numbers:");
int n=scanner.nextInt();
if(n%2==0)
{
evenwriter.write();
}
else
{
oddwriter.write();
}
evenwriter.close();
oddwriter.close();
}
}