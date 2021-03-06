package maven_test;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

public class Panel1 {
	
	private JTextField origen;
	private JTextField destino;
	static JPanel panel1;
	static JLabel texto;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	static JLabel duracion;
	static JLabel distancia;
	static JLabel modalidad;
	static JLabel origenInterpretado;
	static JLabel destinoInterpretado;
	static JLabel alturaOrigen;
	static JLabel alturaDestino;
	static JLabel pendientePromedio;
	
	public Panel1 (JPanel panelBase) {
		panel1 = new JPanel();
		panel1.setForeground(Color.WHITE);
		panel1.setBounds(5, 50, 574, 415);
		panelBase.add(panel1);
		panel1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Origen");
		lblNewLabel.setBounds(21, 11, 46, 14);
		panel1.add(lblNewLabel);
		
		origen = new JTextField();
		origen.setBounds(78, 11, 220, 20);
		panel1.add(origen);
		origen.setColumns(10);
		panel1.setVisible(true);
		
		JLabel lblNewLabele = new JLabel("Destino");
		lblNewLabele.setBounds(21, 36, 46, 14);
		panel1.add(lblNewLabele);
		
		destino = new JTextField();
		destino.setBounds(78, 36, 220, 20);
		panel1.add(destino);
		destino.setColumns(10);
		panel1.setOpaque(false);
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(21, 89, 450, 150);
		panel1.add(scrollPane);
		
		texto = new JLabel();
		texto.setBounds(21, 89, 450, 150);
		//panel1.add(texto);
		scrollPane.setViewportView(texto);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Carro");
		buttonGroup.add(rdbtnNewRadioButton);
		rdbtnNewRadioButton.setBounds(318, 1, 109, 23);
		panel1.add(rdbtnNewRadioButton);
		rdbtnNewRadioButton.setOpaque(false);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("A pie");
		buttonGroup.add(rdbtnNewRadioButton_1);
		rdbtnNewRadioButton_1.setBounds(318, 27, 109, 23);
		panel1.add(rdbtnNewRadioButton_1);
		rdbtnNewRadioButton_1.setOpaque(false);
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("Bicicleta");
		buttonGroup.add(rdbtnNewRadioButton_2);
		rdbtnNewRadioButton_2.setBounds(318, 53, 109, 23);
		panel1.add(rdbtnNewRadioButton_2);
		rdbtnNewRadioButton_2.setOpaque(false);
		
		JButton buscar2 = new JButton("Buscar");
		buscar2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				//texto.setText("<html>Dir??gete hacia el oeste  <br>Gira a la izquierda.  <br>Gira a la derecha  <br>Gira ligeramente a la derecha hacia Via a La Gorda  <br>Contin??a por V??a La Reforma  <br>Contin??a por V??a La Luisa  <br>Gira a la derecha hacia Cl. 13 Oe.  <br>Contin??a por Cra. 56  <br>En la rotonda, toma la segunda salida en direcci??n Av. Circunvalar/Av. de los Cerros  <br>En la rotonda, toma la segunda salida y contin??a por Av. Circunvalar/Av. de los CerrosContin??a hacia Av. de los Cerros  <br>Av. de los Cerros contin??a hacia la derecha hasta Av. Circunvalar  <br>Contin??a por Cra. 4  <br>Cra. 4 gira a la izquierda hasta Cl. 2a  <br>Gira ligeramente a la derecha hacia Av. Colombia  <br>Gira ligeramente a la izquierda para continuar en Av. Colombia  <br>Contin??a recto por Av. Colombia  <br>Contin??a por Av. Uribe Uribe  <br>Contin??a recto hacia Cra. 1/Av. Uribe UribeContin??a hacia Cra. 1  <br>En la rotonda, toma la segunda salida y contin??a por Cra. 1  <br>Mantente a la izquierda para permanecer en Cra. 1  <br>Cra. 1 contin??a hacia la izquierda hasta V??a Cali PalmiraCarretera con peajes  <br>Contin??a por Cali - Palmira/Carretera 25Carretera con peajes  <br>Toma la salida hacia Rozo/Yumbo  <br>Contin??a por Rozo-Palmira  <br>Contin??a recto por Rozo-Palmira  <br>Contin??a por El Cerrito-Rozo Sur  <br>En la rotonda, toma la primera salida y contin??a por El Cerrito-Rozo Sur  <br>Mantente a la izquierda en la bifurcaci??n, sigue las se??ales de Buga/Tulu?? y pasa a Guacar??-El Cerrito/Carretera 25Carretera con peajes  <br>Contin??a por Buga - Guacar??/Ginebra-Guacar??Contin??a hacia Buga - Guacar??  <br>En la rotonda, toma la segunda salida en direcci??n Carretera 25  <br>Contin??a por Cra. 24/Tulua - CaliContin??a hacia Tulua - CaliCarretera con peajes  <br>Contin??a por Andaluc??a-Tulu??/Bugalagrande - TuluaContin??a hacia Bugalagrande - Tulua  <br>Contin??a por Andaluc??a - Bugalagrande Road/Tulua - Cartago/Carretera 25Contin??a hacia Tulua - CartagoCarretera con peajes  <br>Contin??a recto hacia La Paila-Uribe/Tulua - Cartago/Carretera 25Contin??a hacia Tulua - Cartago/Carretera 25Carretera con peajes  <br>Mantente a la derecha para continuar por Tulua - Cartago/V??a Principal Zarzal/Zarzal-La Paila/Carretera 25  <br>En la rotonda, toma la primera salida en direcci??n Carretera 25  <br>En la rotonda, toma la segunda salida y contin??a por Carretera 25  <br>En la rotonda, toma la segunda salida y contin??a por Carretera 25Carretera con peajes  <br>Mantente a la izquierda para continuar por Carretera 29RS  <br>Contin??a por Av. 30 de Agosto  <br>Toma el ramal en direcci??n Variante Romelia El Pollo  <br>Mantente a la izquierda y sigue las se??ales de Manizales.  <br>En la rotonda, toma la tercera salida en direcci??n Variante Romelia El Pollo  <br>Contin??a por Carretera 29RSC  <br>Toma el ramal en direcci??n Manizales/Medell??n  <br>Incorp??rate a Cra. 10/Carretera 29  <br>Incorp??rate a Cra. 16/Pereira-Manizales/Av. Sim??n Bolivar  <br>En la rotonda, toma la primera salida en direcci??n Dosquebradas-Santa Rosa De Cabal/Pereira-Manizales/Carretera 29/Carretera 29RSEContin??a hacia Pereira-Manizales  <br>Mantente a la izquierda para continuar por Carretera 29RSCCarretera con peajes  <br>Gira ligeramente a la izquierda hacia Chinchin??-La Manuela/V??a Manizales-Chinchina/Carretera 29CL  <br>Gira ligeramente a la derecha hacia V??a Manizales-Chinchina/Carretera 29CLCarretera con peajes  <br>Contin??a por Manizales-La Felisa/Carretera 50Contin??a hacia Carretera 50  <br>Contin??a recto por Carretera 50  <br>Mantente a la izquierda para continuar por V??a Panamericana, sigue las se??ales de Bogota  <br>En la rotonda, toma la primera salida y contin??a por V??a Panamericana  <br>Contin??a recto hacia Letras-Manizales/V??a PanamericanaContin??a hacia Letras-Manizales  <br>Contin??a por Padua-Letras  <br>Gira a la izquierda hacia Fresno-Padua/Via Principal PaduaContin??a hacia Fresno-Padua  <br>Contin??a por Via Principal Fresno  <br>Contin??a por Cl. 2  <br>Contin??a por Cra. 9/Mariquita-FresnoContin??a hacia Mariquita-Fresno  <br>Contin??a por Cl. 7  <br>Gira a la izquierda para continuar por Cl. 7  <br>Contin??a por Mariquita-Honda/Via Principal MariquitaContin??a hacia Mariquita-HondaCarretera con peajes  <br>Contin??a por Honda-Guarinocito/Puente Honda/Carretera 45  <br>Honda-Guarinocito/Carretera 45 gira a la derecha hasta Honda-Guarinocito/Carretera 45Contin??a hacia Carretera 45  <br>Contin??a por</html>");
				//App.buscar(textField.getText());
				int seleccion=0;
				if (rdbtnNewRadioButton.isSelected()) {
					seleccion=0;
				}else if(rdbtnNewRadioButton_1.isSelected()) {
					seleccion=1;
				}else if( rdbtnNewRadioButton_2.isSelected()) {
					seleccion=2;
				}
				App.buscar1(origen.getText(), destino.getText(),seleccion);
			}
		});
		buscar2.setBounds(21, 61, 89, 23);
		panel1.add(buscar2);
		
		duracion = new JLabel("Duracion");
		duracion.setBounds(21, 264, 279, 14);
		panel1.add(duracion);
		
		distancia = new JLabel("Distancia");
		distancia.setBounds(21, 289, 279, 14);
		panel1.add(distancia);
		
		modalidad = new JLabel("Modalidad");
		modalidad.setBounds(21, 314, 279, 14);
		panel1.add(modalidad);
		
		origenInterpretado = new JLabel("Origen");
		origenInterpretado.setBounds(21, 339, 570, 14);
		panel1.add(origenInterpretado);
		
		destinoInterpretado = new JLabel("Destino");
		destinoInterpretado.setBounds(21, 364, 570, 14);
		panel1.add(destinoInterpretado);
		
		alturaOrigen = new JLabel("Altura Origen");
		alturaOrigen.setBounds(300, 264, 270, 14);
		panel1.add(alturaOrigen);
		
		alturaDestino = new JLabel("Altura Destino");
		alturaDestino.setBounds(300, 289, 270, 14);
		panel1.add(alturaDestino);
		
		pendientePromedio = new JLabel("Pendiente Promedio");
		pendientePromedio.setBounds(300, 314, 270, 14);
		panel1.add(pendientePromedio);
	}
	
	public static void setVisible(boolean flag) {
		panel1.setVisible(flag);
	}
	public static void setTexto(String text) {
		texto.setText(text);
	}
	public static void setTexto(String text, int i) {
		if (i==0) {
			duracion.setText(text);
		}else if(i==1) {
			distancia.setText(text);
		}else if(i==2) {
			modalidad.setText(text);
		}else if(i==3) {
			origenInterpretado.setText(text);
		}else if(i==4) {
			destinoInterpretado.setText(text);
		}else if(i==5) {
			alturaOrigen.setText(text);
		}else if(i==6) {
			alturaDestino.setText(text);
		}else if(i==7) {
			pendientePromedio.setText(text);
		}
		
	}
}
