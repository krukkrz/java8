package com.company.basics;

/*
LOKACJA W STRINGOW W PAMIECI
Java przypisuje zmienną do ciągu znaków a nie ciąg znaków do zmiennej.
Jak widać poniżej zmienne s1 i s2 odwołują się do tego samego miejsca w pamięci.
Dopiero zmienna s3 odwołuje się do innego.
*/


public class Base2 {
    public String sol() {
        String result = "";

        String s1 = "hello";
        String s2 = "hello";
        String s3 = "hllo";

        System.out.println("s1: "+s1+" hashCode: "+s1.hashCode());
        System.out.println("s2: "+s2+" hashCode: "+s2.hashCode());
        System.out.println("s3: "+s3+" hashCode: "+s3.hashCode());

        return result;
    }
}
