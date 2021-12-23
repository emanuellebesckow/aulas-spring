package meli.br.com.bootcamp.converteRomanos.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/convertenumeros")
public class ConverteController {
//	Desenvolva uma API para converter um número decimal em um número romano.
	public int[] valoresInteiros = { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };;
	public String[] valoresRomanos = { "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I" };

	@GetMapping("/{valorInteiro}")
	public String recebeRomano(@PathVariable int valorInteiro) {
		String valorRomano = "";
		if (valorInteiro == 0) {
			return "Zero não é número romano";
		} else {
			for (int i = 0; i < valoresInteiros.length; i++) {
				while (valorInteiro >= valoresInteiros[i]) {
					valorInteiro -= valoresInteiros[i];
					valorRomano += valoresRomanos[i];
				}
			}
		}
		return valorRomano;
	}

}
