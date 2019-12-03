import java.util.*;
import java.io.*;

class HotelMain
{
   static Scanner console= new Scanner(System.in);
   static ArrayList<Room> room_list= new ArrayList<>();
   static ArrayList<Staff> staff_list = new ArrayList<>();
   static ArrayList<Guests> guest_list = new ArrayList<>();
   static ArrayList<Booking> bookings= new ArrayList<>();
   public static void main(String []args)
   {
   
   
      Guests guests= new Guests("10134893","Aleks","Vitalio","084639124","Street Georch Town 34",23,"USA",13);
      guest_list.add(guests);
   try{
   readFromFile();
   MENU(Intro());
   saveToFile();
   }
   catch(FileNotFoundException e)
   {
   System.out.println("Database file error");
   }
   }
    public void deleteStaff()
  {
  Staff loopStaff;
  String entry=console.nextLine();
  for(int i=0;i<=staff_list.size();i++){
  loopStaff=staff_list.get(i);
  if(loopStaff.getId().equals(entry))
  {
  staff_list.remove(i);
  }
  }
  }
      public static void booking() {
      int floor;
      int bedNr = 0;
      String startDate;
      String endDate;
      
      boolean internet = false;
      int show_room = 0;
      int choose_room = 0;
      String room_id = "";
   
      System.out.println("For what period you want to stay ? ");
      System.out.print("Please select start date: ");
      startDate = console.next();
      System.out.print("Please select end date: ");
      endDate = console.next();
      System.out.print("Select how many beds in room : ");
      bedNr = console.nextInt();
      // assgin 
      System.out.print("Do you want wifi in room ? Yes\\No ");
      String wifi = console.next();
      if (wifi.equals("yes")) {
         internet = true;
      } else if (wifi.equals("no")) {
         internet = false;
      }
      System.out.print("On what floor is the room you want ? 1\\2\\3\n\nEnter choice : ");
   
      ///Radu , to print the rooms from each floor
      floor = console.nextInt();
      
      for(int i = 0; i < room_list.size(); i++){
         if (room_list.get(i).getBeds() == bedNr && room_list.get(i).getInternet() == internet && room_list.get(i).getFloor() == floor){
            System.out.println((i + 1) + ". " + room_list.get(i).toString());
            show_room++;
         } 
      }
      if (show_room == 0){
         System.out.println("No such room");
         //MENU(user_type);
      }
      if (show_room >= 1){
         System.out.print("\n Choose room: ");
         choose_room = console.nextInt() - 1;
         System.out.println("Room is updated");
         System.out.println(room_list.get(choose_room).toString());
      
      }
      System.out.println();
      
      //compare to int roomID for printing only the numbers on that floor 
      int roomID=0;
      String guestID;
      String passportNumber = "";
      String firstName = "";
      String lastName = "";
      String telephoneNumber = "";
      String address = "";
      String country = "";
      int age = 0;
   for (int k=0; k<bedNr;k++){
      System.out.println("Input guest nr." + (k + 1) + ":");
      System.out.println("What is guest's first name?");
      firstName = console.next();
      System.out.println("What is the second name ?");
      lastName = console.next();
      System.out.println("What is the passport number?");
      passportNumber = console.next();
      System.out.println("What is the phone number?");
      telephoneNumber = console.next();
      System.out.println("What is the address the guest is living?");
      address = console.next();
      System.out.println("What is gues's age?");
      age = console.nextInt();
      System.out.println("What country is the guest coming from?");
      country = console.next();
      roomID = room_list.get(choose_room).getRoomId();
      guestID = passportNumber;
      guest_list.add(new Guests(passportNumber, firstName, lastName, telephoneNumber, address, age, country, roomID));
      bookings.add(new Booking(startDate, endDate, 5,roomID,guestID));
      System.out.println();
      }
      for(int i=0;i<guest_list.size();i++){
      System.out.println(guest_list.get(i).toString());
      } 
      System.out.println();
    for(int i=0;i<bookings.size();i++){
      System.out.println(bookings.get(i).toString());
      } 

      //bookings.add(new Booking(name, cpr));
   
      //roomID, String startDate, String endDate, int nrdays, String guestID
   
      // create object Booking 
   }

