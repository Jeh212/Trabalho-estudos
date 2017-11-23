
package trabalho.petshop.sem.gui;


public class Cachorro extends Mamiferos {

    @Override
    public void bravo() {
        System.out.println("BRAVO");
    }

    @Override
    public void locomover() {
        System.out.println("CORRE");
    }

    public void locomover(String locomover) {
        System.out.println("ANDA");
    }
    
    
    @Override
    public void emetirSom() {
        System.out.println("LATE ");
    }

   
  
    @Override
    public void tamanhoPequeno() {
        System.out.println("Cachorro pequeno");
    }

    @Override
    public void tamanhoGrande() {
        System.out.println("Cachorro grande");
    }
    
    
    
}
