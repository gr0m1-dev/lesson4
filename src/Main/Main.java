package Main;

public class Main {
    public static void main(String[] args) {
        int productNo1 = 1;
        String productName1 = "smartphone";
        int days1 = 5;
        int quantity1 = 50;
        double price1 = 243.07;
        double totalSales1 = quantity1 * price1;
        double salesPerDay1 = totalSales1 / days1;

        System.out.println("Product No " + productNo1 + ": " + productName1 + ",");
        System.out.println("total sales for " + days1 + " days is EUR " + String.format("%.2f", totalSales1) + ",");
        System.out.println("sales by day is EUR " + String.format("%.2f", salesPerDay1) + ".");

        int productNo2 = 2;
        String productName2 = "laptop";
        int days2 = 7;
        int quantity2 = 35;
        double price2 = 299.62;
        double totalSales2 = quantity2 * price2;
        double salesPerDay2 = totalSales2 / days2;

        System.out.println("Product No " + productNo2 + ": " + productName2 + ",");
        System.out.println("total sales for " + days2 + " days is EUR " + String.format("%.2f", totalSales2) + ",");
        System.out.println("sales by day is EUR " + String.format("%.2f", salesPerDay2) + ".");
    }
}

