public class StudyRoom {
    private String title;
    private final int capacity;
    private int reserved;

    public StudyRoom(String title, int capacity) {
        if (title == null || title.trim().isEmpty() || capacity <= 0) {
            throw new IllegalArgumentException("Invalid Room Title or Number capacity");
        } else {
            String cleaned_title = title.trim();
            this.title = cleaned_title;
            this.capacity = capacity;
            reserved = 0;
        }
    }

    public StudyRoom(String title) {
        this(title, 4);
    }
    public String getTitle() {
        return title;
    }
    public int getCapacity(){
        return capacity;
    }
    public int getReserved(){
        return reserved;
    }
    public int getRemaining(){
        int remainingSeats = capacity - reserved;
        return remainingSeats;
    }
    public boolean reserve (int seats){
        if (seats <= getRemaining() && seats > 0){
            reserved += seats;
            return true;
        }else{
            return false;
        }
    }
    public boolean reserve(){
        return reserve(1);
    }
    public boolean cancel (int seats){
        if (seats <= reserved && seats > 0){
            reserved-=seats;
            return true;
        }else{
            return false;
        }
    }
}
