package org.example.main_exercise.toy_shop;

public class Toy {
    private int id;
    private String name;
    private int quantity;
    private double weight;
    private double freqOfGetting;


    @Override
    public String toString() {
        return "Toy{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", quantity=" + quantity +
                ", weight=" + weight +
                ", freqOfGetting=" + freqOfGetting +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId() {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    public int setQuantity2(int quantity){
        this.quantity = quantity;
        return quantity;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getFreqOfGetting() {
        return freqOfGetting;
    }

    public double setFreqOfGetting() {
        this.freqOfGetting = this.weight/100;
        return freqOfGetting;
    }

    public Toy(int id, String name, int quantity, double weight) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.weight = weight;
        this.freqOfGetting = copmputeVal();
    }
    private double copmputeVal(){
        return this.weight /100;
    }
}
