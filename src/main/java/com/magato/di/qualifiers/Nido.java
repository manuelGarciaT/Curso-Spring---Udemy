/**
 * 
 */
package com.magato.di.qualifiers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author mgarc
 *
 */
@Component
public class Nido {
	
	private static final Logger log = LoggerFactory.getLogger(Nido.class);

		@Autowired
	private Animal animal;
	
	public void imprimir() {
		log.info("Mi nido tiene un animal {} ", animal.getNombre());


	}

}
