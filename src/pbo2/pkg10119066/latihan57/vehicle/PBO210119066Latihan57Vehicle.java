/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10119066.latihan57.vehicle;

/**
 *
 * @author Neyza-T
 * Nama     : Nezya Tariska
 * Kelas    : IF2
 * Nim      : 10119066
 */
public class PBO210119066Latihan57Vehicle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Bicycle b = new Bicycle();
        
        b.setMyBrand("Trek Bike");
        b.setMyModel("7.4FX");
        b.setMyGearCount(23);
        System.out.println("Brand \t\t: " + b.getMyBrand());
        System.out.println("Model \t\t: " + b.getMyModel());
        System.out.println("Jumlah gear \t: " + b.getMyGearCount());
        System.out.println("");
        Skateboard sb = new Skateboard();
        sb.setMyBrand("Ally Skate");
        sb.setMyModel("Rocket");
        sb.setMyBoardLength(54.5);
        System.out.println("Brand \t\t: " + sb.getMyBrand());
        System.out.println("Model \t\t: " + sb.getMyModel());
        System.out.println("Jumlah gear \t: " + sb.getMyBoardLength());
    }
    
}
