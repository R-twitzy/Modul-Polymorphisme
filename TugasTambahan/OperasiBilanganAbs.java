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
abstract class OperasiBilanganAbs {
    protected double a,b,c;
    
    protected abstract void set_A(double a);
    protected abstract void set_B(double b);
    protected abstract void set_C();
    
    protected abstract double get_A();
    protected abstract double get_B();
    protected abstract double get_C();
    
    protected abstract void tampil();
}
