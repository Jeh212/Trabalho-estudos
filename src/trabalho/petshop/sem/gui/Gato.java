/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalho.petshop.sem.gui;

/**
 *
 * @author JP
 */
public class Gato extends Mamiferos{

    @Override
    public void bravo() {
        System.out.println(" O gato e bravo");
    }

    @Override
    public void locomover() {
        System.out.println("O gato corre");
    }

    @Override
    public void emetirSom() {
        System.out.println("O gato mia");
    }

    @Override
    public void tamanhoPequeno() {
        System.out.println("Gato(a) pequeno");
    }

    @Override
    public void tamanhoGrande() {
        System.out.println("Gato(a) grande");
    }
    
}
