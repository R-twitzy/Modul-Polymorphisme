/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lat2;

/**
 *
 * @author LENOVO
 */
public class Test {
    public static void main(String[] args) {
        Line a = new Line(25, 35, 45, 55);
        System.out.println(a.getLength());
        System.out.println(a.isGreater(a, a));
        System.out.println(a.isLess(a, a));
    }
}
