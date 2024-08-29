package org.example.e119;

public class E119JavaMethods {

    public static String censorLetter(String str,char symbol ) {
        str = str.replace(symbol, '*');
        return str;
    }
    public static void main(String[] args) {
        // Students will write the code here.
        E119JavaMethods str = new E119JavaMethods();
        String newstr;
        newstr = str.censorLetter("computer science",'e');
        System.out.println(newstr);
        newstr =str.censorLetter("trick or treat",'t');
        System.out.println(newstr);
    }

}
