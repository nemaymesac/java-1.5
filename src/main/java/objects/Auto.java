package objects;

public class Auto {
    private String number;
    private String brand;
    private String model;
    private int year;
    private double price;
    private Client client;

    public Auto(String number, String brand, String model, int year, double price) {
        this.number = number;
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.price = price;
        this.client = null;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Client getClient() {
        return client;
    }

    public void rent(Client client){
        this.client = client;
    }

    public void release(){
        this.client = null;
    }

}