   static public void editGuest()
   {
   console.nextLine();
   System.out.println("Enter the guest_list passport number");
   String search=console.nextLine();
   for(Guests loopGuests:guest_list)
   {
   if(loopGuests.getPassportNumber().equals(search))
   {
   loopGuests.changeGuest();
   }
   else
   {
   System.out.println("Wrong");
   }
   }
   }
   static public void editRoom()
   {
   
   System.out.println("Enter Room Id you want to change");
   int change=console.nextInt();
   for(Room loopRoom:room_list)
   {
   if(loopRoom.getRoomId()==change)
   {
   loopRoom.changeRoom();
   }
   else
   {
   System.out.println("Wrong");
   }
   }
   
   }
   static public void printRoom()
   {
   System.out.println("              Room List      ");
   System.out.println("***********************************");
    for(Room loopRoom:room_list)
   {
      System.out.println(loopRoom.toString());
      System.out.println("--------------------------------------------------");
   }
   System.out.println("Returning to menu....");
 }
   static public void createRoom()
   {
      System.out.println("Enter Room ID: ");   
      int roomId=console.nextInt();
      System.out.println("Enter Number of Beds: ");
      int beds=console.nextInt();
      console.nextLine();
      System.out.println("Enter does it have Internet(Yes/No): ");
      String Internet = console.nextLine();
      boolean internet=true;
      if(Internet.equals("Yes"))
      {
         internet=true;
      }
      else if (Internet.equals("No"))
      {
         internet=false;
      }
      else{ System.out.println("Wrong input ");}
      
      System.out.println("Enter price: ");
      double price=console.nextDouble();
      System.out.println("Enter floor ");
      int floor=console.nextInt();
      Room createdRoom=new Room(roomId,beds,internet,price,floor);
      room_list.add(createdRoom);
      
   }

      static void editStaff()
    {
    System.out.println("            Staff List           " );
    System.out.println("*********************************");
    for(int i=0;i<staff_list.size();i++)
   {
         System.out.println(staff_list.get(i).toString());
   }
    System.out.println("*********************************");

   console.nextLine();
   System.out.println("Enter Staff's Id for who you want to change");
   String change=console.nextLine();
   for(Staff loopStaff:staff_list)
   {
   if(loopStaff.getId().equals(change))
   {
   loopStaff.changeStaff();
   }
   else
   {
   System.out.println("Wrong");
   }
   
   }
      
      
    }
      static void createStaff()
  {
  console.nextLine();
  System.out.println("Enter staff ID: ");
  String Id=console.nextLine();
  System.out.println("Enter staff member CPR number: ");
  String CPR=console.nextLine();
  System.out.println("Enter staff member's first name: ");
  String firstName=console.nextLine();
  System.out.println("Enter staff member's last name: ");
  String lastName=console.nextLine();
  System.out.println("Enter staff member's address:");
  String address=console.nextLine();
  System.out.println("Enter staff member's telephone:");
   String telephoneNumber=console.nextLine();
   System.out.println("Enter staff member's age: ");
   int age= console.nextInt();

   System.out.println("Pick staff member's position: ");
   System.out.println("1.Cleaning Lady");
   System.out.println("2.Receptionist");
   System.out.println("3.Director");
   System.out.println("4.Accountant");
   int positionChoice=console.nextInt();
   String position="";
      double salary=0;

      if(positionChoice==1)
        { 
            position="Cleaning Lady";
            salary=10000;  
        }
      else if(positionChoice==2)
         {
         position="Receptionist";
         salary=20000;
         }
      else if (positionChoice==3)
         {
         position="Director";
         salary=50000;
         }
      else if(positionChoice==4)
      {
         position="Accountant";
         salary=40000;
      }

   Staff staffMember= new Staff(Id,CPR,firstName,lastName,telephoneNumber,address,age,salary,position);  
   staff_list.add(staffMember);
   for(int i=0;i<staff_list.size();i++)
   {
         System.out.println(staff_list.get(i).toString());
   }
   
  }







