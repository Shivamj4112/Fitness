package com.healthy.fitness;

public class historyModel {

    String count_lap,heading,complete_status;

    public historyModel(String count_lap, String heading, String complete_status) {
        this.count_lap = count_lap;
        this.heading = heading;
        this.complete_status = complete_status;
    }
    public String getCount_lap() {
        return count_lap;
    }

    public void setCount_lap(String count_lap) {
        this.count_lap = count_lap;
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
