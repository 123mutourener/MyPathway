package q1;

import java.util.ArrayList;

public class VideoStore {
    private ArrayList<Video> videosList = new ArrayList<>();
    private int numberOfCheckedOutVideos = 0;

    public void alertString(String type) {
        if (type.equals("notInList")) {
            System.out.println("Sorry, this video did not come from this store");
        }else if(type.equals("videoNotExists")){
            System.out.println("Sorry, cannot find the requested video in the catalogue");
        }else if(type.equals("videoAlreadExists")) {
            System.out.println("Tron is already in stock.");
        }
    }

    public boolean addVideo(String title) {
        for (Video video : this.videosList) {
            if (video.getTitle().equals(title)) {
                this.alertString("videoAlreadExists");
                return false;
            }
        }
        this.videosList.add(new Video(title));
        return true;
    }

    public Video getVideo(String title) {
        for (Video video : this.videosList) {
            if (video.getTitle().equals(title)) {
                return video;
            }
        }
        this.alertString("videoNotExists");
        return null;
    }

    public boolean checkOutVideo(String title) {
        Video video = this.getVideo(title);
        if (video == null) {
            return false;
        }
        if(!video.isCheckedOut()) {
            video.checkOut();
            this.numberOfCheckedOutVideos++;
            return true;
        } else {
            return video.checkOut();
        }
    }

    public boolean returnVideo(Video video) {
        if (this.videosList.contains(video)) {
            this.numberOfCheckedOutVideos--;
            return video.returnToStore();
        } else {
            this.alertString("notInList");
            return false;
        }
    }

    public void rateVideo(Video video, int rating) {
        video.addRating(rating);
    }

    public double getAverageRatingForVideo(Video video) {
        return video.getAverageRating();
    }

    public Video[] getCheckedOut() {
        Video[] checkedOutVideos = new Video[this.numberOfCheckedOutVideos];
        int index = 0;
        for (Video video : this.videosList) {
            if (video.isCheckedOut()) {
                checkedOutVideos[index] = video;
                index++;
            }
        }
        return checkedOutVideos;
    }

    public Video mostPopular() {
        Video mostPopular = null;
        double maxScore = 0;
        for (Video video : this.videosList) {
            if (video.getAverageRating() > maxScore) {
                maxScore = video.getAverageRating();
                mostPopular = video;
            }
        }
        return mostPopular;
    }

    public static void main(String[] args) {
        VideoStore videoStore = new VideoStore();
        videoStore.getVideo("Missing Movie");

    }
}