      public static int Intro(){
         
         System.out.println("       Hotel Plaza        ");
         System.out.println("**************************");
         System.out.println();
         System.out.print("What position do you cover? \n Press 1 for Receptionist \n Press 2 for Cleaning Lady\n Press 3 for Accountant\n Press 4 for Director\n Enter choice : ");
         int user_type = console.nextInt();
         return user_type;
      }
      
      public static void MENU(int user_type){
         int choice = 0;
         String action = "";
         if (user_type == 1){
            System.out.println("1. Booking");
            System.out.println("2. Edit guest");
            System.out.println("3. Rooms");
            System.out.println("4. Log out");
            System.out.println("5. Exit");
            System.out.println("Enter choice: ");
            choice = console.nextInt();
            switch (choice){
               case 1 : action = "booking";
                        break;       
               case 2 : action = "edit guest";
                        break;
               case 3 : action = "rooms";
                        break;
               case 4 : action = "log out";
                        break;
               case 5 : action = "exit";
                        break;
               default : System.out.println("You have a problem - MENU - Receptionist");
            }
         }else if (user_type == 2){
            System.out.println("1. Rooms");
            System.out.println("2. Log out");
            System.out.println("3. Exit");
            System.out.println("Enter choice: ");
            choice = console.nextInt();
            switch (choice){
               case 1 : action = "rooms";
                        break;       
               case 2 : action = "log out";
                        break;
               case 3 : action = "exit";
                        break;
               default : System.out.println("You have a problem - MENU - Cleaning Lady");
            }
         }else if (user_type == 3){
            System.out.println("1. Rooms");
            System.out.println("2. Report");
            System.out.println("3. Log out");
            System.out.println("4. Exit");
            System.out.println("Enter choice: ");
            choice = console.nextInt();
            switch (choice){
               case 1 : action = "rooms";
                        break;
               case 2 : action = "report";
                        break;       
               case 3 : action = "log out";
                        break;
               case 4 : action = "exit";
                        break;
               default : System.out.println("You have a problem - MENU - Accountant");
            }
         }else if (user_type == 4){
            System.out.println(        "Director menu");
            System.out.println("*************************");
            System.out.println("1. Add staff");
            System.out.println("2. Edit Staff");
            System.out.println("3. Report");
            System.out.println("4. Add room");
            System.out.println("5. Edit room");
            System.out.println("6. Rooms");
            System.out.println("7. Log out");
            System.out.println("8. Exit");
            System.out.println("Enter choice: ");
            choice = console.nextInt();
            switch (choice){
               case 1 : action = "add staff";
                        break;
               case 2 : action = "edit staff";
                        break;
               case 3 : action = "report";
                        break;    
               case 4 : action = "add room";
                        break;
               case 5 : action = "edit room";
                        break;
               case 6 : action = "rooms";
                        break;
               case 7 : action = "log out";
                        break;
               case 8 : action = "exit";
                        break;
               default : System.out.println("You have a problem - MENU - Director");
            }
         }
         
         switch (action){
            case "booking":
                      createStaff();
                      MENU(user_type);
            case "edit staff":
                      editStaff();
                      MENU(user_type);
            break;
            case "add guest" : 
            break;
            case "edit guest" :
                  editGuest();
                  MENU(user_type);
            case "report":
            
            case "add room":
                      createRoom();
            MENU(user_type);
            break;
            case "add staff":
               createStaff();
               MENU(user_type);
            case "edit room":
            editRoom();
            MENU(user_type);
            break;
            
            case "rooms":
            printRoom();
            MENU(user_type);
            case "log out":
            MENU(Intro());
            case "exit":
            System.exit(0);
         
         }

      
      }
       public static void saveToFile() throws FileNotFoundException{
      PrintStream output_staff = new PrintStream(new File("StaffList.txt"));
      PrintStream output_rooms = new PrintStream(new File("RoomList.txt"));
      PrintStream output_books = new PrintStream(new File("BookingList.txt"));
      PrintStream output_guestes = new PrintStream(new File("GuestList.txt"));

      
      // Save Staff to File 
      for (int i = 0; i < staff_list.size(); i++){
         output_staff.println(staff_list.get(i).toFile());      
      }
      
      //Save Rooms to File 
      for (int i = 0; i < room_list.size(); i++){
         output_rooms.println(room_list.get(i).toFile());
      }
      
      // Save Bookings to File 
      for (int i = 0; i < bookings.size(); i++){
         output_books.println(bookings.get(i).toFile());
      }
      
      //Save Guests to File 
      for (int i = 0; i < guest_list.size(); i++){
         output_guestes.println(guest_list.get(i).toFile());
      }
      
      output_staff.flush();
      output_staff.close();
      output_rooms.flush();
      output_rooms.close();
      output_books.flush();
      output_books.close();
      output_guestes.flush();
      output_guestes.close();
      
   }
   
