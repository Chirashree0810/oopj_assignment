package pkg7;
public class Payment {
    private double amount;
    private String paymentDate;

    public Payment(double amount, String paymentDate) {
        this.amount = amount;
        this.paymentDate = paymentDate;
    }

    public void displayPaymentDetails() {
        System.out.println("Payment Amount: Rs" + amount);
        System.out.println("Payment Date: " + paymentDate);
    }
}