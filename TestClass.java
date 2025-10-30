/*
 * Nathanael Obrey
 * 10-28-2025
 * Recursion
 */

public class TestClass {

    public static void main (String[] args) {

        //System.out.println(countHi("xxhixxhiabchidhixx"));

        System.out.println(strCount("catcowcat", "cat"));


    }//end main

    //recursive problem 1
    public static int countHi(String str) {
        System.out.println(str);
        // base case: if string has fewer than 2 characters it cannot contain "hi"
        if (str == null || str.length() < 2) {
            return 0;
        }
        // check first two chars
        if (str.charAt(0) == 'h' && str.charAt(1) == 'i') {
            return 1 + countHi(str.substring(2));
        }
        return countHi(str.substring(1));
        
    }//end countHi

    //recursive problem 2
    public static int strCount(String str, String sub) {
        //base case
        System.out.println(str);
        if (str == null || sub == null)
            return 0;
        if(str.length() < sub.length())
            return 0;

        int subLength = sub.length();
        if (str.substring(0,subLength).equals(sub)) 
            return 1 + strCount(str.substring(subLength), sub);
        
        return strCount(str.substring(subLength), sub);
    }//end strCount

    //recursive problem 3
    public static int count8(int n) {
        //base case
        if (n == 0)
            return 0;

        int lastDigit = n % 10;
        int secondLastDigit = (n / 10) % 10;

        if (lastDigit == 8) {
            if (secondLastDigit == 8) {
                return 2 + count8(n / 10);
            } else {
                return 1 + count8(n / 10);
            }
        } else {
            return count8(n / 10);
        }
    }//end count8

    //recursive problem 4
    public static int countHi2(String str) {
        //base case
        if (str == null || str.length() < 2)
            return 0;

        if (str.length() >= 3 && str.substring(0, 3).equals("xhi")) {
            return countHi2(str.substring(3));
        } else if (str.substring(0, 2).equals("hi")) {
            return 1 + countHi2(str.substring(2));
        } else {
            return countHi2(str.substring(1));
        }
    }//end countHi2

    //recursive problem 5
    public static  String stringClean(String str) {
        //base case
        if (str == null || str.length() <= 1)
            return str;

        char firstChar = str.charAt(0);
        char secondChar = str.charAt(1);

        if (firstChar == secondChar) {
            return stringClean(str.substring(1));
        } else {
            return firstChar + stringClean(str.substring(1));
        }
    }//end stringClean

}//end TestClass