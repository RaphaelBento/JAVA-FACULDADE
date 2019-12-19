
package br.com.fis.view;
import br.com.fis.model.Departamento;
import br.com.fis.model.DepartamentoBo;
import br.com.fis.model.Empregado;
import br.com.fis.model.EmpregadoBo;
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
        	
    	System.out.println("\nOlá bem vindo ao sistema\nMenu:\n1 - Departamento\n2 - Funcionário\n3 - Gerentes\n99 - Sair");
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
    		System.out.println("\n1 - Criar funcionário\n2- consultar nome de funcionário\n3 - Cconsultar todos os funcionários ");
    		int caso2 = 0;
			tc.setCaso2(caso2);
			
			switch(tc.getRetornaCaso2()) {
    		
			case 1:
			System.out.println("Insira o nome do departamento onde o funcionário será alocado");
        	tc.setLerString2(nomeDpt2);
        	
    		System.out.println("Insira o nome do novo funcionário");
        	tc.setLerString(nome);
        	
        	System.out.println("Insira o cpf do funcionario");
        	tc.setLerLong(cpf);
        	
        	System.out.println("Insira o ID do funcionario");
        	tc.setLerInt(ID);
        	
        	System.out.println("Deseja salvar funcionario cadastrado\n1 - Salvar\n99 - sair");	
        	
        	
        	Empregado func=new Empregado(tc.getDevolveString(),tc.getDevoveLong(),tc.getDevolvaInt());
    		
          	System.out.println("\nGerando Arquivo..........");
          	
          	EmpregadoBo funcDados =new EmpregadoBo(func.getNome(),tc.getDevolveString2(),func.getCPF(),func.getID());
          	
    		funcDados.GravarFuncionario(func.getNome(),tc.getDevolveString2(),func.getCPF(),func.getID());
    		break;
       
		case 2:/*chama a função da classe Empregado que cuida de todo resto*/		
		Empregado func2=new Empregado(tc.getDevolveString(),tc.getDevoveLong(),tc.getDevolvaInt());
    	func2.RetornaNome();
    	break;
    	
		case 3://Método GetAll();
			
		EmpregadoBo func3=new EmpregadoBo(tc.getDevolveString(),tc.getDevolveDpart(),tc.getDevoveLong(),tc.getDevolvaInt());
		System.out.println("Informe o nome do departamento o qual deseja obter todos os nomes cadastrados");
		tc.setLerDepart(nomeDpt);	
		System.out.println(tc.getDevolveDpart());
		func3.Devolvetudo(tc.getDevolveDpart());
		
    	
		break;
		
        case 99:	
    		System.out.println("\nFuncionario não foi salvo no cadastro!!!!");
    		break;
    		
    	default :
    		System.out.println("Opção invalida");
    		break;
        }
    		break;
    	
    	case 99:	
    	break;
    		default :
    			System.out.println("Opção invalida");
    			break;
    		
    	}
    	System.out.println("\nDeseja voltar ao Menu Inicial\n1 - Sim\n99 - Não encerrar por Hoje");
    	tc.setLoop(loop);	
    	}while(tc.getDevolveLoop()!=99);
    	
    }
}	
    	
    	
    
    	
    	
  
    	
    	
    	
