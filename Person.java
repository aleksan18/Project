public class Person
{
private String firstName;
private String lastName;
private String telephoneNumber;
private String address;
private int age;

public Person (){}


public Person(String firstName,String lastName, String telephoneNumber,String address,int age)
{
this.firstName=firstName;
this.lastName=lastName;
this.telephoneNumber=telephoneNumber;
this.address=address;
this.age=age;

}
  public int getAge()
  {
  return age;
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

   public void setAge(int age)
   {
   this.age=age;
   
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