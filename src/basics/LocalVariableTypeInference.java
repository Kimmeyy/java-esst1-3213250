package basics;

public class LocalVariableTypeInference {

    public static void main(String[] args) {
        // int myNumber, IntelliJ erkennt direkt automatisch, dass es sich um int handelt
        var myNumber = 42;
        myNumber = 11;

        // forbidden, wrong type
        //myNumber = "11";

        // missing initializer -> null
        //var something;
        //something = 4711;

        var myString = "java";
    }

}
