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
        System.out.println("List of Transaction Soil");
        if (this.listTransactionSoil.size() == 0) {
            System.out.println("Do not have transaction.");
            return;
        }
        String title = String.format("%s%15s%15s%15s%15s", "ID", "Date", "Unit Price", "Area", "Soil Type");
        for (Transaction transaction : listTransactionSoil) {
            if (checkDate(transaction.getDate(), Date)) {
                System.out.println(transaction.toString());
            }
        }
    }

    // hien thi gd nha trong thang 9/2013
    private void showListTransactionHome(String Date) {
        System.out.println("List of Transaction Home");
        if (this.listTransactionSoil.size() == 0) {
            System.out.println("Do not have transaction.");
            return;
        }
        String title = String.format("%s%15s%15s%15s%15s%15s", "ID", "Date", "Unit Price", "Area", "Home Type", "Address");
        for (Transaction transaction : listTransactionHome) {
            if (checkDate(transaction.getDate(), Date)) {
                System.out.println(transaction.toString());
            }
        }
    }

    // tinh trung binh tien gd dat
    private double averageTransactionSoil() {
        double sum = 0;
        for (Transaction transaction : listTransactionSoil) {
            sum += transaction.getPrice();
        }
        return sum / listTransactionSoil.size();
    }

    // tao menu
    private void subMenu(int choice) {
        if (choice == 1) {
            System.out.println("1. Add Transaction Soil");
            System.out.println("2. Add Transaction Home");
        } else if (choice == 2) {
            System.out.println("1. Show Transaction Soil");
            System.out.println("2. Show Transaction Home");
        }
    }

    public void menu() {
        while (true) {
            System.out.println("1. Add Transaction");
            System.out.println("2. Show list transaction");
            System.out.println("3. Show count of Transaction Soil and Home");
            System.out.println("4. Average price of Transaction Soil");
            System.out.println("5. Display transaction of 9/2013");
            System.out.println("6. Exit");
            int choice = Input.inputInt("Enter your choice: ");
            menu(choice);
        }
    }

    private void menu(int choice) {
        int tempChoice = 0;
        switch (choice) {
            case 1:
                subMenu(choice);
                tempChoice = Input.inputInt("Enter your choice: ");
                if (tempChoice == 1) {
                    TransactionSoil t = TransactionSoil.inputTransactionSoil(listTransactionSoil.size() + 1);
                    addTransactionSoil(t);
                } else if (tempChoice == 2) {
                    TransactionHome t = TransactionHome.inputTransactionHome(listTransactionHome.size() + 1);
                    addTransactionHome(t);
                }
                break;
            case 2:
                subMenu(choice);
                tempChoice = Input.inputInt("Enter your choice: ");
                if (tempChoice == 1) {
                    showListTransactionSoil();
                } else if (tempChoice == 2) {
                    showListTransactionHome();
                }
                break;

            case 3:
                System.out.println("Count of Transaction Soil: " + listTransactionSoil.size());
                System.out.println("Count of Transaction Home: " + listTransactionHome.size());
                break;
            case 4:
                System.out.println("Average price of Transaction Soil: " + averageTransactionSoil());
                break;
            case 5:
                showListTransactionHome("9/2013");
                showListTransactionSoil("9/2013");
                break;
            case 6:
                System.exit(0);
                break;
        }
    }

}
