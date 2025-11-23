package co.com.autoex.QA.models;

public class UserData {

    private String name;
    private String email;
    private String password;
    private String firstName;
    private String lastName;
    private String Day;
    private String Month;
    private String Year;
    private String company;
    private String address;
    private String address2;
    private String country;
    private String city;
    private String state;
    private String zipcode;
    private String phone;

    public UserData(String name, String email, String password, String firstName, String lastName, String day, String month, String year, String company, String address, String address2, String country, String city, String state, String zipcode, String phone) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        Day = day;
        Month = month;
        Year = year;
        this.company = company;
        this.address = address;
        this.address2 = address2;
        this.country = country;
        this.city = city;
        this.state = state;
        this.zipcode = zipcode;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getDay() {
        return Day;
    }

    public String getMonth() {
        return Month;
    }

    public String getYear() {
        return Year;
    }

    public String getCompany() {
        return company;
    }

    public String getAddress() {
        return address;
    }

    public String getAddress2() {
        return address2;
    }

    public String getCountry() {
        return country;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public String getZipcode() {
        return zipcode;
    }

    public String getPhone() {
        return phone;
    }
}
