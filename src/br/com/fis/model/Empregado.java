

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
   
   public Empregado(String nome,long cpf,int ID){
	   this.nome=nome;
	   this.cpf=cpf;
	   this.ID=ID;
   }
   
   public void setNome(String nome){
	   this.nome=nome;
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

   
	public void RetornaNome(/*coloque aqui os parametros da consulta*/) {//retorne uma string com os dados.
	
	//os menus devem existir somente na view
	System.out.println("informe o nome do departamento para obter informações");
	tc.setLerDepart(nome);
	System.out.println("Agora informe o nome do funcionário que deseja encontrar");
	tc.setLerString2(nome);
	
	 // daqui para baixo deveria estar somente em empregadoBO sem os menus
	String path = "c:\\"+tc.getDevolveDpart()+"\\"+tc.getDevolveString2()+".txt";
	
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
