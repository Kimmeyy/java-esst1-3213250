package basics;

public class StringExamples {

    public static void main(String[] args) {
        // String type, String ist eine Klasse
        String myString = "Hello World";

        System.out.println(myString);

        String greeting = "Hello";
        String subject = "Java";
        String fullGreeting  = greeting + " " + subject;

        // Concatenation
        System.out.println(greeting + " " + subject);
        System.out.println(fullGreeting);

        // Numbers in Strings
        String eleven = "11";
        String five = "5";

        System.out.println(eleven + five);
    }

}
