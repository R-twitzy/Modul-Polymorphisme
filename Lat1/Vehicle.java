/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lat1;

/**
 *
 * @author LENOVO
 */
public abstract class Vehicle {
    public void function(){
        System.out.println("Transportation Tools");
    }
    public void fuel(){
        System.out.println("Fuels");
    }
    public abstract void walk();
}
