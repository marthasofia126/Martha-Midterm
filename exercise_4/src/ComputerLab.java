public class ComputerLab extends CampusResource {
    private static final int FEE = 8;
    @Override
    public int feePerSeat() {
        return FEE;
    }
    public ComputerLab (String title, int capacity) {
        super(title, capacity);
    }
}