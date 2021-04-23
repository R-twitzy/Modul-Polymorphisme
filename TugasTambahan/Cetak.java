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
final class Cetak {
    private void cetakSemua(OperasiBilanganAbs[]OB,double a,double b){
        for (int i = 0; i < OB.length; i++) {
            OB[i].set_A(10.5);
            OB[i].set_B(4.5);
            OB[i].tampil();
        }
    }
    public static void main(String[] args) {
        OperasiBilanganAbs[]OB ={
            new OperasiPenjumlahan(),
            new OperasiPengurangan(),
            new OperasiPerkalian(),
            new OperasiPembagian()
        };
        
        Cetak cetak=new Cetak();
        cetak.cetakSemua(OB, 10.5, 4.5);
    }
}
