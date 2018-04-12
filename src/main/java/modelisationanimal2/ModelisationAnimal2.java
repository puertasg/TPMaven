/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelisationanimal2;

import animal.aliments.*;
import animal.animals.*;

/**
 *
 * @author diginamic05
 */
public class ModelisationAnimal2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Lapin l = new Lapin(1, 2, 3, "l");
        Lion li = new Lion(1, 2, 3, "li");
        Hyene hy = new Hyene(1, 2, 3, "h");
        
        Homme ho = new Homme(1, 2, 3, "ho");
        Homme ho2 = new Homme(1, 2, 3, "ho");
        
        Aliment v = new Viande();
        Aliment h = new Herbe();
        
        ho.manger(hy);
        ho.manger(h);
        
        ho.manger(ho2);
    }
}
