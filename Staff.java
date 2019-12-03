import java.util.*;


public class Staff extends Person{
private String Id;
private String CPR;
private double Salary;
private String position; 

public Staff() {}

     Scanner console= new Scanner(System.in);
 
public Staff(String Id,String CPR,String firstName,String lastName, String telephoneNumber,String address,int age,double Salary, String position)
{
super(firstName,lastName,telephoneNumber,address,age);
this.Id=Id;
this.CPR=CPR;
this.Salary=Salary;
this.position=position;
}

public String getId()
{
return Id;
}
public String getCPR()
{
return CPR;
}
public double getSalary()
{
return Salary;
}
public String getPosition()
{
return position;
}


public void setId(String Id)
{
this.Id=Id;
}
public void setCPR(String CPR)
{
this.CPR=CPR;
}
public void setSalary(double Salary)
{
this.Salary=Salary;
}
public void setPosition(String position)
{
this.position=position;
}


 //toString
   @Override
   public String toString() {
        return String.format ("Id: "+Id+"CPR: " +CPR+ ", First Name:" + getFirstName() + ", Last Name: " +  getLastName() + ", Address: " + getAddress() + ", Phone Number: " + getTelephoneNumber()+", Age;"+getAge()+", Salary: "+Salary+", Position: "+position);
    }
  public String toFile(){
      return (Id + " " + CPR + " " + getFirstName() + " " +  getLastName() + " " + getAddress() + " " + getTelephoneNumber() + " " + getAge() + " " + position + " "+salary);
   }
     public void changeStaff()
  {
  System.out.println("What part of the staff's information do you want to change");
  System.out.println("1. CPR number");
  System.out.println("2. First Name");
  System.out.println("3. Last Name");
  System.out.println("4. Address");
  System.out.println("5. Phone number");
  System.out.println("6. Age");
  System.out.println("7. Salary");
  System.out.println("8. Position");
  int choice=console.nextInt();
      console.nextLine();
  if(choice==1)
  {
  System.out.println("Enter the staff members new CPR");
  String CPR= console.nextLine();
  setCPR(CPR);
  System.out.println("CPR has been changed");
  }
  else if(choice==2)
  {
  System.out.println("Enter the staff members new first name");
  String firstName=console.nextLine();
  setFirstName(firstName);
  System.out.println("Staff members first name has been changed.");
  }
  else if(choice==3)
  {
  System.out.println("Enter the staff members new last name");
  String lastName=console.nextLine();
  setLastName(lastName);
  System.out.println("Staff members last name has been changed");
  }
  else if(choice==4)
  {
  System.out.println("Enter the staff members new address");
  String address=console.nextLine();
  setAddress(address);
  System.out.println("Staff members adress has been changed");
  }
  else if(choice==5)
  {
  System.out.println("Enter staff members new telephone number");
  String number=console.nextLine();
  setPhoneNr(number);
  System.out.println("Staff members number has been changed");
  }
  else if(choice==6)
  {
  System.out.println("Enter staff member new age");
  int age=console.nextInt();
  setAge(age);
  System.out.println("Staff members age has been changed");
  }
  else if(choice==7)
  {
  System.out.println("Enter staff members new salary");
  double salary=console.nextDouble();
  setSalary(salary);
  System.out.println("Staff members salary has been changed");
  }
  else if(choice==8)
  {
  System.out.println("Enter staff members new position");
   System.out.println("1.Cleaning Lady");
   System.out.println("2.Receptionist");
   System.out.println("3.Director");
   System.out.println("4.Accountant");
   int positionChoice=console.nextInt();
   double salary=0;
      if(positionChoice==1)
        {
            setPosition("Cleaning Lady");
            setSalary(10000); 
            System.out.println("Staff members position and salary have been changed"); 
        }
      else if(positionChoice==2)
         {
         setPosition("Receptionist");
         setSalary(20000);
         System.out.println("Staff members position and salary have been changed"); 

         }
      else if (positionChoice==3)
         {
         setPosition("Director");
          setSalary(50000);
           System.out.println("Staff members position and salary have been changed"); 

         }
      else if(positionChoice==4)
      {
         setPosition("Accountant");
          setSalary(40000);
            System.out.println("Staff members position and salary have been changed"); 

      }

     }
    else{
  System.out.println("Wrong choice selection try again");
  changeStaff();
  }
  
   System.out.println("Do you want to change something else? 1. Yes/ 2. No");
   int restart=console.nextInt();
  if(restart==1)
   {
   changeStaff();
   }
   else if(restart==2)
   {
   System.out.println("Returning to menu...");
   }

  
  }
  
}