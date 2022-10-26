package ru.mirea.task4;

public enum Season {
    WINTER(-15),
    SPRING(15),
    SUMMER(30) {
        @Override
        public String getDiscription() {
            return "it's warm time now";
        }
    },
    AUTUMN(10);
    private double tempereture;

    public void setTempereture(double tempereture) {
        this.tempereture = tempereture;
    }

    public double getTempereture() {
        return tempereture;
    }

    Season(double temperature) {
        this.tempereture = temperature;
    }

    public String getDiscription() {
        return "it's cold time now";
    }
}
