import java.util.*;

public class Exe1038main {

    static Scanner inp = new Scanner(System.in);

    public static void main(String[] args){
	mostrarMenu();
    }
    public static void mostrarMenu(){
	int cod = -1, qua = 0;
	double total = 0, soma = 0;
	try{
	    System.out.println("1 Cachorro quente R$ 4.00. \n2 X-salada R$ 4.50. \n3 X-bacon R$ 5.00. \n4 Torrada simples R$ 2.00. \n5 Refrigerante R$ 1.50. \n0 finalizar: ");
	    
	    while(cod != 0){
		System.out.print("Escolha: ");
		cod = inp.nextInt();
		if(cod == 0) break;
		System.out.print("Quantidade: ");
		qua = inp.nextInt();
		Exe1038 obj = new Exe1038(cod, qua);
		soma+= obj.menu(total);
		
	    }
	    System.out.println();
	    System.out.printf("Total R$ %.2f%n", soma);   	    
	}catch(Exception e){
	    System.out.println("Erro "+e);
	    inp.nextLine();
	    mostrarMenu();
	}
    }
}
