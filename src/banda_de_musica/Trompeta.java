/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banda_de_musica;

/**
 *
 * @author Michael
 */
public class Trompeta extends IViento
{
    public Trompeta()
    {
        
    }
    
    public void tocar(char nota)
    {
        System.out.println("Scorit toca la trompeta " + nota);
    }
}
