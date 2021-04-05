package com.algaworks.brewer.session;

import java.util.Arrays;
import java.util.List;

public class Principal {
	public static void main(String[] args) {
		
		System.out.println(withCursoNome("Gestão Orçamentária e Financeira para Redução de Riscos de Desastres", 
				"GESTÃO ORÇAMENTARIA E FINANCEIRA P/ REDUÇÃO DE RISCOS DE DESASTRES", 
				"", 
				""));

//		List<String> alfabeto = Arrays.asList("a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o",
//				"p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z");
//
//		for (String letra : alfabeto) {
//			System.out.printf((pularLinha(alfabeto, letra, 4)) ? "\n" : " - ");
//			System.out.printf(parOuImpar(alfabeto, letra) ? letra.toUpperCase() : letra);
//		}
	}

	private static boolean pularLinha(List<String> alfabeto, String letra, int indice) {
		return (alfabeto.indexOf(letra) % indice == 0);
	}

	private static boolean parOuImpar(List<String> alfabeto, String letra) {
		return alfabeto.indexOf(letra) % 2 == 0;
	}

	private static String withCursoNome(String descricaoMarketing, String descricaoTipoCurso, String descCurso1,
			String descCurso2) {
		String cursoNome;
		if (descricaoMarketing != null) {
			if (descricaoTipoCurso != null) {
				cursoNome = String.format("%s - %s", descricaoMarketing, descricaoTipoCurso);
			} else {
				cursoNome = descricaoMarketing;
			}
		} else if (descCurso2 == null) {
			cursoNome = descCurso1;
		} else if (descCurso1 == null) {
			cursoNome = descCurso2;
		} else {
			cursoNome = descCurso1.length() > descCurso2.length() ? descCurso1 : descCurso2;
		}
		
		return cursoNome;
	}
}
