package PBO.jobsheet4.tugas;

public class Owner {
    private String name;
    private String phone;

    public Owner(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String info(){
        String info = "\n";
        info += "Name : " + name + "\n";
        info += "Phone : " + phone + "\n";
        return info;
    }
}
