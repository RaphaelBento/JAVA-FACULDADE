

package br.com.fis.model;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import br.com.fis.utl.Teclado;

public class Empregado { 
	

   private  String nome;
   private long cpf;
   private int ID;
   Teclado tc =new Teclado();
   private String nomeDpt;
  
   public Empregado(String nome,String nomedepart,long cpf,int ID){
	   this.nome=nome;
	   this.cpf=cpf;
	   this.ID=ID;
	   this.nomeDpt=nomedepart;
   }
   
   public void setNomeDepartamento(String NomeDepartamento) {
	   this.nomeDpt=NomeDepartamento;
   }
   
   public String getNomeDepartamento() {
	   return nomeDpt;
   }
   
   public void setNome(String nome){
	   this.nome=nome;
   
   }
   public String getNome(){
       return nome;
   }
   public void setCPF(long cpf){
      this.cpf= cpf;
      
   }
   public long getCPF() {
       return cpf;
   }
   public void setID(int id) {
	   this.ID=id;
   }
    public int getID() {
    	return ID;
    }   
    
   
	public void RetornaNome(String nome ,String departament) {
	this.nome=nome;
	this.nomeDpt=departament;
	String path = "c:\\"+nomeDpt+"\\"+nome+".txt";
	
	BufferedReader br = null;
	FileReader fr = null;
	try {
	fr = new FileReader(path);
	br = new BufferedReader(fr);
	String line = br.readLine();
	while (line != null) {
	System.out.println(line);
	line = br.readLine();
	}
	} catch (IOException e) {
	System.out.println("Error: " + e.getMessage());
	} finally {
	try {
	if (br != null)
	br.close();
	if (fr != null)
	fr.close();
	} catch (IOException e) {
	e.printStackTrace();
	}
	}
}
}
