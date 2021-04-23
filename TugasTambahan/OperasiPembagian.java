/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasTambahan;

/**
 *
 * @author LENOVO
 */
public class OperasiPembagian extends OperasiBilanganAbs{
    
    @Override
    protected void set_A(double a){
        this.a=a;
    }
    @Override
    protected void set_B(double b){
        this.b=b;
    }
    @Override
    protected void set_C(){
        this.c=c;
    }
    
    @Override
    protected double get_A(){
        return a;
    }
    @Override
    protected double get_B(){
        return b;
    }
    @Override
    protected double get_C(){
        return c;
    }
    @Override
    protected void tampil(){
        System.out.println("=====Pembagian=====");
        System.out.println(get_A()+" : "+get_B()+" = "+(get_A()/get_B()));
    }
}
