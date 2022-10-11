package Week_2.classesWithAttributes;

public class Main {
    public static void main(String[] args) {

        Product product = new Product(1,"Laptop","Asus Laptop",5000,5,"Black");
        /*
        product.setName("Laptop");
        product.setId(1);
        product.setDescription("Asus Laptop");
        product.setPrice(5000);
        product.setStockAmount(5);*/

        System.out.println(product.getDescription());
        ProductManager productManager = new ProductManager();
        productManager.Add(product);
        System.out.println("Product code: " + product.getCode());

    }
}
