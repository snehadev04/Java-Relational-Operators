// This program demonstrates comparison operations in Java.
class Operation {
    public static void main(String[] args) {
        int x = 10;         // Initialize variable x
        int y = 12;         // Initialize variable y
        int z = 10;         // Initialize variable z
        boolean result_a = x >= y;  // Check if x is greater than or equal to y
        boolean result_b = x <= y;  // Check if x is less than or equal to y
        boolean result_c = x == y;  // Check if x is equal to y
        boolean result_d = x <= z;  // Check if x is less than or equal to z
        boolean result_e = z >= y;  // Check if z is greater than or equal to y
        boolean result_f = x == z;  // Check if x is equal to z
        boolean result_g = x != y;  // Check if x is not equal to y
        boolean result_h = z != x;  // Check if z is not equal to x
        // Output the results
        System.out.println(result_a);
        System.out.println(result_b);
        System.out.println(result_c);
        System.out.println(result_d);
        System.out.println(result_e);
        System.out.println(result_f);
        System.out.println(result_g);
        System.out.println(result_h);
    }
}
