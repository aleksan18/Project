import java.util.*;

public class Room {
    private int roomID;
    private int beds;
    private boolean internet;
    private double price;
    private int floor;
    //constructors
    public Room() {}
    
     Scanner console= new Scanner(System.in);

    public Room(int roomID, int beds, boolean internet, double price, int floor) {
        this.roomID = roomID;
        this.beds = beds;
        this.internet = internet;
        this.price = price;
        this.floor = floor;
    }
    //getters
    public int getRoomId() {
        return roomID;
    }
    public int getBeds() {
        return beds;
    }
    public boolean getInternet() {
        return internet;
    }
    public double getPrice() {
        return price;
    }
    public int getFloor() {
        return floor;
    }
    //setters
    public void setRoomId(int roomID) {
        this.roomID = roomID;
    }
    public void setBeds(int beds) {
        this.beds = beds;
    }
    public void setInternet(boolean internet) {
        this.internet = internet;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public void setFloor(int floor) {
        this.floor = floor;
    }
    //toString
    public String toString() {
        return "RoomID:" + roomID + ",Beds:" + beds + ",Internet:" + internet + ",Price: " + price + ",Floor" + floor;
    }
      public String toFile() {
      return (roomID + " " + beds + " " + internet + " " + price + " " + floor + " ");
   }
    public boolean status(int change)
    {
    if(change==1){
    return true;
    }
    else if(change==2){
    return false;
    }
    else return false;
    }
    
    public void changeRoom()
    {
    System.out.println("What part of the Room do you want to change? ");
    System.out.println("1. Number of Beds");
    System.out.println("2. Change if it has Wi-fi");
    System.out.println("3. Change the price of the room");
    System.out.println("Enter Choice:");
    int choice=console.nextInt();
    if(choice==1)
    {
    System.out.print("Enter to how many beds you want to change the room");
    int nrbeds=console.nextInt();
    setBeds(nrbeds);
    System.out.println("Bed number changed");
    
    }
    else if(choice==2)
    {
    console.nextLine();
    System.out.print("You want to change if the room has wi-fi. Enter Yes/No");
    String net=console.nextLine();
      if(net.equals("Yes"))
      {
      setInternet(true);
      System.out.println("The room has internet now");
         }
      else if(net.equals("No"))
      {
      setInternet(false);
      System.out.println("The room has no internet now");
      }
    }
    else if(choice==3)
    {
    System.out.println("You want to change the price of the room. Enter new room price:");
    double price=console.nextDouble();
    setPrice(price);
    System.out.println("You have changed the room price");
    }
    
    System.out.println("Do yo want to change something else? 1. Yes/ 2. No");
    int restart=console.nextInt();
    if(restart==1)
    {
    changeRoom();
    }
    else if(restart==2)
    {
    System.out.println("Returning to menu...");
    }
    }
}