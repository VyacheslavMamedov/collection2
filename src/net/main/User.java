package net.main;


public class User <F, L, P>{


    private final F firstName;
    private final L lastName;
    private final P phone;

    public User(F firstName, L lastName, P phone){
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;


    }

    @Override
    public String toString() {
        return "User{" +
                "firstName=" + firstName +
                ", lastName=" + lastName +
                ", phone=" + phone +
                '}';
    }
}
