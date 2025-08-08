package day3;
public class author {
    private String name;
    private String email;
    private char gender;

    // Parameterized Constructor
    public author(String name, String email, char gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    // toString method for printing
    @Override
    public String toString() {
        return "Author [Name: " + name + ", Email: " + email + ", Gender: " + gender + "]";
    }
}
