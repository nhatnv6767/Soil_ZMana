public class TransactionHome extends Transaction {
    private HomeType homeType;
    private String address;

    public TransactionHome(HomeType homeType, int id, String address, String date, double unitPrice, double area) {
        super(id, date, unitPrice, area);
        this.homeType = homeType;
        this.address = address;
    }

    public HomeType getHomeType() {
        return homeType;
    }

    public void setHomeType(HomeType homeType) {
        this.homeType = homeType;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    // tinh gia nha
    public double getPrice() {
        if (homeType == HomeType.NORMAL) {
            return super.getPrice() * 0.9;
        }
        return super.getPrice();
    }

    // nhap cac thong tin cua nha
    public static TransactionHome inputTransactionHome(int id) {
        String date = Input.inputInDate();
        double unitPrice = Input.inputInDouble("Enter unit price: ");
        double area = Input.inputInDouble("Enter area: ");
        String address = Input.inputInString("Enter address: ");

        System.out.println("Enter home type: ");
        System.out.println("1. Normal");
        System.out.println("2. Premium");
        int choice = Input.inputInt("Enter choice (default: Normal): ");
        switch (choice) {
            case 2:
                return new TransactionHome(HomeType.PREMIUM, id, address, date, unitPrice, area);
            default:
                return new TransactionHome(HomeType.NORMAL, id, address, date, unitPrice, area);
        }

    }

    // xuat thong tin


    @Override
    public String toString() {
        return String.format("%s%15s%15s%15s%15s%15s",
                super.getId(),
                super.getDate(),
                Input.toVnd(getPrice()),
                super.getArea(),
                homeType.toString(),
                address
        );
    }
}
