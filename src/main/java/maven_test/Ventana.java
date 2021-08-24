package maven_test;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.Box;
import javax.swing.ImageIcon;

import java.awt.Component;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Color;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.JScrollPane;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;

public class Ventana extends JFrame {

	private JPanel contentPane;
	static JPanel panelBase;
	private JLabel lblNewLabel;
	
	public Ventana() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 509);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		iniciarComponentes();
		
	}
	public void iniciarComponentes() {
		contentPane.setLayout(null);
		
		panelBase =new JPanel();
		panelBase.setLayout(null);
		panelBase.setBounds(0,0,600,509);
		contentPane.add(panelBase);
		
		ImageIcon fondo = new ImageIcon("fondoMaps.png");
		
		Panel panel =new Panel(panelBase);
		panel.setVisible(true);
		
		Panel1 panel1=new Panel1(panelBase);
		
		JButton btnNewButton_1 = new JButton("cambiar");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (Panel.panel.isVisible()==true) {
					Panel.panel.setVisible(false);
					Panel1.setVisible(true);
				}else {
					Panel.panel.setVisible(true);
					Panel1.setVisible(false);
				}
			}
		});
		btnNewButton_1.setBounds(24, 11, 89, 23);
		panelBase.add(btnNewButton_1);
		ImageIcon fondo1 = new ImageIcon("C:\\Users\\juane\\eclipse-workspace\\maven_test\\src\\main\\java\\maven_test\\fondoMaps.png");
		lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(fondo1.getImage().getScaledInstance(600, 509, Image.SCALE_SMOOTH)));
		lblNewLabel.setBounds(0, 0, 590, 498);
		panelBase.add(lblNewLabel);
		
		
		
	}
}
