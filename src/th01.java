class Product{
    private String sku;
    private String name;
    private double price;
    private int stock;

    public Product(String sku, String name, double price, int stock){
        this.sku= sku;
        this.name = name;
        this.price = price;
        this.stock =stock;
    }
    public String getKsu(){
        return this.sku;
    }
    public String getName(){
        return this.name;
    }
    public double getPrice(){
        return this.price;
    }
    public void setPrice(double price){
        if(price > 0){
            this.price = price;
        }else{
            System.out.println("Price must be greater than 0");
        }
    }
    public double amount(int qty){
        return this.price*qty;
    }
    public void showInfo(){
        System.out.printf("SKU: %s, Name: %s, Price: %-10.2f, Stock: %d\n", this.sku, this.name, this.price, this.stock);
    }
    public void discount(double discount){
        if(discount > 0 && discount <= 100){
            this.price -= this.price *(discount/100);
            System.out.println("Discount applied successfully: "+ this.price + " for Product " + this.name );
        }
    }
    public void sell(int qty){
        if(qty >0 && qty <= this.stock){
            this.stock -= qty;
            System.out.println("Sold " + qty + " units of " + this.name + ". Remaining stock: " + this.stock);
        }else{
            System.out.println("Invalid quantity. Available stock: " + this.stock);
        }
    }
}
class test{
    public static void main(String[] args){
        Product p1 = new Product("R-001", "RAM", 2400000, 16);
        Product p2 = new Product("S-001", "SSD", 1500000, 32);
        Product p3 = new Product ("VGA-001", "RTX 5090", 30000000, 8);
        p1.showInfo();
        p2.showInfo();
        p3.showInfo();

        p1.discount(10);
        p2.discount(15);
        p3.discount(5);

        p2.sell(10);
        p1.sell(5);
        p3.sell(10);
    }
}