
package trabalho.petshop.sem.gui;


public class Mamiferos extends Animais  {
    
    
   
 
    @Override
    public void emetirSom() {
        System.out.println("Mamiferos emitem som");
    }

    @Override
    public void locomover() {
        System.out.println("Mamiferos correm");
    }

    @Override
    public void bravo() {
        System.out.println("Mamiferos podem ser selvagens ou nao");
    }

   
    @Override
    public void setTipo(String tipo) {
        super.setTipo(tipo); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getTipo() {
        return super.getTipo(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void tamanhoPequeno() {
        System.out.println("Mamifero pequeno");
    }

    @Override
    public void tamanhoGrande() {
        System.out.println("Mamifero grande");
    }

 

    
    
}
