package com.healthy.fitness;

public class workoutModel {

    int image;
    String heading,exercises,difficulty;

    public workoutModel(int image, String heading, String exercises, String difficulty) {
        this.image = image;
        this.heading = heading;
        this.exercises = exercises;
        this.difficulty = difficulty;
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

    public String getExercises() {
        return exercises;
    }

    public void setExercises(String exercises) {
        this.exercises = exercises;
    }

    public String getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(String difficulty) {
        this.difficulty = difficulty;
    }
}
