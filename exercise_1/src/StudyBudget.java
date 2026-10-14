public class StudyBudget {
    public static void main (String[] args) {
        String student_name = " Ana Lee ";
        boolean membership = true;
        int minutes_studied = 95;
        int complete_blocks = minutes_studied/30;
        int remaining_minutes = minutes_studied % 30;
        double blocks_price = complete_blocks * 5;
        double discount = 0;
        String clean_student_name = student_name.trim();
        if (clean_student_name.isEmpty() || minutes_studied <= 0){
            System.out.println("This is not a valid input");
        }
        else{
            System.out.println("Student name: "+ clean_student_name);
            System.out.println("Student first letter: " + clean_student_name.charAt(0));
            if (membership == true){
                System.out.println("Membership Status: Active\n");
            }else{
                System.out.println("Membership Status: Inactive\n");
            }
            System.out.println("STUDY BUDGET");
            System.out.println("Minutes studied: " + minutes_studied);
            System.out.println("Complete blocks: " + complete_blocks);
            System.out.println("Remaining minutes: " + remaining_minutes);
            System.out.printf("Base fee: $%.2f%n", blocks_price);
            if (membership == true && complete_blocks >= 4) {
                System.out.println("Eligible for discount? Yes!");
                discount = blocks_price * 0.20;
            }else{
                System.out.println("Eligible for discount? No");
            }
            System.out.printf("Discount: $%.2f%n", discount);
            double final_fee = blocks_price - discount;
            System.out.printf("Final fee: $%.2f%n", final_fee);
        }
        }
    }