package Baeldung;

public class Bicycle {

    private String brand;
    private Integer frameSize;
    // standard constructor, getters and setters

    public Integer getFrameSize() {
        return frameSize;
    }

    public String getBrand() {
        return brand;
    }

    public Bicycle(String brand) {
        this.brand = brand;
    }
}
