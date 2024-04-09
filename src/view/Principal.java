package view;

import br.edu.fateczl.filaobj.Fila;
import controller.OperacaoController;
import model.Cliente;

public class Principal {
	 public static void main(String[] args) {
		        Fila fila = new Fila();

		        for (int i = 1; i <= 20; i++) {
		            String nome = "Cliente " + i;
		            int quantidadePecas = (int) (Math.random() * 31) + 20; 
		            float valorPecas = (float) ((Math.random() * 95) + 5); 
		            Cliente cliente = new Cliente(nome, quantidadePecas, valorPecas);
		            fila.insert(cliente);
		        }

		        OperacaoController operacaoController = new OperacaoController();
		        operacaoController.caixa(fila);
		    }
	}


