import org.apache.commons.lang3.RandomStringUtils;

/**
 * Created by StarKiler on 24.11.2016.
 */
public class PokerPlayer {
    private String username;
    private String email;
    private String firstName;
    private String password;
    private String address;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PokerPlayer that = (PokerPlayer) o;

        if (username != null ? !username.equals(that.username) : that.username != null) return false;
        if (email != null ? !email.equals(that.email) : that.email != null) return false;
        if (firstName != null ? !firstName.equals(that.firstName) : that.firstName != null) return false;
        if (password != null ? !password.equals(that.password) : that.password != null) return false;
        if (address != null ? !address.equals(that.address) : that.address != null) return false;
        if (lastName != null ? !lastName.equals(that.lastName) : that.lastName != null) return false;
        if (phone != null ? !phone.equals(that.phone) : that.phone != null) return false;
        return !(city != null ? !city.equals(that.city) : that.city != null);

    }

    @Override
    public int hashCode() {
        int result = username != null ? username.hashCode() : 0;
        result = 31 * result + (email != null ? email.hashCode() : 0);
        result = 31 * result + (firstName != null ? firstName.hashCode() : 0);
        result = 31 * result + (password != null ? password.hashCode() : 0);
        result = 31 * result + (address != null ? address.hashCode() : 0);
        result = 31 * result + (lastName != null ? lastName.hashCode() : 0);
        result = 31 * result + (phone != null ? phone.hashCode() : 0);
        result = 31 * result + (city != null ? city.hashCode() : 0);
        return result;
    }

    public String getAddress() {

        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {

        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public PokerPlayer(String username) {

        this.username = username;
    }

    private String lastName;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    private String phone = "";

    private String city = "";

    public PokerPlayer(){
        this.username =    RandomStringUtils.randomAlphabetic(10);
        this.email =    RandomStringUtils.randomAlphabetic(10) + "@mail.ru";
        this.city =    RandomStringUtils.randomAlphabetic(10) + "burg" ;
        this.firstName = RandomStringUtils.randomAlphabetic(10);
        this.lastName = RandomStringUtils.randomAlphabetic(10);
        this.phone = "050" + RandomStringUtils.randomNumeric(8);
        this.password = "111111111";
        this.address = RandomStringUtils.randomAlphabetic(8) + " " +  "Street";
    }

   /* public PokerPlayer(String email, String firstName, String lastName, String phone, String city) {
        this.email = random;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
        this.city = city;
    }*/

    @Override
    public String toString() {
        return this.email + " " + this.phone + " " + this.firstName + " " + this.lastName + " " +  this.city ;

    }

}
