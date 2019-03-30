package q3;

import java.util.Calendar;

public class CreditCard {
    private int expiryMonth;
    private int expiryYear;
    private String firstName;
    private String lastName;
    private String ccNumber;
    private Calendar calender = Calendar.getInstance();

    public CreditCard(int expiryMonth, int expiryYear, String firstName, String lastName, String ccNumber) {
        this.expiryMonth = expiryMonth;
        this.expiryYear = expiryYear;
        this.firstName = firstName;
        this.lastName = lastName;
        this.ccNumber = ccNumber;
    }

    public String formatExpiryDate() {
        String string = Integer.toString(expiryMonth) + "/" + Integer.toString(expiryYear % 100);
        return string;
    }

    public String formatFullName() {
        return firstName + " " + lastName;
    }

    public String formatCCNumber() {
        int[] space = { 3, 7, 11, 15 };
        String formattedNumber = "";
        for (int i = 0; i < space.length; i++) {
            formattedNumber += this.ccNumber.substring(space[i] - 3, space[i] + 1);
            formattedNumber += " ";
        }
        return formattedNumber.trim();
    }

    public boolean isValid() {
        int year = calender.get(Calendar.YEAR);
        int month = calender.get(Calendar.MONTH) + 1;
        if (year > this.expiryYear) {
            return false;
        } else if (year == this.expiryYear) {
            if (month >= this.expiryMonth) {
                return false;
            } else {
                return true;
            }
        } else {
            return true;
        }
    }

    public String toString() {
        String returnString = "Number: " + this.formatCCNumber() + "\n" + "Expiration date: " + this.formatExpiryDate()
                + "\n" + "Account holder: " + this.formatFullName() + "\n" + "Is valid: " + this.isValid();
        return returnString;
    }

    public static void main(String[] args) {
        CreditCard cd = new CreditCard(10, 2010, "Bob", "Jones", "1234567890123456");
        System.out.println(cd);
    }
}