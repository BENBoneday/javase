import java.util.Scanner;
public class HotelReception {
    public static void main(String[] args) {

        Room room = new Room();
        Hotel hotel=new Hotel();
        System.out.println(room);
        while (true){
        System.out.println("欢迎使用酒店管理系统！");
        System.out.println("如果想订房，请按1！如果要退房，滚去按2！如果要查询房间，请按3！");
        Scanner C = new Scanner(System.in);
        int Number = C.nextInt();
        if (Number == 1) {
            System.out.println("请输入订房房间号！");
            Scanner A = new Scanner(System.in);
            int roomNumber = A.nextInt();
            hotel.Reservation(roomNumber);
        } else if (Number==2){
            System.out.println("请输入退房房间号！");
            Scanner B = new Scanner(System.in);
            int roomNumber1 = B.nextInt();
            hotel.CheckOut(roomNumber1);
        }
        else if (Number==3){

            hotel.print();
        }
        else if(Number==0){
            System.out.println("欢迎下次使用！");
            return;
        }

    }}
}
class Room{

    private  int RoomNumber;
    private String Size;
    private boolean Status;

    @Override
    public String toString() {
        return "Room{" +
                "RoomNumber=" + RoomNumber +
                ", Size='" + Size + '\'' +
                ", Status=" + Status +
                '}';
    }

    public boolean equals(Object obj){
    if (obj==null||!(obj instanceof Room))return false;
    if(this==obj)return true;
    Room room=(Room)obj;
    return this.RoomNumber==room.getRoomNumber();

}

    public Room() {
    }

    public Room(int roomNumber, String size, boolean status) {
        RoomNumber = roomNumber;
        Size = size;
        Status = status;
    }

    public int getRoomNumber() {
        return RoomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        RoomNumber = roomNumber;
    }

    public String getSize() {
        return Size;
    }

    public void setSize(String size) {
        Size = size;
    }

    public boolean isStatus() {
        return Status;
    }

    public void setStatus(boolean status) {
        Status = status;
    }


}

