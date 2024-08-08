package programs;

public class StringManipulations {

    public static void main(String[] args) {
        
        String str = " This is a simple string program ";
        String first = "Java";
        String replacedStr;

        // Trim whitespace from the start and end
        String trimmedStr = str.trim();
        System.out.println("Trimmed String: " + trimmedStr);

        // Split the trimmed string into an array of words
        String[] strArray = trimmedStr.split(" ");
        
        // Print each word from the array
        System.out.println("Words in the string:");
        for (String element : strArray) {
            System.out.println(element);
        }
        
        // Check if the string contains the word "simple"
        if (str.contains("simple")) {
            // Replace "simple" with the value of 'first'
            replacedStr = str.replace("simple", first);
            System.out.println("Replaced String: " + replacedStr);
        } else {
            System.out.println("The word 'simple' was not found.");
        }
    }
}
