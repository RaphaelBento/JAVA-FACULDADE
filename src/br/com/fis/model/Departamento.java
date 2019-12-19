
package br.com.fis.model;


public class Departamento {
   private int numero;
   private String nomeDepartamento;
    
   public Departamento(int numero, String nome){
        this.nomeDepartamento=nome; this.numero=numero;
       
    }
    public void setNumero(int numero){
        this.numero=numero;
    }
    public int getNumero(){
        return numero;
    }
    public void setNome(String nome){
        this.nomeDepartamento=nome;
    }
    public String getNome(){
        return nomeDepartamento;
    }
}

