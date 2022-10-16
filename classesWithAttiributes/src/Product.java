public class Product {

    public Product(int id,String name,String description,int stockAmount,int price,String renk){
        System.out.println("Yapıcı blok calisti.");
        this.name = name;
        this.stockAmount = stockAmount;
        this.id = id;
        this.price = price;
        this.description = description;
        this.renk = renk;
    }
    public Product(){

    }

    private String name;
    private String description;
    private double price;
    private int stockAmount;
    private int id;
    private String  kod;
    String renk;

    public String getRenk() {
        return renk;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStockAmount() {
        return stockAmount;
    }

    public void setStockAmount(int stockAmount) {
        this.stockAmount = stockAmount;
    }

    public String getKod() {
        return this.name.substring(0,1)+id;
    }

    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id=id;
    }
}
