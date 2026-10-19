public class StudySpace extends CampusResource{
    private static final int FEE = 3;
    @Override
    public int feePerSeat(){
        return FEE;
    }
    public StudySpace (String title, int capacity) {
        super(title, capacity);
    }
}
