package telas;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

import classes.Cliente;
import classes.Filme;
import telas.FilmeAluguel;
import telas.FilmeCadastro;


class Main {
	JMenu menuCadastros, submenuCadastros, menuLocacao;
	JMenuItem i1, i2, i3, i4, i5, i6, i7;
	ArrayList<String> categorias, generos;
	ArrayList<Filme> filmes;
	ArrayList<Cliente> clientes;
	
	//ArrayList<String> cadGenero = new ArrayList<>(Arrays.asList (new String[]{"", "A��o", "Aventura", "Com�dia", "Drama", "Romance", "Suspense", "Terror", "Musical"}));
	
	
	Main() {
		
		generos = new ArrayList<>(Arrays.asList (new String[]{"", "A��o", "Aventura", "Com�dia", "Drama", "Romance", "Suspense", "Terror", "Musical"}));
		categorias = new ArrayList<String>(Arrays.asList (new String[]{"", "Lan�amento", "Padr�o", "Antigo"}));
		filmes = new ArrayList<Filme>();
		clientes = new ArrayList<Cliente>();
		
		JFrame f = new JFrame("Locadora");
		JMenuBar mb = new JMenuBar();
		menuCadastros = new JMenu("Cadastros");
		menuLocacao = new JMenu("Loca��o");
		submenuCadastros = new JMenu("Sub Menu");
		
		
		i1 = new JMenuItem("G�nero");
		final JDesktopPane jdpGenero = new JDesktopPane();
		i1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Genero generoFrame = new Genero(generos);
				generoFrame.setVisible(true);
				jdpGenero.add(generoFrame);
				f.setContentPane(jdpGenero);
				/*for(String s: generos) {
					System.out.println(s);}*/
			}
		});

		
		i2 = new JMenuItem("Categoria");
		final JDesktopPane jdpCategoria = new JDesktopPane();
		i2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Categoria categoriaFrame = new Categoria(categorias);
				jdpCategoria.add(categoriaFrame);				
				categoriaFrame.setVisible(true);
				f.setContentPane(jdpCategoria);
			}
		});
		
		
		i3 = new JMenuItem("Filme");
		final JDesktopPane jdpFilme = new JDesktopPane();
		i3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FilmeCadastro filmeFrame = new FilmeCadastro(filmes, generos, categorias);
				jdpFilme.add(filmeFrame);
				filmeFrame.setVisible(true);
				f.setContentPane(jdpFilme);
			}
		});
		
		
		i4 = new JMenuItem("Cliente");
		final JDesktopPane jdpCliente = new JDesktopPane();
		i4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ClienteCadastro clienteFrame = new ClienteCadastro(clientes);
				
				jdpCliente.add(clienteFrame);
				clienteFrame.setVisible(true);
				f.setContentPane(jdpCliente);
			}
		});
		
		
		i5 = new JMenuItem("Item 5");
		i6 = new JMenuItem("Item 6");
		
		
		menuCadastros.add(i1);
		menuCadastros.add(i2);
		menuCadastros.add(i3);
		menuCadastros.add(i4);
		menuCadastros.add(submenuCadastros);
		submenuCadastros.add(i5);
		submenuCadastros.add(i6);
		mb.add(menuCadastros);
		
		
		i7 = new JMenuItem("Nova");
		final JDesktopPane jdpNova = new JDesktopPane();
		i7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FilmeAluguel novaFrame = new FilmeAluguel(filmes, generos, categorias, clientes);
				
				jdpNova.add(novaFrame);
				novaFrame.setVisible(true);
				f.setContentPane(jdpNova);
			}
		});
		
		
		menuLocacao.add(i7);
		mb.add(menuLocacao);
		
		
		f.setJMenuBar(mb);
		f.setSize(650, 450);
		f.setLayout(null);
		f.setLocationRelativeTo(null);
		f.setVisible(true);
		
		f.addWindowListener(new WindowAdapter() {

			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}

	
	
	public static void main(String args[]) {
		new Main();
	}
	
}