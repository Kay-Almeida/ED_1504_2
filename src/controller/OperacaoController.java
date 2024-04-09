package controller;

import br.edu.fateczl.filaobj.*;
import model.Cliente;

public class OperacaoController {
	    public void caixa(Fila fila) {
	        while (!fila.isEmpty()) {
	            try {
	                Cliente cliente = (Cliente) fila.remove();
	                float valorTotalCompra = cliente.getQuantidadePecas() * cliente.getValorPecas();
	                System.out.println("Cliente: " + cliente.getNome() + ", Valor Total da Compra: " + valorTotalCompra);
	            } catch (Exception e) {
	                System.out.println(e.getMessage());
	            }
	        }
	    }
	}

	

