package btvn01;

class Product {
    private String sku;
    private String name;
    private double price;
    private int stock;

    public Product(){}

    public Product(String sku, String name){
        this.sku =sku;
        this.name = name;
    }
    public Product(String sku, String name, double price, int stock) {
        this.sku = sku;
        this.name = name;
        this.price = price;
        this.stock = stock;
    }
    public String getSku(){
        return this.sku;
        }
    public String getName(){
        return this.name;
    }
    public double getPrice(){
        return this.price;
    }
    public void setPrice(double price){
        this.price = Math.max(0, price);
    }
    public void setStock(int stock){
        this.stock = Math.max(0, stock);
    }
    public void showInfo(){
        System.out.printf("%-6s %-18s %,.0f tồn %d\n", this.sku, this.name, this.price, this.stock);
    }
}

class DonHang{
    private String customer;
    private Product product;
    private int qty;

    public DonHang(String customer, Product product, int quantity){
        this.customer = customer;
        this.product = product;
        this.qty = Math.max(1, quantity);
    }
    public double total(){
        double total = this.product.getPrice() * this.qty;
        if(this.qty >=5){
            total *= 0.9;
        }
        return total;
    }
    public void showInfo(){
        System.out.printf("%-7s %-18s %-3d %,.0f\n", this.customer, this.product.getName(), this.qty, this.total());
        if(this.qty >=5){
            System.out.printf("%-7s (đã giảm 10%%)\n", "");
        }
    }
}
public class btvn01{
    public static void main(String[] args){
        Product p1 = new Product("SP01", "Bàn phím cơ", 450000, 20);
        Product p2 = new Product("SP02", "Chuột không dây", 200000, 50);
        Product p3 = new Product("SP03","Tai nghe");
        p3.setPrice(350000);
        p3.setStock(10);
        DonHang d1 = new DonHang("An", p1, 2);
        DonHang d2 = new DonHang("Bình", p2, 5);
        DonHang d3 = new DonHang("Chi", p3, 0);

        System.out.println("===== DANH SÁCH SẢN PHẨM =====");
        p1.showInfo();
        p2.showInfo();
        p3.showInfo();

        System.out.println("\n===== DANH SÁCH ĐƠN HÀNG =====");
        System.out.printf("%-7s %-18s %-3s %s\n", "Khách", "Sản phẩm", "SL", "Thành tiền");
        d1.showInfo();
        d2.showInfo();
        d3.showInfo();
    }
}