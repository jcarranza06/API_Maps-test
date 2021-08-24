package maven_test;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Panel {
	
	private JTextField textField;
	static JLabel formatted_Address;
	static JLabel codigoPostal;
	static JLabel latitud;
	static JLabel longitud;
	static JLabel a;
	static JLabel a1;
	static JLabel a2;
	static JLabel a3;
	static JLabel a4;
	static JLabel a5;
	static JLabel a6;
	static JLabel a7;
	static JPanel panel;
	
	public Panel(JPanel panelBase){
		panel = new JPanel();
		panel.setForeground(Color.RED);
		panel.setBounds(5, 50, 574, 415);
		Ventana.panelBase.add(panel);
		panel.setLayout(null);
		panel.setOpaque(false);
		textField = new JTextField();
		textField.setBounds(21, 11, 220, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		formatted_Address = new JLabel();
		formatted_Address.setBounds(21, 76, 520, 14);
		panel.add(formatted_Address);
		
		JButton btnNewButton = new JButton("Buscar");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				//setText(textField.getText());
				App.buscar(textField.getText());
			}
		});
		btnNewButton.setBounds(21, 42, 89, 23);
		panel.add(btnNewButton);
		
		codigoPostal = new JLabel();
		codigoPostal.setBounds(21, 101, 520, 14);
		panel.add(codigoPostal);
		
		latitud = new JLabel();
		latitud.setBounds(21, 126, 520, 14);
		panel.add(latitud);
		
		longitud = new JLabel();
		longitud.setBounds(21, 151, 520, 14);
		panel.add(longitud);
		
		a = new JLabel();
		a.setBounds(21, 176, 520, 14);
		panel.add(a);
		
		a1 = new JLabel();
		a1.setBounds(21, 201, 520, 14);
		panel.add(a1);
		
		a2 = new JLabel();
		a2.setBounds(21, 226, 520, 14);
		panel.add(a2);
		
		a3 = new JLabel();
		a3.setBounds(21, 251, 520, 14);
		panel.add(a3);
		
		a4 = new JLabel();
		a4.setBounds(21, 276, 520, 14);
		panel.add(a4);
		
		a5 = new JLabel();
		a5.setBounds(21, 301, 520, 14);
		panel.add(a5);
		
		a6 = new JLabel();
		a6.setBounds(21, 326, 520, 14);
		panel.add(a6);
		
		a7 = new JLabel();
		a7.setBounds(21, 351, 520, 14);
		panel.add(a7);
	}
	public static void setVisible(boolean flag) {
		panel.setVisible(flag);
	}
	public static void setText(String text, int i) {
		switch(i) {
			case 0:
				formatted_Address.setText(text);
			case 1:
				codigoPostal.setText("altitud: "+text);
			case 2:
				latitud.setText("Latitud: "+text);
			case 3:
				longitud.setText("Longitud: " +text);
		}
	}
	public static void setTexto(String text, int i) {
		
		if (i ==0) {
			a.setText(text);
		}else if(i==1) {
			a1.setText(text);
		}else if(i==2) {
			a2.setText(text);
		}else if(i==3) {
			a3.setText(text);
		}else if(i==4) {
			a4.setText(text);
		}else if(i==5) {
			a5.setText(text);
		}else if(i==6) {
			a6.setText(text);
		}else if(i==7) {
			a7.setText(text);
		}
		
	}
}
