package ClassAndObject;

public class Product {
    private String ProdId;
    private String Desc;
    private Double Price;
    private int stok;

    public String getProdId() {
        return ProdId;
    }

    public void setProdId(String prodId) {
        ProdId = prodId;
    }

    public String getDesc() {
        return Desc;
    }

    public void setDesc(String desc) {
        Desc = desc;
    }

    public Double getPrice() {
        return Price;
    }

    public void setPrice(Double price) {
        Price = price;
    }

    public int getStok() {
        return stok;
    }

    public void setStok(int stok) {
        this.stok = stok;
    }

    public void Tampil(){
        System.out.println("ID Barang : " + ProdId);
        System.out.println("Deskripsi : " + Desc);
        System.out.println("Harga : " + Price);
        System.out.println("Stok : " + stok);
    }
}
