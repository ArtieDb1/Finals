package org.example;

public class StaticBlocks {
    ///static blocks are code blocks that run once before the code begins


    static{
        System.out.println("I am in a static block");
    } //

    //initializer block
    {
        System.out.println("I am in an initializer Block");
    }

}
