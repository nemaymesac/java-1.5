package objects;

public class Client{
    private String firstName;
    private String lastName;
    private String mailAddress;
    private String phoneNr;
    private int cashLimit;

    public Client (String firstName, String lastName, String mailAddress, String phoneNr, int cashLimit){
        this.firstName = firstName;
        this.lastName = lastName;
        this.mailAddress = mailAddress;
        this.phoneNr = phoneNr;
        this.cashLimit = cashLimit;
    }
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public String getMailAddress() {
        return mailAddress;
    }
    public String getPhoneNr() {
        return phoneNr;
    }

    public int getCashLimit() {
        return cashLimit;
    }

    public String getFullInfo() {
        return firstName + " " + lastName + ": " + phoneNr + ", " + mailAddress + ", " + cashLimit;
    }

}