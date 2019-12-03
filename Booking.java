
public class Booking {
   private String startDate;
   private String endDate;
   private int nrdays;
   private int roomID;
   private String guestID;
   //constructors
   public Booking () {}
   
   public Booking (String startDate, String endDate, int nrdays, int roomID, String guestID) {
      this.startDate = startDate;
      this.endDate = endDate;
      this.nrdays = nrdays;
      this.roomID = roomID;
      this.guestID = guestID;
   }
   //getters
   public String getStartDate() {
      return startDate;
}
   public String getEndDate() {
      return endDate;
}
   public int getNrdays() {
      return nrdays;
}
   public int getRoomID() {
      return roomID;
}
   public String getGuestID() {
      return guestID;
}
   //setters
   public void setStartDate() {
      this.startDate = startDate;
}
   public void setEndDate() {
      this.endDate = endDate;
}
   public void setNrdays() {
      this.nrdays = nrdays;
}
   public void setRoomID() {
      this.roomID = roomID;
}
   public void setGuestID() {
      this.guestID = guestID;
 }
 //toString
   public String toString() {
      return "Start Date:" + startDate + ",End Date:" + endDate + ",Number of days:" + nrdays + ",RoomID:" + roomID + ",GuestID:" + guestID;
      }
        public String toFile(){
      return (roomID + " " + startDate + " " + endDate + " " + nrdays + " " + guestID);

   }

}
