public class TransactionSoil extends Transaction {
    private SoilType soilType;

    public TransactionSoil(int id, String date, double unitPrice, double area, SoilType soilType) {
        super(id, date, unitPrice, area);
        this.soilType = soilType;
    }

    public SoilType getSoilType() {
        return soilType;
    }

    public void setSoilType(SoilType soilType) {
        this.soilType = soilType;
    }

    // tinh gia dat
    public double getPrice() {
        if (soilType == SoilType.TYPE_A) {
            return super.getPrice() * 1.5;
        }
        return super.getPrice();
    }

    // nhap cac thong tin cua dat
    public static TransactionSoil inputTransactionSoil(int id) {
        String date = Input.inputInDate();
        double unitPrice = Input.inputInDouble("Enter unit price: ");
        double area = Input.inputInDouble("Enter area: ");
        System.out.println("Enter soil type: ");
        System.out.println("1. Type A");
        System.out.println("1. Type B");
        System.out.println("1. Type C");
        int choice = Input.inputInt("Enter your choice (default: Type A): ");
        switch (choice) {
            case 2:
                return new TransactionSoil(id, date, unitPrice, area, SoilType.TYPE_B);
            case 3:
                return new TransactionSoil(id, date, unitPrice, area, SoilType.TYPE_C);
            default:
                return new TransactionSoil(id, date, unitPrice, area, SoilType.TYPE_A);
        }
    }

}
