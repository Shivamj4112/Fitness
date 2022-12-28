package com.healthy.fitness;

public class badgesModel {

    int image;
    String heading,complete_status;

    public badgesModel(int image, String heading, String complete_status) {
        this.image = image;
        this.heading = heading;
        this.complete_status = complete_status;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getHeading() {
        return heading;
    }

    public void setHeading(String heading) {
        this.heading = heading;
    }

    public String getComplete_status() {
        return complete_status;
    }

    public void setComplete_status(String complete_status) {
        this.complete_status = complete_status;
    }
}
