public class Transaction {
    private String id;
    private String date;
    private double unitPrice;
    private double area;

    public Transaction(String id, String date, double unitPrice, double area) {
        this.id = id;
        this.date = date;
        this.unitPrice = unitPrice;
        this.area = area;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    @Override
    public String toString() {
        return String.format("%s%15s%15s%15s", id, date, unitPrice, area);
    }
}