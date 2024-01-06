package br.com.fiap.store.teste;

import br.com.fiap.store.util.CriptografiaUtils;

public class CriptografiaTeste {
	
	public static void main(String[] args) {
		try {
			System.out.println(CriptografiaUtils.criptografar("admin"));
			System.out.println(CriptografiaUtils.criptografar("admin"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}