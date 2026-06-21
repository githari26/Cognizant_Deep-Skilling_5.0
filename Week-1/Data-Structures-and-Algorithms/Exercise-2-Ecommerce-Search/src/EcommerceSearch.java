public class EcommerceSearch {

    public static void main(String[] args) {

        Product[] products = {

                new Product(104, "Laptop", "Electronics"),
                new Product(101, "Shoes", "Fashion"),
                new Product(106, "Headphones", "Electronics"),
                new Product(102, "Watch", "Accessories"),
                new Product(103, "Phone", "Electronics")

        };

        System.out.println("Linear Search");

        Product result1 = SearchAlgorithms.linearSearch(products, 103);

        if (result1 != null)
            System.out.println(result1);

        System.out.println();

        System.out.println("Binary Search");

        Product result2 = SearchAlgorithms.binarySearch(products, 103);

        if (result2 != null)
            System.out.println(result2);
    }
}