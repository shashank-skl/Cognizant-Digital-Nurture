public class searchutil {
    public static Product linearSearch(Product[] products, int targetId) {
        for (Product product : products) {
            if (product.getProductId() == targetId) {
                return product;
            }
        }
        return null;
    }


public static Product binarySearch(Product[] products, int targetId) {
    int low = 0;
    int high = products.length - 1;

    while (low <= high) {
        int mid = (low + high) / 2;
        int midId = products[mid].getProductId();

        if (midId == targetId) {
            return products[mid];
        } else if (targetId < midId) {
            high = mid - 1;
        } else {
            low = mid + 1;
        }
    }
    return null; // not found
}
}
