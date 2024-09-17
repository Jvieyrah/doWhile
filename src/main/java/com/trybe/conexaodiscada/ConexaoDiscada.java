package com.trybe.conexaodiscada;

import java.util.Random;

/**
 * Classe ConexaoDiscada.
 *
 */
public class ConexaoDiscada {

  /**
   * Método principal.
   *
   */
  public static void main(String[] args) {
    // Seu código aqui
	  int tentativas = 0;
	  boolean atendeu = false;
	  String log;
	  
	  do {
		 atendeu = conectou();
		 tentativas += 1;
		 log = String.format("TENTATIVA= " + tentativas + " CONECTADO= " + atendeu);
		 System.out.println(log);
		 
	  } while (atendeu == false && tentativas < 3);  	  
  }

  // Chame esta função escrevendo `conectou()`
  static boolean conectou() {
    return conexaoDiscada.verdadeiroOuFalso();
  }

  static ConexaoDiscada conexaoDiscada = new ConexaoDiscada();

  // Retorna verdadeiro ou falso
  boolean verdadeiroOuFalso() {
    return new Random().nextInt(2) == 1;
  }

}
