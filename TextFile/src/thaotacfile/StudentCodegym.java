package thaotacfile;

import java.io.Serializable;

public class StudentCodegym implements Serializable {
    String name , address;

    public StudentCodegym() {
    }

    public StudentCodegym(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return name + "," + address;
    }
    public static String getFileHeader(){
        return "Name,Address";
    }
}
