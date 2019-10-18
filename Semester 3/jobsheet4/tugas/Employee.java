package PBO.jobsheet4.tugas;

public class Employee {
    private String nip;
    private String name;
    private String phone;

    public Employee() {
    }

    public Employee(String nip, String name, String phone) {
        this.nip = nip;
        this.name = name;
        this.phone = phone;
    }

    public String getNip() {
        return nip;
    }

    public void setNip(String nip) {
        this.nip = nip;
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
        info += "\tNIP : " + this.nip + "\n";
        info += "\tName : " + this.name + "\n";
        info += "\tPhone : " + this.phone + "\n";
        return info;
    }
}
