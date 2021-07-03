public class Hotel {
   private Room[][] rooms;

    public Hotel() {
        rooms = new Room[3][10];
        for (int i=0;i<rooms.length;i++){
            for (int j=0;j<rooms[i].length;j++){
            if (i==0)
                rooms[i][j]=new Room((i+1)*100+j+1,"单人间",true);
            else if (i==1)
                rooms[i][j]=new Room((i+1)*100+j+1,"标准间",true);
            else if (i==2)
                rooms[i][j]=new Room((i+1)*100+j+1,"豪华间",true);
            }

        }
    }

    public Hotel(Room[][] rooms) {
        this.rooms = rooms;
    }
    public void print(){
        Room room;
        for (int i=0;i<rooms.length;i++){

            for (int j=0;j<rooms[i].length;j++){
                room=rooms[i][j];
                System.out.print(room);
            }

        }
    }
    public void Reservation(int RoomNumber){

        Room room=rooms[RoomNumber/100-1][RoomNumber%100-1];
        room.setStatus(false);


            System.out.println("预订本酒店房间"+RoomNumber+"成功！");

        }


    public void CheckOut(int RoomNumber){
        Room room=rooms[RoomNumber/100-1][RoomNumber%100-1];
        room.setStatus(true);

            System.out.println("退订本酒店房间"+RoomNumber+"成功！");


    }

}
