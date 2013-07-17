package com;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;

@SuppressWarnings("serial")
public class MainClass extends JFrame
{
	private JPanel contentPane;
	private Jugador nuevoJug;
	private Equipo nuevoEq;
	@SuppressWarnings("unused")
	private Entrenador nuevoEntr;
	@SuppressWarnings("unused")
	private Arbitro nuevoArb;
	private String nifPers,nomPers,fNacPers,posJug,nomEqEntr,catArb,nomEq,ciudad;
	
	public static void main(String[] args){
		EventQueue.invokeLater(new Runnable(){

			public void run(){
				try{
					MainClass frame=new MainClass();
					frame.setVisible(true);
				}catch(Exception e){
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MainClass(){
		setTitle("Liga de Futbol");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(150,50,1100,600);
		contentPane=new JPanel();
		contentPane.setBorder(new EmptyBorder(5,5,5,5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane=new GridBagLayout();
		gbl_contentPane.columnWidths=new int[]{0,0,0,0};
		gbl_contentPane.rowHeights=new int[]{0,0,0,0,0};
		gbl_contentPane.columnWeights=new double[]{1.0,1.0,1.0,Double.MIN_VALUE};
		gbl_contentPane.rowWeights=new double[]{0.0,0.0,0.0,1.0,Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		JButton btnAadirJugadorAl_1=new JButton("A\u00F1adir jugador al equipo");
		btnAadirJugadorAl_1.addActionListener(new ActionListener(){

			public void actionPerformed(ActionEvent arg0){
				String nifJug=JOptionPane.showInputDialog("nif");
				String nomEq=JOptionPane.showInputDialog("A que equipo(nombre)?");				
				if (Equipo.listaEquipos.get(nomEqEntr) == null)
					JOptionPane.showMessageDialog(null, "Este equipo no existe");
				else
					nuevoEq.addJugador((Equipo)Equipo.listaEquipos.get(nomEq),nomEq,nifJug);
			}
		});
		JButton btnVerTodosLos=new JButton("Crear nuevo equipo");
		btnVerTodosLos.addActionListener(new ActionListener(){

			public void actionPerformed(ActionEvent e){
				nomEq=JOptionPane.showInputDialog("Nombre del equipo");
				ciudad=JOptionPane.showInputDialog("Ciudad del equipo");
				nuevoEq=new Equipo(nomEq,ciudad);
			}
		});
		GridBagConstraints gbc_btnVerTodosLos=new GridBagConstraints();
		gbc_btnVerTodosLos.fill=GridBagConstraints.HORIZONTAL;
		gbc_btnVerTodosLos.insets=new Insets(0,0,5,5);
		gbc_btnVerTodosLos.gridx=0;
		gbc_btnVerTodosLos.gridy=0;
		contentPane.add(btnVerTodosLos,gbc_btnVerTodosLos);
		JButton btnVerEquiposDe=new JButton("Nuevo entrenador");
		btnVerEquiposDe.addActionListener(new ActionListener(){

			public void actionPerformed(ActionEvent e){			
				nifPers=JOptionPane.showInputDialog("nif del entrenador");
				nomPers=JOptionPane.showInputDialog("Nombre,apellido del entrenador");
				fNacPers=JOptionPane.showInputDialog("Fecha de nacimiento del entrenador");
				nomEqEntr=JOptionPane.showInputDialog("Nombre del equipo de entrenador");				
				if (Equipo.listaEquipos.get(nomEqEntr) == null)
					JOptionPane.showMessageDialog(null, "Este equipo no existe");
				else
					nuevoEntr = new Entrenador(nifPers, nomPers, fNacPers, nomEqEntr);
			}
		});
		GridBagConstraints gbc_btnVerEquiposDe=new GridBagConstraints();
		gbc_btnVerEquiposDe.fill=GridBagConstraints.HORIZONTAL;
		gbc_btnVerEquiposDe.insets=new Insets(0,0,5,5);
		gbc_btnVerEquiposDe.gridx=1;
		gbc_btnVerEquiposDe.gridy=0;
		contentPane.add(btnVerEquiposDe,gbc_btnVerEquiposDe);
		GridBagConstraints gbc_btnAadirJugadorAl_1=new GridBagConstraints();
		gbc_btnAadirJugadorAl_1.fill=GridBagConstraints.HORIZONTAL;
		gbc_btnAadirJugadorAl_1.insets=new Insets(0,0,5,0);
		gbc_btnAadirJugadorAl_1.gridx=2;
		gbc_btnAadirJugadorAl_1.gridy=0;
		contentPane.add(btnAadirJugadorAl_1,gbc_btnAadirJugadorAl_1);
		JButton btnAadirJugadorAl=new JButton("Nuevo arbitro");
		btnAadirJugadorAl.addActionListener(new ActionListener(){

			public void actionPerformed(ActionEvent e){
				nifPers=JOptionPane.showInputDialog("nif del arbitro");
				nomPers=JOptionPane.showInputDialog("Nombre,apellido del arbitro");
				fNacPers=JOptionPane.showInputDialog("Fecha de nacimiento del arbitro");
				catArb=JOptionPane.showInputDialog("Categoria del arbitro");
				new Arbitro(nifPers,nomPers,fNacPers,catArb);
			}
		});
		JButton btnNewButton=new JButton("Crear nuevo jugador");
		btnNewButton.addActionListener(new ActionListener(){

			public void actionPerformed(ActionEvent arg0){
				nifPers=JOptionPane.showInputDialog("nif del jugador");
				nomPers=JOptionPane.showInputDialog("Nombre,apellido del jugador");
				fNacPers=JOptionPane.showInputDialog("Fecha de nacimiento del jugador");
				posJug=JOptionPane.showInputDialog("Posicion del jugador");
				nuevoJug=new Jugador(nifPers,nomPers,fNacPers,posJug);
			}
		});
		GridBagConstraints gbc_btnNewButton=new GridBagConstraints();
		gbc_btnNewButton.fill=GridBagConstraints.HORIZONTAL;
		gbc_btnNewButton.insets=new Insets(0,0,5,5);
		gbc_btnNewButton.gridx=0;
		gbc_btnNewButton.gridy=1;
		contentPane.add(btnNewButton,gbc_btnNewButton);
		GridBagConstraints gbc_btnAadirJugadorAl=new GridBagConstraints();
		gbc_btnAadirJugadorAl.fill=GridBagConstraints.HORIZONTAL;
		gbc_btnAadirJugadorAl.insets=new Insets(0,0,5,5);
		gbc_btnAadirJugadorAl.gridx=1;
		gbc_btnAadirJugadorAl.gridy=1;
		contentPane.add(btnAadirJugadorAl,gbc_btnAadirJugadorAl);
		JButton btnEntrenadorAlNuevo=new JButton("Cambiar de equipo(entr)");
		btnEntrenadorAlNuevo.addActionListener(new ActionListener(){

			public void actionPerformed(ActionEvent arg0){
				String nifEntr=JOptionPane.showInputDialog("nif del entrenador");
				String nomEqNuevo=JOptionPane.showInputDialog("A que equipo(nombre)");
				Equipo.cambiarEntr(nomEqNuevo,nifEntr);
			}
		});
		GridBagConstraints gbc_btnEntrenadorAlNuevo=new GridBagConstraints();
		gbc_btnEntrenadorAlNuevo.fill=GridBagConstraints.HORIZONTAL;
		gbc_btnEntrenadorAlNuevo.insets=new Insets(0,0,5,0);
		gbc_btnEntrenadorAlNuevo.gridx=2;
		gbc_btnEntrenadorAlNuevo.gridy=1;
		contentPane.add(btnEntrenadorAlNuevo,gbc_btnEntrenadorAlNuevo);
		JPanel panel=new JPanel();
		panel.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"),"Datos del jugador",
				TitledBorder.CENTER,TitledBorder.TOP,null,new Color(0,0,128)));
		GridBagConstraints gbc_panel=new GridBagConstraints();
		gbc_panel.fill=GridBagConstraints.BOTH;
		gbc_panel.gridheight=2;
		gbc_panel.insets=new Insets(0,0,0,5);
		gbc_panel.gridx=0;
		gbc_panel.gridy=2;
		contentPane.add(panel,gbc_panel);
		GridBagLayout gbl_panel=new GridBagLayout();
		gbl_panel.columnWidths=new int[]{0,0};
		gbl_panel.rowHeights=new int[]{0,0};
		gbl_panel.columnWeights=new double[]{1.0,Double.MIN_VALUE};
		gbl_panel.rowWeights=new double[]{1.0,Double.MIN_VALUE};
		panel.setLayout(gbl_panel);
		JScrollPane scrollPane=new JScrollPane();
		GridBagConstraints gbc_scrollPane=new GridBagConstraints();
		gbc_scrollPane.fill=GridBagConstraints.BOTH;
		gbc_scrollPane.gridx=0;
		gbc_scrollPane.gridy=0;
		panel.add(scrollPane,gbc_scrollPane);
		final JTextArea textArea=new JTextArea();
		scrollPane.setViewportView(textArea);
		JButton btnAadirEquipoA=new JButton("Consultar");
		scrollPane.setColumnHeaderView(btnAadirEquipoA);
		btnAadirEquipoA.addActionListener(new ActionListener(){

			public void actionPerformed(ActionEvent e){
				String nif=JOptionPane.showInputDialog("nif del jugador?");
				Object jug=Liga.listaJug.get(nif);
				if(Liga.listaJug.containsKey(nif))
					textArea.setText("Jugador: \n"+((Persona)jug).getInfo((Jugador)(jug))
							+", Posicion: "+((Jugador)Liga.listaJug.get(nif)).getPosicion((Jugador)jug)+"\n");
				else
					textArea.setText("No existe tal jugador");
				nuevoJug.getDatosJug((Jugador)jug);
			}
		});
		JPanel panel_1=new JPanel();
		panel_1.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"),"Datos de equipo",
				TitledBorder.CENTER,TitledBorder.TOP,null,new Color(0,0,128)));
		GridBagConstraints gbc_panel_1=new GridBagConstraints();
		gbc_panel_1.gridheight=2;
		gbc_panel_1.fill=GridBagConstraints.BOTH;
		gbc_panel_1.insets=new Insets(0,0,0,5);
		gbc_panel_1.gridx=1;
		gbc_panel_1.gridy=2;
		contentPane.add(panel_1,gbc_panel_1);
		GridBagLayout gbl_panel_1=new GridBagLayout();
		gbl_panel_1.columnWidths=new int[]{0,0};
		gbl_panel_1.rowHeights=new int[]{0,0};
		gbl_panel_1.columnWeights=new double[]{1.0,Double.MIN_VALUE};
		gbl_panel_1.rowWeights=new double[]{1.0,Double.MIN_VALUE};
		panel_1.setLayout(gbl_panel_1);
		JScrollPane scrollPane_1=new JScrollPane();
		GridBagConstraints gbc_scrollPane_1=new GridBagConstraints();
		gbc_scrollPane_1.fill=GridBagConstraints.BOTH;
		gbc_scrollPane_1.gridx=0;
		gbc_scrollPane_1.gridy=0;
		panel_1.add(scrollPane_1,gbc_scrollPane_1);
		final JTextArea textArea_1=new JTextArea();
		scrollPane_1.setViewportView(textArea_1);
		JButton btnDatosDeEquipo=new JButton("Consultar");
		scrollPane_1.setColumnHeaderView(btnDatosDeEquipo);
		JPanel panel_2=new JPanel();
		panel_2.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"),"Datos de la Liga",
				TitledBorder.CENTER,TitledBorder.TOP,null,new Color(0,0,128)));
		GridBagConstraints gbc_panel_2=new GridBagConstraints();
		gbc_panel_2.gridheight=2;
		gbc_panel_2.fill=GridBagConstraints.BOTH;
		gbc_panel_2.gridx=2;
		gbc_panel_2.gridy=2;
		contentPane.add(panel_2,gbc_panel_2);
		GridBagLayout gbl_panel_2=new GridBagLayout();
		gbl_panel_2.columnWidths=new int[]{0,0};
		gbl_panel_2.rowHeights=new int[]{0,0};
		gbl_panel_2.columnWeights=new double[]{1.0,Double.MIN_VALUE};
		gbl_panel_2.rowWeights=new double[]{1.0,Double.MIN_VALUE};
		panel_2.setLayout(gbl_panel_2);
		JScrollPane scrollPane_2=new JScrollPane();
		GridBagConstraints gbc_scrollPane_2=new GridBagConstraints();
		gbc_scrollPane_2.fill=GridBagConstraints.BOTH;
		gbc_scrollPane_2.gridx=0;
		gbc_scrollPane_2.gridy=0;
		panel_2.add(scrollPane_2,gbc_scrollPane_2);
		final JTextArea textArea_2=new JTextArea();
		scrollPane_2.setViewportView(textArea_2);
		JButton btnLiga=new JButton("Consultar");
		scrollPane_2.setColumnHeaderView(btnLiga);
		btnLiga.addActionListener(new ActionListener(){

			public void actionPerformed(ActionEvent e){
				textArea_2.setText(Liga.listarLiga());
			}
		});
		btnDatosDeEquipo.addActionListener(new ActionListener(){

			public void actionPerformed(ActionEvent e){
				String nom=JOptionPane.showInputDialog("Nombre de equipo?");
				try{
					textArea_1.setText(((Equipo)Equipo.listaEquipos.get(nom)).getDatosEq(nom));
				}catch(Exception error){
					JOptionPane
							.showMessageDialog(null,"Debes crear un equipo y añadir jugadores y un entrenador");
				}
			}
		});
	}
}
