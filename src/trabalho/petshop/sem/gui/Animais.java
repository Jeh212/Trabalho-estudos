
package trabalho.petshop.sem.gui;
public  abstract class Animais {
    public String nome;
    public String tipo;
    public int idade;
    public String cor;
    public String seAlimenta;
    
    //Metodos 
     public abstract void emetirSom();
     public abstract void locomover();
     public abstract void bravo();
     public abstract void tamanhoPequeno();
     public abstract void tamanhoGrande();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getSeAlimenta() {
        return seAlimenta;
    }

    public void setSeAlimenta(String seAlimenta) {
        this.seAlimenta = seAlimenta;
    }

    
    
    
    public void Status(){
        
            System.out.println("Nome do animal =  " + this.getNome());
            System.out.println("Tipo do animal =  " + this.getTipo() );
            System.out.println("Com a idade de = " + this.getIdade() + " Anos");
            System.out.println("Cor do Animal = " + this.getCor());
            System.out.println("Se alimenta de = " + this.getSeAlimenta());
            
        
    }
    
    
    
    
    
    
    
    
}
