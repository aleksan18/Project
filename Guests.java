import java.util.*;
import java.io.*;

public class Guests extends Person {
   private String country; 
   private String passportNumber;
   private int roomId;
   //constructors
public Guests () {}

     Scanner console= new Scanner(System.in);

public Guests (String passportNumber, String firstName,String lastName, String telephoneNumber,String address,int age, String country,int roomId) {
   super(firstName,lastName,telephoneNumber,address,age);
   this.country=country;
   this.passportNumber=passportNumber;
   this.roomId=roomId;
   }
   public String getCountry()
   {
   return country;
   }
   public String getPassportNumber()
   {
   return passportNumber;
   }
   public int getRoomId()
   {
   return roomId;
   }
   
   public void setCountry(String country)
   {
   this.country=country;
   }
   public void setPassportNumber(String passportNumber)
   {
   this.passportNumber=passportNumber;
   }
   public void setRoomId(int roomId)
   {
   this.roomId=roomId;
   }
   //toString
   @Override
   public String toString() {
        return String.format ("Passport Number: " + passportNumber + ", First Name: " + getFirstName() + ", Last Name: " + getLastName() + ", Address: " + getAddress() + ", Phone Number: " + getTelephoneNumber()+", Age: "+getAge()+", Country: "+country+", Room: "+roomId);
    }
    public String toFile() {
        return (passportNumber + " " + getFirstName() + " " + getLastName() + " " +  getTelephoneNumber() + " " + getAddress() + " " + getAge() + " " + country + " " + roomId);

    }
      
   public void changeGuest()
   {
   System.out.println("What part of the guests's information do you want to change");
  System.out.println("1. Passport number");
  System.out.println("2. First Name");
  System.out.println("3. Last Name");
  System.out.println("4. Address");
  System.out.println("5. Phone number");
  System.out.println("6. Age");
  System.out.println("7. Country");
  System.out.println("8. Room");
  int choice=console.nextInt();
      console.nextLine();
  if(choice==1)
  {
  System.out.println("Enter the guests new passport number");
  String passportNumber= console.nextLine();
  setPassportNumber(passportNumber);
  System.out.println("Passport number has been changed");
  }
  else if(choice==2)
  {
  System.out.println("Enter the guest new first name");
  String firstName=console.nextLine();
  setFirstName(firstName);
  System.out.println("Guests first name has been changed.");
  }
  else if(choice==3)
  {
  System.out.println("Enter guests new last name");
  String lastName=console.nextLine();
  setLastName(lastName);
  System.out.println("Guests last name has been changed");
  }
  else if(choice==4)
  {
  System.out.println("Enter the guests new address");
  String address=console.nextLine();
  setAddress(address);
  System.out.println("Guests address has been changed");
  }
  else if(choice==5)
  {
  System.out.println("Enter guests new telephone number");
  String number=console.nextLine();
  setPhoneNr(number);
  System.out.println("Guests number has been changed");
  }
  else if(choice==6)
  {
  System.out.println("Enter guests new age");
  int age=console.nextInt();
  setAge(age);
  System.out.println("Guests age has been changed");
  }
  else if(choice==7)
  {
  System.out.println("Enter the guests new country");
  String country=console.nextLine();
  setCountry(country);
  System.out.println("Guests country has been changed");
  }
  else if(choice==8)
  {
  System.out.println("Enter the guests new room(by room ID)");
  int roomId=console.nextInt();
  setRoomId(roomId);
  System.out.println("Guests room has been changed");
  }
  else{
  System.out.println("Wrong choice selection try again");
  changeGuest();
  }
   System.out.println("Do you want to change something else? 1. Yes/ 2. No");
   int restart=console.nextInt();
  if(restart==1)
   {
   changeGuest();
   }
   else if(restart==2)
   {
   System.out.println("Returning to menu...");
   }

   }
}