package org.example;

public class Spartan {

    private static String name;

    public static void setName(String name){
        Spartan.name = name;
    }

    public static String getName(){
        return Spartan.name;
    }

    public static void printSpartan(Spartan spartan){
        System.out.println("Name: "+ spartan.getName());
    }
    public static void main(String[] args) {
        Spartan artie = new Spartan();
        Spartan dube = new Spartan();
        artie.setName("Artie");
        dube.setName("Dube");
        System.out.println(artie.getName());
        System.out.println(dube.getName()); //output is still Artie because dube doesn't
                                            // have right to change the method
        Spartan.printSpartan(artie); //you have to call it from the class then pass the object in
        Spartan.printSpartan(dube);
    }

}
