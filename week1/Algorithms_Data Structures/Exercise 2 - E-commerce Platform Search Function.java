class Product {
    int productId;
    String productName;
    String category;

    public Product(int productId, String productName, String category) {
        this.productId = productId;
        this.productName = productName;
        this.category = category;
    }

    public int getProductId() { return productId; }
    public String getProductName() { return productName; }
    public String getCategory() { return category; }

    public String toString() {
        return productId + ": " + productName + " (" + category + ")";
    }
}

class SearchAlgorithms {
    public static int linearSearch(Product[] arr, String name) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].getProductName().equals(name)) {
                return i;
            }
        }
        return -1;
    }

    public static int binarySearch(Product[] arr, String name) {
        int left = 0, right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            int cmp = arr[mid].getProductName().compareTo(name);
            if (cmp == 0) return mid;
            if (cmp < 0) left = mid + 1;
            else right = mid - 1;
        }
        return -1;
    }
}

class SearchTest {
    public static void main(String[] args) {
        Product[] products = {
            new Product(1, "Laptop", "Electronics"),
            new Product(2, "Shirt", "Clothing"),
            new Product(3, "Book", "Stationery"),
            new Product(4, "Phone", "Electronics"),
            new Product(5, "Pen", "Stationery")
        };

        String searchName = "Phone";
        long start = System.nanoTime();
        int idx1 = SearchAlgorithms.linearSearch(products, searchName);
        long end = System.nanoTime();
        System.out.println("Linear Search: Found at index " + idx1 + " (" + (end-start) + " ns)");

        java.util.Arrays.sort(products, (a, b) -> a.getProductName().compareTo(b.getProductName()));

        start = System.nanoTime();
        int idx2 = SearchAlgorithms.binarySearch(products, searchName);
        end = System.nanoTime();
        System.out.println("Binary Search: Found at index " + idx2 + " (" + (end-start) + " ns)");

        System.out.println("Binary search is usually much faster than linear search for large sorted arrays.");
    }
} 