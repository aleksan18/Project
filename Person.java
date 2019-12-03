public class Person
{
private String firstName;
private String lastName;
private String telephoneNumber;
private String address;
private int Age;

public Person (){}


public Person(String firstName,String lastName, String telephoneNumber,String address,int Age)
{
this.firstName=firstName;
this.lastName=lastName;
this.telephoneNumber=telephoneNumber;
this.address=address;
this.Age=Age;

}
  public int getAge()
  {
  return Age;
  }
  public String getFirstName () {
      return firstName;
}
   public String getLastName() {
      return lastName;
}
   public String getAddress() {
      return address;
}
   public String getTelephoneNumber () {
      return telephoneNumber;
}

   public void setAge(int Age)
   {
   this.Age=Age;
   
   }
public void setFirstName (String firstName) {
      this.firstName = firstName;
}
   public void setLastName (String lastName) {
      this.lastName = lastName;
}
   public void setAddress (String address) {
      this.address = address;
}
   public void setPhoneNr (String telephoneNumber) {
      this.telephoneNumber = telephoneNumber;
}

 

}