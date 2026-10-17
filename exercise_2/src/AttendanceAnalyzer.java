import java.util.Scanner;
public class AttendanceAnalyzer{
    private static final double NUMBER_OF_CELLS = 4*3;
    private static final int BUSY = 6;
    public static void main (String [] args){
        boolean quitting = true;
        int users_choice;
        int highest_visit = 0;
        int [][] rooms = {
                {2,0,3,1},
                {1,4,0,2},
                {0,2,2,1}};

        while (quitting) {
            double total=0;
            Scanner input = new Scanner(System.in);
            System.out.println("""
                    \nMENU: 
                    1. Summary
                    2. Find Room
                    3. Exit """);
            String choice = input.nextLine();
            users_choice = Integer.parseInt(choice);

            switch(users_choice){
                case 1:
                    System.out.println("STUDY ROOM ATTENDANCE");
                    for (int i = 0; i < roomTotals(rooms).length; i++){
                        System.out.println("Room #" + (i+1) + ":"+ roomTotals(rooms)[i]);
                    }
                    System.out.println("\nATTENDANCE BY PERIODS\n");
                    for (int i = 0; i < periodTotals(rooms).length; i++){
                        System.out.println("Period #" + (i+1) + ":"+ periodTotals(rooms)[i]);
                    }
                    for (int i = 0; i<3;i++){
                        total +=roomTotals(rooms)[i];
                    }
                    System.out.println("\nGENERAL STATISTICS\n");
                    System.out.println("Total visits: "+ total);
                    System.out.println("Average attendance: " + total/NUMBER_OF_CELLS);
                    int [] total_of_rooms = roomTotals(rooms);
                    int busiest_room=0;
                    int number_of_busy_rooms=0;
                    for (int i = 0; i < total_of_rooms.length; i++ ){
                        if (total_of_rooms[i] > highest_visit){
                            highest_visit=total_of_rooms[i];
                            busiest_room=(i+1);
                        }
                        if (total_of_rooms[i]>= BUSY){
                            number_of_busy_rooms+=1;
                        }
                    }
                    System.out.println("Most visited room: " + busiest_room);
                    System.out.println("Highest attendance: " + highest_visit);
                    System.out.println("Number of busy rooms: " + number_of_busy_rooms);
                    break;
                case 2:
                    int rooms_choice_int;
                    System.out.println("Which room would you like a summary of? (1-3): ");
                    String rooms_choice = input.nextLine();
                    rooms_choice_int = Integer.parseInt(rooms_choice);
                    int room_index = rooms_choice_int - 1;

                    if (rooms_choice_int >=1 && rooms_choice_int <=3){
                        System.out.println("Room #" + rooms_choice_int);
                        System.out.println("Room #" + rooms_choice_int + " total attendance: " + roomTotals(rooms)[room_index]);
                        if (roomTotals(rooms)[room_index] >= BUSY) {
                            System.out.println("Room #" + rooms_choice_int + " status: Busy");
                        }else{
                            System.out.println("Room #" + rooms_choice_int + " status: Not Busy");
                        }
                    }else{
                        System.out.println("Invalid input, please try again.");
                    }
                    break;
                case 3:
                    quitting=false;
            }
            }


        }

    public static int [] roomTotals(int [] [] rooms) {
        int [] total_rooms = new int[3];
        for (int i = 0; i <3; i++){
            int sum_rows = 0;
            for (int j = 0; j<4;j++)
                sum_rows += rooms [i] [j];
            total_rooms[i]=sum_rows;
        }
        return total_rooms;
    }
    public static int [] periodTotals(int [] [] rooms) {
        int[] total_periods = new int[4];
        for (int i = 0; i < 4; i++) {
            int sum_columns = 0;
            for (int j = 0; j < 3; j++)
                sum_columns += rooms[j][i];
            total_periods[i] = sum_columns;
        }
        return total_periods;
    }
}
