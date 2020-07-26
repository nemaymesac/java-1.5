package objects;

public class Car {

    private String carNumber;
    private String carBrand;
    private String model;
    private int yearOfReleace;
    private double pricePerMonth;

//    public Car(String carNumber, String carBrand, String model, String yearOfReleace, int pricePerMonth){
//        this.carNumber = carNumber;
//        this.carBrand = carBrand;
//        this.model = model;
//        this.yearOfReleace = yearOfReleace;
//        this.pricePerMonth = pricePerMonth;
//    }

    public String getCarNumber() {
        return carNumber;
    }

    public void setCarNumber(String carNumber) {
        this.carNumber = carNumber;
    }

    public String getCarBrand() {
        return carBrand;
    }

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYearOfReleace() {
        return yearOfReleace;
    }

    public void setYearOfReleace(int yearOfReleace) {
        this.yearOfReleace = yearOfReleace;
    }

    public double getPricePerMonth() {
        return pricePerMonth;
    }

    public void setPricePerMonth(int pricePerMonth) {
        this.pricePerMonth = pricePerMonth;
    }

    public String getFullCarInfo(){
        return carBrand + " car," + " model: " + model + ", year: " + yearOfReleace + ", with number: "
                + carNumber + " with the price of: " + pricePerMonth + " dollars per month";
    }

}


//obj:
// klient : name, surn, email, phone nr
//car: number, marka, model, year of release, price for rent (per month)
// task : client can take a car for rent
