public class ExceptionDemo {
    public static void main(String[] args) {

        
        try {
            int a = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception: Cannot divide by zero");
        }

       
        try {
            int arr[] = {10, 20, 30};
            System.out.println(arr[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Exception: Invalid array index");
        }

        
        try {
            int n = Integer.parseInt("abc");
        } catch (NumberFormatException e) {
            System.out.println("Number Format Exception: Invalid number");
        }

        
        try {
            String name = null;
            System.out.println(name.length());
        } catch (NullPointerException e) {
            System.out.println("Null Pointer Exception: Object is null");
        }

        System.out.println("Program completed successfully.");
    }
}