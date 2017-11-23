/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalho.petshop.sem.gui;

import java.util.HashSet;

/**
 *
 * @author JP
 */
public class TrabalhoPetshopSemGui {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ////Dog1
        Cachorro ca = new Cachorro();
        
        ca.setNome("MR.Pickles");
        ca.setTipo("Mamifero");
        ca.setIdade(5);
        ca.setCor("Preta");
        ca.setSeAlimenta("Leite ou Racao");
        ca.tamanhoGrande();
        ca.locomover();
        ca.bravo();
        ca.Status();

        
        System.out.println("\n_________________________________");
        
      
        Cachorro ca2 = new Cachorro();
        
        ca2.setNome("Jake");
        ca2.setTipo("Mamifero");
        ca2.setIdade(2);
        ca2.setCor("Branco");
        ca2.setSeAlimenta("So Racao Especial");
        ca2.tamanhoPequeno();
        ca2.locomover("Anda");
        ca2.emetirSom();
        ca2.Status();
        
        
        
        System.out.println("__________________________\n");
        
        
        Gato ga = new Gato();
        
        ga.setNome("Felix");
        ga.setTipo("Mamifero");
        ga.setIdade(6);
        ga.setCor("Branco");
        ga.setSeAlimenta("Racao ou leite");
        ga.bravo();
        ga.locomover();
        ga.emetirSom();
        ga.tamanhoPequeno();
        ga.Status();
        
        
        
        
        
        
    }

}
