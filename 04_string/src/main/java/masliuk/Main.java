package masliuk;

import static masliuk.Strings.fromCamelCase;
import static masliuk.Strings.isValidIPAddress;

public class Main {
    public static void main(String [] args) {


        String camelStr = "HelloJavaWorld";
        // Checking for True case.
        // Test Case: 1
        System.out.println("Test Case 1:");
        String str1 = "000.12.12.034";
        System.out.println("Input: " + str1);
        System.out.println(
                "Output: "
                        + (str1));

        // Test Case: 2
        System.out.println("\nTest Case 2:");
        String str2 = "121.234.12.12";
        System.out.println("Input: " + fromCamelCase(camelStr));
        System.out.println(
                "Output: "
                        + isValidIPAddress(str2));
    }



}
