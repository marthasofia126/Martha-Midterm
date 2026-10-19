import java.util.Scanner;
public class ResourceApp {
    public static void main(String[] args) {
        int user_choice;
        boolean quitting = true;
        CampusResource[] catalog = {
                new StudySpace("Quiet Study", 4),
                new ComputerLab("Computer Lab", 3),
                new StudySpace("Group Study", 2)
        };
        Scanner input = new Scanner(System.in);
        while (quitting) {
            System.out.println("""
                    \nCAMPUS RESOURCE RESERVATION
                    1. Reserve seats
                    2. Cancel reservations
                    3. View report
                    0. Exit""");
            String choice = input.nextLine();
            try {
                user_choice = Integer.parseInt(choice);
            } catch (NumberFormatException e) {
                System.out.println("Invalid output, please try again.");
                continue;
            }

            switch (user_choice) {
                case 1:
                    int rooms_choice_int;
                    System.out.println("Available Resources (Choose one): \n" + "1." + catalog[0].getTitle() + "\n2." + catalog[1].getTitle() + "\n3." + catalog[2].getTitle());
                    String rooms_choice = input.nextLine();
                    try {
                        rooms_choice_int = Integer.parseInt(rooms_choice);
                    } catch (NumberFormatException e) {
                        System.out.println("Invalid input, please try again.");
                        continue;
                    }
                    if (rooms_choice_int>=1 && rooms_choice_int <=3){
                        int rooms_choice_index = rooms_choice_int - 1;
                        String seats_choice;
                        int seats_choice_int;
                        System.out.println("How many seats would you like to reserve?: ");
                        seats_choice = input.nextLine();
                        try {
                            seats_choice_int = Integer.parseInt(seats_choice);
                        } catch (NumberFormatException e) {
                            System.out.println("Invalid input, please try again.");
                            continue;
                        }
                        if ((catalog[rooms_choice_index].reserve(seats_choice_int))){
                            System.out.println("Reservation successful!");
                        }else{
                            System.out.println("Reservation failed!");
                        }

                    }else{
                        System.out.println("Invalid input");
                    }
                    break;
                case 2:
                    int room_choice_int;
                    System.out.println("Available Resources (Choose one): \n" + "1." + catalog[0].getTitle() + "\n2." + catalog[1].getTitle() + "\n3." + catalog[2].getTitle());
                    String room_choice = input.nextLine();
                    try {
                        room_choice_int = Integer.parseInt(room_choice);
                    } catch (NumberFormatException e) {
                        System.out.println("Invalid input, please try again.");
                        continue;
                    }
                    if (room_choice_int>=1 && room_choice_int <=3){
                        int room_choice_index = room_choice_int - 1;
                        String seats_choice;
                        int seats_choice_int;
                        System.out.println("How many seats would you like to cancel: ");
                        seats_choice = input.nextLine();
                        try {
                            seats_choice_int = Integer.parseInt(seats_choice);
                        } catch (NumberFormatException e) {
                            System.out.println("Invalid input, please try again.");
                            continue;
                        }
                        if ((catalog[room_choice_index].cancel(seats_choice_int))){
                            System.out.println("Cancellation successful!");
                        }else{
                            System.out.println("Cancellation failed!");
                        }

                    }else{
                        System.out.println("Invalid input");
                    }
                    break;
                case 3:
                    StringBuilder report = new StringBuilder();
                    report.append("CAMPUS RESOURCE SUMMARY\n");
                    int totalReserved = 0;
                    int totalRevenue = 0;
                    for (int i=0;  i < catalog.length;i++){
                        report.append(catalog[i].getTitle());
                        report.append("\nCapacity: " + catalog[i].getCapacity());
                        report.append("\nReserved: " + catalog[i].getReserved());
                        report.append("\nRemaining: " + catalog[i].getRemaining());
                        report.append("\nFee per seat: " + catalog[i].feePerSeat());
                        report.append("\nRevenue: " + catalog[i].getRevenue());
                        report.append("\nOccupancy: " + String.format("%.1f", catalog[i].getOccupancy()) + "%");
                        report.append("\n\n");
                        totalReserved += catalog[i].getReserved();
                        totalRevenue += catalog[i].getRevenue();
                    }
                    report.append("TOTAL SUMMARY\n");
                    report.append("Total Reserved Seats: " + totalReserved);
                    report.append("\nTotal Revenue: $" + totalRevenue);
                    System.out.println(report);
                    break;
                case 0:
                    quitting = false;

        }
            }
        }
    }

