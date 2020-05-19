package de.neuefische.controlflow.models;

public class EnglishStudent implements StudentInterface {

    private String name;
    private int average;
    private int id;
    private String flagColor;


    public EnglishStudent(String name, int average, int id, String flagColor) {
        this.name = name;
        this.average = average;
        this.id = id;
        this.flagColor = flagColor;



    }
    public void setName(String name) {
        this.name = name;
    }

    public void setAverage(int average) {
        this.average = average;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setFlagColor(String flagColor) {
        this.flagColor = "red";
    }


    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public int getAverage() {
        return this.average;
    }

    public String getFlagColor() {
        return "red";


    }

    @Override
    public String toString() {
        return "EnglishStudent{" +
                "name='" + name + '\'' +
                ", average=" + average +
                ", id=" + id +
                ", flagColor='" + flagColor + '\'' +
                '}';
    }
}