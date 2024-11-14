import java.io.*;
public class main1()
{
public static void main(String[] args)
{
try
{
bufferedReader reader=new BufferedReader(new FileReader("numbers.txt"));
BufferedWriter evenwriter=new BufferedWriter(new FileWriter("even.txt"));
BufferedWriter oddwriter=new BufferedWriter(new FileWriter("odd.txt"));
String line;
while((line=reader.readLine())!=null);
{
int n= int ParseInt(line);
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
}
catch(IOException e)
{
System.out.println("error"+e.getmessage());
;
}
}


