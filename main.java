import java.util.Scanner;
class vehicle
{
private double milage;
private double price;
public vehicle(double milage,double price)
{
this.milage=milage;
this.price=price;
}
double getmilage()
{
return milage;
}
double getprice()
{
return price;
}
}
class car extends vehicle
{
private double ownershipcost;
private double warranty;
private int seatingcapacity;
private String fueltype;
super(milage,price);
car(double milage,double price,double ownershipcost,double warranty,int seatingcapacity,String fueltype);{
this.ownershipcost=ownershipcost;
this.warranty=warranty;
this.seatingcapacity=seatingcapacity;
this.fueltype=fueltype;
}
double getownershipcost()
{
return ownershipcost;
}
double getwarranty()
{
return warranty;
}
int getseatingcapacity()
{
return seatingcapacity;
}
String getfueltpe()
{
return fueltype;
}
}
class Maruthi extends car
{
int modeltype;
super(milage,price,ownershipcost,warranty,seatingcapacity,fueltype);
Maruthi(double milage,double price,double ownershipcost,double warranty,int seatingcapacity,String fueltype,int modeltype);
{
this.modeltype=modeltype;
}
int getmodeltype()
{
return modeltype;
}
}
public class main
{
public static void main(String[] args)
{
Scanner scanner = new Scanner(System.in);
System.out.println("enter the no of vehicles");
int n=scanner.nextInt();
Maruthi[] maruthicars=new Maruthi[n];
for(int i=0;i<n;i++)
{
System.out.println("the details of the car"+(i+1));
System.out.println("Enter milage:");
double milage=scanner.nextDouble();
System.out.println("enter price:");
double price=scanner.nextDouble();
System.out.println("enter ownership cost:");
double ownershipcost=scanner.nextDouble();
System.out.println("enter warranty:");
double warranty=scanner.nextDouble();
System.out.println("enter seating capacity:");
int seatingcapacity=scanner.nextInt();
System.out.println("enter fuel type:");
String fueltype=scanner.nextLine();
System.out.println("enter mode; type:");
int modeltype=scanner.nextInt();
maruthicars[i]=new Maruthi(milage,price,ownershipcost,warranty,seatingcapacity,fueltype,modeltype);
}
System.out.println("the details of the cars");
for(Maruthi maruthi:maruthicars)
{
System.out.println("the milage is:"+maruthi.getmilage());
System.out.println("the price is:"+maruthi.getprice());
System.out.println("the ownershipcost is:"+maruthi.getownershipcost());
System.out.println("the warranty is"+maruthi.getwarranty());
System.out.println("the seating capacity is"+maruthi.getseatingcapacity());
System.out.println("the fuel tyoe is"+maruthi.getfueltype());
System.out.println("the model tpe is:"+maruthi.getmodeltype());
}
Scanner.close();
}
}

