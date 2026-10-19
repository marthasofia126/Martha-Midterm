public class StudyRoomDemo {
    public static void main (String[] args) {
        StudyRoom room1 = new StudyRoom("Quiet Room",6);
        System.out.println("Room's name: " + room1.getTitle());
        System.out.println("Room's capacity: " + room1.getCapacity());
        room1.reserve(4);
        room1.reserve();
        System.out.println("Room's reservations: " + room1.getReserved());
        room1.cancel(2);
        System.out.println("Available seats after cancelling: " + room1.getRemaining());
    }
}