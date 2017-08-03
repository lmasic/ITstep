package itstep1;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author virtuoso
 */
public class Itstep1 {

    /**
     * @param args the command line arguments
     */
    static String[] _args;
    public static void main(String[] args) {
        Itstep1._args=args;//uložení vstupů do globalní proměnné
        
        System.out.println(args+"All your base are belong to us");
        
        String vilda = "push test";//něco nového
        //ahoj

        int x=5;
        System.out.println(Integer.toBinaryString(x));
        System.out.println(Integer.toBinaryString(x<<2));
        
        int y=5;
        System.out.println(Integer.toBinaryString(y));
        System.out.println(Integer.toBinaryString(y>>>2));

        int a=2;
        System.out.println(Integer.toBinaryString(a));
        System.out.println(Integer.toBinaryString(a>>2));
    }
    //funguje merge?....
}
