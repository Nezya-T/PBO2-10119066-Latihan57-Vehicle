/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10119066.latihan57.vehicle;

/**
 *
 * @author Neyza-T
 */
public class Skateboard extends Vehicle{
    private double myBoardLength;
    
    public Skateboard(){
        System.out.println("SkateBoard");
}
    public double getMyBoardLength(){
        return myBoardLength;
    }
    public void setMyBoardLength(double MyBoardLength){
        this.myBoardLength = myBoardLength;
    }
    
}
