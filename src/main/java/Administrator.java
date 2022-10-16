import java.util.ArrayList;

public class Administrator {
    // list chua transaction
    private ArrayList<Transaction> listTransactionSoil = new ArrayList<>();
    private ArrayList<Transaction> listTransactionHome = new ArrayList<>();

    // tao ham addTransactionSoil voi parameters la transactionsoil
    private void addTransactionSoil(TransactionSoil t) {
        listTransactionSoil.add(t);
    }

    private void addTransactionHome(TransactionHome t) {
        listTransactionHome.add(t);
    }

    // xuat cac doi tuong co trong list
    private void showListTransactionSoil() {
        System.out.println("List of Transaction Soil: ");
        if (this.listTransactionSoil.size() == 0) {
            System.out.println("Do not have transaction.");
        }
        String title = String.format("%s%15s%15s%15s%15s", "ID", "Date", "Unit Price", "Area", "Soil Type");
        System.out.println(title);
        for (Transaction transaction : listTransactionSoil) {
            System.out.println(transaction.toString());
        }
    }

    private void showListTransactionHome() {
        System.out.println("List of Transaction Home: ");
        if (this.listTransactionSoil.size() == 0) {
            System.out.println("Do not have transaction.");
        }
        String title = String.format("%s%15s%15s%15s%15s%15s", "ID", "Date", "Unit Price", "Area", "Home Type", "Address");
        System.out.println(title);
        for (Transaction transaction : listTransactionHome) {
            System.out.println(transaction.toString());
        }
    }

    // kiem tra ngay giao dich va ngay can kiem tra
    private boolean checkDate(String Date1, String Date2) {
        // tach chuoi boi dau /
        String[] date1 = Date1.split("/");
        String[] date2 = Date2.split("/");
        // khai bao bien chua thang nam va ep ve kieu int
        int month1 = Integer.parseInt(date1[0]);
        int year1 = Integer.parseInt(date1[1]);
        int month2 = Integer.parseInt(date2[0]);
        int year2 = Integer.parseInt(date2[1]);

        return (year1 == year2 && month1 == month2);
    }

    // hien thi dat duoc giao dich trong thang 9/2013
    private void showListTransactionSoil(String Date) {

    }


}
