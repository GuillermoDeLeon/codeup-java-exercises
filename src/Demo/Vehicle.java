package Demo;

public class Vehicle {
    private String c1;
    private String c2;
    private String c3;

    public Vehicle() {
        this("hi", "there", "Fortuna");
    }

    public Vehicle(String s) {
        this(s, "there");
    }

    public Vehicle(String s1, String s2) {
        this(s1, s2, c3:"Joe");
    }

    public Vehicle(String s1, String s2, String s3) {
        this.c1 = s1;
        this.c2 = s2;
        this.c3 = s3;
    }
}
