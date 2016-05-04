package com.ejemplo;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThat;
//import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.Test;
import static org.hamcrest.Matchers.*;

import tutorial.junit.Calculadora;

public class Pruebas {

	@Test
	public void test() {
		
		Calculadora calculadora = new Calculadora();
		
		//JUnit  
	    //assertNotNull(calculadora);  
	      
	    //JUnit + Hamcrest  
	    assertThat(calculadora, is(not(nullValue())));
	    
	    //assertThat(calculadora, hasProperty("nombre"));
	}

}
