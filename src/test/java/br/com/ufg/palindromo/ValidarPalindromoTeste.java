package br.com.ufg.palindromo;

import org.junit.Assert;
import org.junit.Test;

public class ValidarPalindromoTeste {
	
	@Test
	public void main(){
		
		ValidarPalindromo validador = new ValidarPalindromo();
		
		Assert.assertEquals(true, validador.ehPalindromo("asasasasa"));
		Assert.assertEquals(true, validador.ehPalindromo("ovo"));
		//Assert.assertEquals(true, validador.ehPalindromo("goias"));
	}

}
