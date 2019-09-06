package ClassAndObject;

public class Something {
    String name;
    String code;
    int price;
    Double discount;

    public int sellingPrice() {
        return price -= (price * discount);
    }

    public void showData() {
        System.out.println("Name : " + name);
        System.out.println("Code : " + code);
        System.out.println("Price : " + price);
        System.out.println("Discount : " + discount);
        System.out.println("Final Price : " + sellingPrice());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Double getDiscount() {
        return discount;
    }

    public void setDiscount(Double discount) {
        this.discount = discount/100;
    }
}
