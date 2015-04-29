/**
 * Created by student on 29.04.2015.
 */
public class Address {
    String name;
    String phone;
    String email;

    public Address(String name, String phone, String email) {
        this.name = name;
        this.phone = phone;
        this.email = email;
    }

    @Override
    public String toString() {
        return "name = " + name + ", phone = " + phone + ", email = " + email;
    }
}
