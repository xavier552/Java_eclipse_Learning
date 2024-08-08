package Learning_java;

public class Strngpgm {

    public static void main(String[] args) {
        
        String s = "hy";
        String s1 = "welcome";
        String s2 = "hello welcome";
        String s3 = new String("hy");

        // Concatenation
        System.out.println(s.concat(s1)); // Output: hywelcome
        System.out.println(1 + s1 + 3 + 4); // Output: 1welcome34

        // Equals
        System.out.println(s.equals(s2)); // Output: false
        System.out.println(s.equalsIgnoreCase(s2)); // Output: false

        // To lower case and upper case
        System.out.println(s1.toUpperCase()); // Output: WELCOME
        System.out.println(s2.toLowerCase()); // Output: hello welcome

        // Length
        System.out.println(s2.length()); // Output: 13

        // Starts with and ends with
        System.out.println(s1.startsWith("hy")); // Output: false
        System.out.println(s2.endsWith("welcome")); // Output: true

        // Trim
        System.out.println(s3.trim()); // Output: hy

        // Replace
        System.out.println(s2.replace("hello", "hy")); // Output: hy welcome

        // Contains
        System.out.println(s3.contains("welcome")); // Output: false

        // Split
        String[] ar = s2.split(" ");
        for (String a : ar) {
            System.out.println(a); // Output: hello and welcome in separate lines
        }

        // Substring
        System.out.println(s2.substring(1, 5)); // Output: ello

        // CharAt
        System.out.println(s1.charAt(1)); // Output: c

        // To char array
        char[] c = s1.toCharArray();
        for (char c1 : c) {
            System.out.print(c1); // Output: welcome
        }
    }
}

