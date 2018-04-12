/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animal.regime;

import animal.aliments.Aliment;
import animal.aliments.Viande;

/**
 *
 * @author diginamic05
 */
public class Carnivore extends Regime {
    
    public Carnivore()
    {
        
    }
    
    public void manger(Aliment a)
    {
        if(a.getClass() == Viande.class)
        {
            System.out.println("Je mange comme un carnivore");
        }
        else
        {
            System.out.println("Non merci");
        }
    }
}
