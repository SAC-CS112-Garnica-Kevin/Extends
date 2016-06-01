/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgextends;

/**
 *
 * @author owner
 */
public class Extends {

    
    public static void main(String[] args) {
        tuna TunaObject = new tuna();
        pie PieObject = new pie();
        food bucky[]=new food[2];
        bucky[0] = new tuna();
        bucky[1] = new pie();
        
        TunaObject.eat();
        PieObject.eat();
        
        for(int x = 0; x<2; ++x){
            
            bucky[x].eat();
        }
        
    }
    
}
