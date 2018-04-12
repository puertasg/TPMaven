/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animal.animals;

import animal.regime.Carnivore;

/**
 *
 * @author diginamic05
 */
public class Lion extends Animal {
    
    public Lion(int a, int p, int t, String n)
    {
        super(a, p, t, n);
        this.r = new Carnivore();
    }
}
