/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animal.regime;

import animal.aliments.Aliment;
import animal.aliments.Herbe;

/**
 *
 * @author diginamic05
 */
public class Herbivore extends Regime {
    
    public Herbivore()
    {
        
    }
    
    public void manger(Aliment a)
    {
        if(a.getClass() == Herbe.class)
        {
            System.out.println("Je mange comme un herbivore");
        }
        else
        {
            System.out.println("Non merci");
        }
    }
}
