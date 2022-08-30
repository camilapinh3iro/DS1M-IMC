package br.senai.sp.jandira;

import java.awt.Color;
import java.awt.Font;
import java.time.LocalDate;

import br.senai.sp.jandira.gui.FrameCalculoImc;
import br.senai.sp.jandira.model.Cliente;

public class AppAcademia {

	public static void main(String[] args) {
		
		FrameCalculoImc tela1 = new FrameCalculoImc();
		tela1.titulo = "Calculadora IMC";
		tela1.largura = 400;
		tela1.altura = 600;
		tela1.corFundoDeTela = new Color(64, 128, 128);
		tela1.corDoTextoDoBotao = new Color(0, 0, 0);
		tela1.corDoBotao = new Color(192, 192, 192);
		tela1.fonteDosLabels = new Font("Arial Black", Font.BOLD, 13);
		tela1.corDoTitulo = new Color(255, 255, 255);
		tela1.corDosLabels = new Color(192, 192, 192);
		tela1.criarTela();
		
//		FrameCalculoImc tela2 = new FrameCalculoImc();
//		tela2.titulo = "Calculadora IMC";
//		tela2.largura = 400;
//		tela2.altura = 600;
//		tela2.corFundoDeTela = new Color(180, 15, 0);
//		tela2.corDoTextoDoBotao = new Color(0, 0, 0);
//		tela2.corDoBotao = new Color(80, 50, 50);
//		tela2.fonteDosLabels = new Font("Arial Black", Font.BOLD, 13);
//		tela2.corDoTitulo = new Color(0, 0, 0);
//		tela2.criarTela();
		
		Cliente ana = new Cliente();
		Cliente pedro = new Cliente();
		
//		System.out.println(ana);
//		System.out.println(pedro);
		
		ana.nome = "Ana Maria Braga";
		ana.dataDeNascimento = LocalDate.of(1950, 6, 21);
		
		pedro.nome = "Pedro Dias";
		pedro.dataDeNascimento = LocalDate.of(2000, 2, 2);
				
				
				
	}

}
