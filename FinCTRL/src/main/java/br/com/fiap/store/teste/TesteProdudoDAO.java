package br.com.fiap.store.teste;

import java.util.Calendar;
import java.util.List;

import br.com.fiap.store.bean.Produto;
import br.com.fiap.store.dao.ProdutoDAO;
import br.com.fiap.store.exception.DBException;
import br.com.fiap.store.factory.DAOFactory;


public class TesteProdudoDAO {

	public static void main(String[] args) {
		ProdutoDAO dao = DAOFactory.getProdutoDAO();
		
		//CADASTRAR UM PRODUTO
		Produto produto = new Produto
				(0,"Caderno",20,Calendar.getInstance(),100);
		try {
			dao.cadastrar(produto);
			System.out.println("Produto cadastrado!");
		} catch (DBException e) {
			e.printStackTrace();
		}
		
		//Buscar um produto pelo codigo e atualizar
		produto = dao.buscar(5);
		produto.setNome("Caderno capa dura");
		produto.setValor(30);
		try {
			dao.atualizar(produto);
			System.out.println("Produto atualizado!");
		} catch (DBException e) {
			e.printStackTrace();
		}
		
		//Listar os produtos
		List<Produto> lista = dao.listar();
		for (Produto item : lista) {
			System.out.println(item.getNome() + "" + item.getQuantidade() + "" + item.getValor());
		}
		
		//Remover um produto
		try {
		dao.remover(1);
		System.out.println("Produto removido");
		}catch (DBException e) {
			e.printStackTrace();
		}

	}

}
