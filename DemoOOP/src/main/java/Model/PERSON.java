package Model;

public class PERSON {

    // định nghĩa thông tin thuộc tính của lớp
    public String unique_id;
    public String name;
    public int age;
    public String city;
    public String gender;

    // Constructor không có tham số đầu vào
    public PERSON() {
    }

    public PERSON(String unique_id, String name, int age, String city, String gender) {
        this.unique_id = unique_id;
        this.name = name;
        this.age = age;
        this.city = city;
        this.gender = gender;
    }

    public String getUnique_id() {
        return unique_id;
    }

    public void setUnique_id(String unique_id) {
        this.unique_id = unique_id;
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

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void Eat() {
        System.out.println("Eating ...");
    }

    public void Study() {
        System.out.println("Studying ...");
    }

    public void Sleep() {
        System.out.println("Sleeping ...");
    }

    public void Play() {
        System.out.println("Playing ...");
    }

    public void getPersonInfor() {
        System.out.println(
                this.unique_id + " - "
                + this.name + " - "
                + this.city + " - "
                + this.age + " - "
                + this.gender + " - ");
    }

}
