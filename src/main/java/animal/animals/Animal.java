/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animal.animals;

import animal.aliments.Aliment;
import animal.regime.Regime;

/**
 *
 * @author diginamic05
 */
public abstract class Animal {
    
    protected int age;
    protected int poids;
    protected int taille;
    protected String nom;
    protected Regime r;
    
    public Animal(int a, int p, int t, String n)
    {
        this.age = a;
        this.poids = p;
        this.taille = t;
        this.nom = n;
    }
    
    public void manger(Aliment a)
    {
        this.r.manger(a);
    }
    
    public void manger(Animal an)
    {
        this.r.manger(an);
    }
    
    public void deplacer()
    {
        
    }
}
