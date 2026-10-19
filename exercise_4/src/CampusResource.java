public abstract class CampusResource extends StudyRoom implements Priced {
    public abstract int feePerSeat();
    public CampusResource (String title, int capacity){
        super (title, capacity);
    }
    public int getRevenue(){
        int revenue=getReserved()*feePerSeat();
        return revenue;
    }
    public double getOccupancy(){
        double divisionOfRoomCapacity = (double)getReserved()/getCapacity();
        double percentageOfRoomCapacity = divisionOfRoomCapacity*100;
        return percentageOfRoomCapacity;
    }
}