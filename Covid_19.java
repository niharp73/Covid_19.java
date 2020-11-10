import java.io.*;
import java.util.*;


class Patient{
private String name;
private String country;
private String city;
private String street;
private boolean is_positive;

private HashMap<String , Boolean> symptons = new HashMap<String , Boolean>();


public Patient(String name , String country , String city , String street , boolean is_positive){
this.name = name;
this.country = country;
this.city = city;
this.street = street;
this.is_positive = is_positive;
this.symptons.put("fever" , false);
this.symptons.put("tiredness" , false);
this.symptons.put("dry cough" , false);
this.symptons.put("diarrheoa" , false);
this.symptons.put("sore throat" , false);
}

public void set_symptons(){
Scanner in = new Scanner(System.in);
Boolean response;
System.out.println("Please enter true or false if you have had below mentioned symptons :\n");
for (Map.Entry<String , Boolean> entry : this.symptons.entrySet()){
System.out.print(entry.getKey() + " : ");
response = in.nextBoolean();
if(response){
this.symptons.put(entry.getKey() , response);
}
}
}


public String get_name(){
return this.name;
}

public String get_country(){
return this.country;
}

public String get_city(){
return this.city;
}

public String get_street(){
return this.street;
}

public boolean get_status(){
return this.is_positive;
}

public HashMap<String , Boolean> get_symptons(){
return this.symptons;
}


@Override
public String toString(){
String sep = "\n***************************************************\n";
String s = "Name : " + this.name + "\nCountry : " + this.country + "\nCity : " + this.city + "\nStreet : " + this.street + "\nStatus : " + this.is_positive + "\n";
String symp = "";
for(Map.Entry<String , Boolean> entry : this.symptons.entrySet()){
symp += entry.getKey() + " : " + entry.getValue() + "\n";
}
return sep + s + symp;
}
}

public class Covid_19
{
   public static void main(String[] args) {
Scanner in = new Scanner(System.in);
       int num_patients = 1;
       int count = 0;
       String name;
       String country;
       String city;
       String street;
       boolean status;
       while(count < num_patients){
       System.out.println("Enter the details for patient " + count+1);
       System.out.print("Name : ");
       name = in.nextLine();
       System.out.print("Country    : ");
       country = in.nextLine();
       System.out.print("City    : ");
       city = in.nextLine();
       System.out.print("Street    : ");
       street = in.nextLine();
       System.out.print("Are you tested positive for covid-19 virus (true / False) : ");
       status = in.nextBoolean();
       Patient p = new Patient(name , country , city, street, status);
       p.set_symptons();
       System.out.println(p);
       count += 1;
       }
   }
}
