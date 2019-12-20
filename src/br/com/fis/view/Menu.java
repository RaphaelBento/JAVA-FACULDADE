
package br.com.fis.view;

import br.com.fis.controller.DepartamentoBo;
import br.com.fis.controller.EmpregadoBo;
import br.com.fis.model.Departamento;
import br.com.fis.model.Gerente;
import br.com.fis.utl.Teclado;


public class Menu {
	
    public static void main(String[] args){
    	
    	String nome=null,nomeDpt=null,nomeDpt2=null;
    	int ID = 0,IdDpt=0,loop = 0;
    	long cpf = 0;
    	int caso = 0;
    
    	Teclado tc=new Teclado();
    	
    	do {
    		
        	Departamento depart = new Departamento(tc.getDevolvaInt2(),tc.getDevolveString2());
        	
    	System.out.println("\nOl� bem vindo ao sistema\nMenu:\n1 - Departamento\n2 - Funcion�rio\n3 - Gerentes\n99 - Sair");
    	tc.setCaso(caso);
    	
    	switch(tc.getDevolveCaso()) {
    	
    	case 1:
    		
    		System.out.println("Insira o nome do departamento que deseja criar");
        	tc.setLerString2(nomeDpt);
        	
        	System.out.println("Insira o ID do departamento");
        	tc.setLerInt2(IdDpt);
    		
    		System.out.println("pasta salva");
    		
    		
    		Departamento depart2 = new Departamento(tc.getDevolvaInt2(),tc.getDevolveString2());
    		
    		depart.setNome(nomeDpt);
    		depart.setNumero(IdDpt);
    		
        	DepartamentoBo dptBo = new DepartamentoBo(depart2.getNome());
        	
        	System.out.println("Departamento criado em forma de pasta com nome :"+depart2.getNome());
    		dptBo.GravarPasta();
    		break;
    		
    	case 2 :
    		System.out.println("\n1 - Criar funcion�rio\n2 - Consultar todos os funcion�rios ");
    		int caso2 = 0;
			tc.setCaso2(caso2);
			
			switch(tc.getRetornaCaso2()) {
    		
			case 1:
			System.out.println("Insira o nome do departamento onde o funcion�rio ser� alocado");
        	tc.setLerString2(nomeDpt2);
        	
    		System.out.println("Insira o nome do novo funcion�rio");
        	tc.setLerString(nome);
        	
        	System.out.println("Insira o cpf do funcionario");
        	tc.setLerLong(cpf);
        	
        	System.out.println("Insira o ID do funcionario");
        	tc.setLerInt(ID);
        	
        	System.out.println("esse funcion�rio ser� o gerente de qual departamento");
    		tc.setLerDepart(nomeDpt2);
    		
    		Gerente ger =new Gerente(nome, nomeDpt2, cpf, ID);
    		ger.DevolveGerente(tc.getDevolveString2(), tc.getDevoveLong());
    		
        	
          	System.out.println("\nGerando Arquivo..........");
          	
          	EmpregadoBo funcDados =new EmpregadoBo(tc.getDevolveString(),tc.getDevolveString2(),tc.getDevoveLong(),tc.getDevolvaInt());
          	
    		funcDados.GravarFuncionario();
    		break;
  
		case 2://M�todo GetAll();
			
		EmpregadoBo func3=new EmpregadoBo(nome,nomeDpt2,cpf,ID);
		System.out.println("Informe o nome do departamento o qual deseja obter todos os nomes cadastrados");
		tc.setLerDepart(nomeDpt);	
		System.out.println(tc.getDevolveDpart());
		func3.Devolvetudo(tc.getDevolveDpart());
		
    	
		break;
		
        case 99:	
    		System.out.println("\nFuncionario n�o foi salvo no cadastro!!!!");
    		break;
    		
    	default :
    		System.out.println("Op��o invalida");
    		break;
        }
    		break;
    	
    	case 99:	
    	break;
    		default :
    			System.out.println("Op��o invalida");
    			break;
    		
    	}
    	System.out.println("\nDeseja voltar ao Menu Inicial\n1 - Sim\n99 - N�o encerrar por Hoje");
    	tc.setLoop(loop);	
    	}while(tc.getDevolveLoop()!=99);
    	
    }
}	
    	
    	
    
    	
    	
  
    	
    	
    	
