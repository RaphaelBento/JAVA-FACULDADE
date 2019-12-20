package br.com.fis.controller;

import java.io.File;

public class DepartamentoBo {

	
	String nomeDpt;
	public DepartamentoBo(String dpt) {
		
		this.nomeDpt=dpt;
	}
	public void GravarPasta() {
	String Path="C:\\";
	String nome=nomeDpt;
	File path1 =new File(Path);
	
	File [] folders= path1.listFiles(File::isDirectory);
	System.out.println("pastas");
	for(File folder : folders) {
		System.out.println(folder);
	}
	
boolean sucesso= new File(Path+nome).mkdir();
	if(sucesso==true) {
	System.out.println("Nova pasta criada ");
	}
	else {
		System.out.println("Pasta já existe no diretório operação de criação de pasta cancelada.");
	}
}
}