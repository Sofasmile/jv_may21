package mate.lesson.lesson02;

public class User {
    private String name;
    private int age;
    private Address address;

    public User(String name, int age) {
        this.address = new Address("asas", "as", 12);
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
