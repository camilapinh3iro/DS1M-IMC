package br.senai.sp.jandira.gui;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import br.senai.sp.jandira.model.Cliente;

public class FrameCalculoImc {

	public String titulo; 
	public int largura;
	public int altura; 
	public Color corFundoDeTela;
	public Font fonteDosLabels;
	public Color corDoTextoDoBotao;
	public Color corDoBotao;
	public Color corDoTitulo; 
	public Color corDosLabels;
	
	public void criarTela() {
		JFrame tela = new JFrame(); 
		tela.setTitle(titulo);
		tela.setSize(largura, altura);
		tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		tela.setLayout(null);
		
		// Para obter a instância do painel de conteúdo (Container):
		Container painel = tela.getContentPane();
		painel.setBackground(corFundoDeTela);
		
		// Criar os componentes da tela e colocar no painel (Container):
		JLabel labelImc = new JLabel();
		labelImc.setText("IMC");
		labelImc.setBounds(30, 10, 300, 30);
		labelImc.setFont(new Font("AmericanTypewriter-Light", Font.BOLD, 32));
		labelImc.setForeground(corDoTitulo);
		
		JLabel labelNome = new JLabel();
		labelNome.setText("Nome:");
		labelNome.setBounds(30, 50, 100, 30);
		labelNome.setForeground(corDosLabels);
		
		JTextField TextFieldNome = new JTextField();
		TextFieldNome.setBounds(30, 80, 300, 30);
		
		JLabel labelPeso = new JLabel();
		labelPeso.setText("Peso:");
		labelPeso.setBounds(30, 130, 100, 30);
		
		JTextField TextFieldPeso = new JTextField();
		TextFieldPeso.setBounds(30, 160, 150, 30);
		
		JLabel labelAltura = new JLabel();
		labelAltura.setText("Altura:");
		labelAltura.setBounds(30, 220, 150, 30);
		
		JTextField TextFieldAltura = new JTextField();
		TextFieldAltura.setBounds(30, 250, 150, 30);
		
		JLabel labelDataNascimento = new JLabel();
		labelDataNascimento.setText("Data de Nascimento:");
		labelDataNascimento.setBounds(30, 310, 200, 30);
		
		JTextField TextFieldDataNascimento = new JTextField();
		TextFieldDataNascimento.setBounds(30, 340, 150, 30);
		
		JLabel labelValorIMC = new JLabel();
		labelValorIMC.setText("Seu IMC é xxx");
		labelValorIMC.setBounds(30, 400, 300, 30);
		
		JLabel labelStatus = new JLabel();
		labelStatus.setText("Seu status IMC xxx");
		labelStatus.setBounds(30, 460, 300, 30);
		
		JButton buttonCalcular = new JButton();
		buttonCalcular.setText("Calcular");
		buttonCalcular.setBounds(230, 340, 100, 30);
		buttonCalcular.setForeground(corDoTextoDoBotao);
		buttonCalcular.setBackground(corDoBotao);
		
		// Eventos 
		buttonCalcular.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				Cliente cliente = new Cliente();
				cliente.nome = TextFieldNome.getText();
				cliente.peso = Double.parseDouble(TextFieldPeso.getText());
				cliente.altura = Double.parseDouble(TextFieldAltura.getText());
				
				labelValorIMC.setText(cliente.nome + ", seu IMC é " + cliente.getImc());
				
				labelStatus.setText("Status: " + cliente.getStatus());
				
				
				
			}
		});
		
		
		
		TextFieldNome.addKeyListener(new KeyListener() {
			
			@Override
			public void keyTyped(KeyEvent e) {
				
				System.out.println(e.getKeyCode());
				
			}
			
			@Override
			public void keyReleased(KeyEvent e) {
				
				
			}
			
			@Override
			public void keyPressed(KeyEvent e) {
				
				
			}
		});
		
		
		
		
		// Adicionar componentes ao Container
		painel.add(labelImc);
		painel.add(buttonCalcular); 
		painel.add(labelNome);
		painel.add(TextFieldNome);
		painel.add(labelPeso);
		painel.add(TextFieldPeso);
		painel.add(labelAltura);
		painel.add(TextFieldAltura);
		painel.add(labelDataNascimento);
		painel.add(TextFieldDataNascimento);
		painel.add(labelValorIMC);
		painel.add(labelStatus);
		
		tela.setVisible(true);
		
		
	}
	
	
	
}
