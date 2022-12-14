package exercise.string.handling;

public class Start {
    public static void main(String[] args) {
        String veryLongString = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.";

        String tooLongString = veryLongString.replace("um", "HUM");
        System.out.println(tooLongString);

        String sub1 = veryLongString.substring(0, veryLongString.indexOf("aliquip"));
        String sub2 = veryLongString.substring(veryLongString.indexOf("aliquip"));
        
        System.out.println(sub1 + sub2);

        // not contained in sub1
        System.out.println(sub1.indexOf("est"));

        // contained in sub2
        System.out.println(sub2.indexOf("est"));

    }
}
    /*You have a very long string veryLongString with the following value:

        "Lorem ipsum dolor sit amet, consectetur adipiscing elit,
        sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.
        Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.
        Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur.
        Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum."

        change all the occurrences of um with HUM
        divide veryLongString in 2 parts from the word aliquip, assigning them to sub1 and sub2
        print sub1 and sub2 values without any space at the beginning and at the end of the string
        search for est in sub1 and in sub2, printing the result of exclusive or of the 2 searches*/