package br.com.fis.controller;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import br.com.fis.utl.Teclado;

public class EmpregadoBo {
	 Teclado tc =new Teclado();
	 private  String nome;
	   private long cpf;
	   private int ID;
	   private String nomedepart;
	   
	   public EmpregadoBo(String nome,String depart,long cpf,int ID){
		  this.nomedepart=depart;
		   
		   this.nome=nome;
		
		   this.cpf=cpf;
		 
		   this.ID=ID;
	   }
	    
	   
	   public void setDpart(String nomeDepart) {
		  
		   this.nomedepart=nomeDepart;
	   }
	   public String getDepart() {
		   return nomedepart;
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

	
     public void GravarFuncionario() {
    	 
    	 String lines=nome;
    	 long s = cpf;
		 String i = String.valueOf(ID);
		 String dep=nomedepart;
		 String pathe = "C:\\"+dep+"\\"+lines+".txt";
			
			try(BufferedWriter bw = new BufferedWriter(new FileWriter(pathe,true))){
			
				
					bw.write("CPF do funcionário: "+s);
					bw.newLine();
				
					bw.write("Nome do funcionário: "+lines);
					bw.newLine();
					
					bw.write("Identificação do funcionário: "+i);
					bw.newLine();
					bw.close();
			}
			catch(IOException e) {
				System.out.println("Arquivo de funcionário não pode ser criado  \nporque departamento informado não existe ou \nfoi inserido nome do mesmo de forma incorreta\nDigite 1 e tente novamente");
			}			
     }
     
     
 	public void Devolvetudo(String nomeDpt) {
		this.nomedepart=nomeDpt;
		File arquivos[];  
		

			File diretorio = new File("c:\\"+nomedepart+"\\");
			arquivos = diretorio.listFiles();
		   
		
			for ( int j = 0; j < arquivos.length ;j++) {
			
				   System.out.println (arquivos[j].toString());	   
		}
	      for(int k =0; k<arquivos.length;k++) {
	    	  File path = arquivos[k];
	    		
	    		BufferedReader br = null;
	    		FileReader fr = null;
	    		try {
	    		fr = new FileReader(path);
	    		br = new BufferedReader(fr);
	    		String line = br.readLine();
	    		System.out.println("\n");
	    		while (line != null) {
	    			
	    		System.out.println(line);
	    		line = br.readLine();
	    		
	    		}
	    		} catch (IOException e) {
	    		System.out.println("Error: " );
	    		} finally {
	    		try {
	    		if (br != null)
	    		br.close();
	    		if (fr != null)
	    		fr.close();
	    		} catch (IOException e) {
	    		
	    		}
	    		}
	      }
		
	}
			}