   public static void readFromFile() throws FileNotFoundException{
   
      Scanner input_staff = new Scanner(new File("StaffList.txt"));
      Scanner input_rooms = new Scanner(new File("RoomList.txt"));
      Scanner input_books = new Scanner(new File("BookingList.txt"));
      Scanner input_guestes = new Scanner(new File("GuestList.txt"));
      
      String str = "";
      String Id = "";
      String CPR = "";
      String firstName = "";
      String lastName = "";
      String telephoneNumber = "";
      String address = "";
      int age = 0;
      String position = "";
      double salary = 0;
      
      int roomID = 0;
      int beds = 0;
      String inter = "";
      boolean internet = false;
      double price = 0;
      int floor = 0;
      String ready = "";
      boolean readyForUse = false;
      
      String startDate = "";
      String endDate = "";
      int nrdays = 0;
      String guestID = "";
      
      String passportNumber = "";
      String country = "";
      
      
      // Save Staff to ArrayList
      while (input_staff.hasNextLine()){
         str = input_staff.nextLine();
         Scanner input_file = new Scanner(str);
         Id = input_file.next();
         CPR = input_file.next();
         firstName = input_file.next();
         lastName = input_file.next();
         address = input_file.next();
         telephoneNumber = input_file.next();
         age = input_file.nextInt();
         salary = input_file.nextDouble();
         position = input_file.next();
         
         staff_list.add(new Staff(Id,CPR,firstName,lastName,telephoneNumber,address,age,salary ,position));  

      }
      
      // Save Rooms to ArrayList
      while (input_rooms.hasNextLine()){
         str = input_rooms.nextLine();
         Scanner input_file = new Scanner(str);
         roomID = input_file.nextInt();
         beds = input_file.nextInt();
         inter = input_file.next();
         if (inter.equals("true")){
            internet = true;
         }else {
            internet = false;
         }
         price = input_file.nextDouble();
         floor = input_file.nextInt();
         ready = input_file.next();
         if (ready.equals("true")){
            readyForUse = true;
         }else {
            readyForUse = false;
         }
 
         room_list.add(new Room(roomID, beds, internet, price, floor));
      }
      
       // Save Bookings to ArrayList     
       while (input_books.hasNextLine()){
         str = input_books.nextLine();
         Scanner input_file = new Scanner(str);
         roomID = input_file.nextInt();
         startDate = input_file.next();
         endDate = input_file.next();
         nrdays = input_file.nextInt();
         guestID = input_file.next();
         
         bookings.add(new Booking(startDate, endDate, nrdays,roomID ,guestID));
      }
      
      // Save Guests to ArrayList 
      while (input_guestes.hasNextLine()){
         str = input_guestes.nextLine();
         Scanner input_file = new Scanner(str);
         passportNumber = input_file.next();
         firstName = input_file.next();
         lastName = input_file.next();
         address = input_file.next();
         telephoneNumber = input_file.next();
         age = input_file.nextInt();
         country = input_file.next();
         roomID = input_file.nextInt();
         
         guest_list.add(new Guests(passportNumber, firstName, lastName, telephoneNumber, address, age, country, roomID));
      }

   }
}
    