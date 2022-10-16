public class TransactionHome extends Transaction {
    private HomeType homeType;
    private String address;

    public TransactionHome(int id, String date, double unitPrice, double area, HomeType homeType, String address) {
        super(id, date, unitPrice, area);
        this.homeType = homeType;
        this.address = address;
    }

    // tinh gia nha
    public double getPrice() {
        if (homeType == HomeType.NORMAL) {
            return super.getPrice() * 0.9;
        }
    }
}
