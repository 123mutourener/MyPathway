package q1;

import java.util.ArrayList;

public class Video {
    private String title;
    private boolean isInStock = true;
    private ArrayList<Integer> ratingList = new ArrayList<>();

    public Video(String title) {
        this.title = title;
    }

    public String getTitle() {
        return this.title;
    }

    public boolean addRating(int rating) {
        if (rating > 0 && rating <= 5) {
            this.ratingList.add(rating);
            return true;
        } else {
            System.out.printf("%d should be between 1 and 5.\n", rating);
            return false;
        }
    }

    public double getAverageRating() {
        if (this.ratingList.size() == 0) {
            return 0;
        }
        int sum = 0;
        for (Integer rating : this.ratingList) {
            sum += rating;
        }
        return (double) sum / this.ratingList.size();
    }

    public void alertString() {
        String message = "";
        if (this.isInStock) {
            message = " is not checked out.";
        } else {
            message = " is already checked out.";
        }
        System.out.printf(this.toString() + message + "\n");
    }

    public boolean checkOut() {
        if (this.isInStock) {
            this.isInStock = false;
            return true;
        } else {
            this.alertString();
            return false;
        }
    }

    public boolean returnToStore() {
        if (!this.isInStock) {
            this.isInStock = true;
            return true;
        } else {
            this.alertString();
            return false;
        }
    }

    public boolean isCheckedOut() {
        return !this.isInStock;
    }

    public String toString() {
        String status = String.format("Video[title=\"%s\", checkedOut=%s]", this.title, !this.isInStock);

        return status;
    }

    public static void main(String[] args) {
        Video v1 = new Video("a");
        System.out.println(v1);
        v1.addRating(1);
    }
}