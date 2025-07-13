import java.util.Arrays;
import java.util.Comparator;

public class TestAndAnalysis {
    public static void main(String[] args) {
        Product[] products = {
                new Product(103, "Shoes", "Fashion"),
                new Product(101, "Laptop", "Electronics"),
                new Product(102, "Phone", "Electronics"),
                new Product(104, "Watch", "Accessories")
        };

        // Test Linear Search
        System.out.println("Linear Search:");
        Product result1 = searchutil.linearSearch(products, 102);
        System.out.println(result1 != null ? result1 : "Product not found");

        // Sort for Binary Search
        Arrays.sort(products, Comparator.comparingInt(Product::getProductId));

        // Test Binary Search
        System.out.println("\nBinary Search:");
        Product result2 = searchutil.binarySearch(products, 102);
        System.out.println(result2 != null ? result2 : "Product not found");
    }
}
