package anotherpackage;

import testpackage.foundation;

public class Main2 {
    public static void main(String[] args) {
        foundation f = new foundation();
        // Accessing variables
        // System.out.println(f.var1); // Error: var1 is private
        // System.out.println(f.var2); // Error: var2 has default access and is not accessible from another package
        // System.out.println(f.var3); // Error: var3 is protected and not accessible directly from another package without inheritance
        System.out.println(f.var4); // Accessible because var4 is public
    }
}