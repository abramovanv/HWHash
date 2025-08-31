import java.util.Objects;

public class Address {
    private String country;
    private String city;

    public Address(String country, String city) {
        this.country = country;
        this.city = city;
    }

    @Override
    public int hashCode() {
        return Objects.hash(country, city);
    }

    @Override
    public boolean equals(Object obj) {
        Address adr = (Address) obj;
        return country.equals(adr.country) && city.equals(adr.city);
    }

    public String getCountry() {
        return country;
    }

    public String getCity() {
        return city;
    }
}
