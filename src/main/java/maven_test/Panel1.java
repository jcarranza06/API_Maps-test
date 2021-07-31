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
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("A pie");
		buttonGroup.add(rdbtnNewRadioButton_1);
		rdbtnNewRadioButton_1.setBounds(318, 27, 109, 23);
		panel1.add(rdbtnNewRadioButton_1);
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("Bicicleta");
		buttonGroup.add(rdbtnNewRadioButton_2);
		rdbtnNewRadioButton_2.setBounds(318, 53, 109, 23);
		panel1.add(rdbtnNewRadioButton_2);
		
		JButton buscar2 = new JButton("Buscar");
		buscar2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				//texto.setText("<html>Dirígete hacia el oeste  <br>Gira a la izquierda.  <br>Gira a la derecha  <br>Gira ligeramente a la derecha hacia Via a La Gorda  <br>Continúa por Vía La Reforma  <br>Continúa por Vía La Luisa  <br>Gira a la derecha hacia Cl. 13 Oe.  <br>Continúa por Cra. 56  <br>En la rotonda, toma la segunda salida en dirección Av. Circunvalar/Av. de los Cerros  <br>En la rotonda, toma la segunda salida y continúa por Av. Circunvalar/Av. de los CerrosContinúa hacia Av. de los Cerros  <br>Av. de los Cerros continúa hacia la derecha hasta Av. Circunvalar  <br>Continúa por Cra. 4  <br>Cra. 4 gira a la izquierda hasta Cl. 2a  <br>Gira ligeramente a la derecha hacia Av. Colombia  <br>Gira ligeramente a la izquierda para continuar en Av. Colombia  <br>Continúa recto por Av. Colombia  <br>Continúa por Av. Uribe Uribe  <br>Continúa recto hacia Cra. 1/Av. Uribe UribeContinúa hacia Cra. 1  <br>En la rotonda, toma la segunda salida y continúa por Cra. 1  <br>Mantente a la izquierda para permanecer en Cra. 1  <br>Cra. 1 continúa hacia la izquierda hasta Vía Cali PalmiraCarretera con peajes  <br>Continúa por Cali - Palmira/Carretera 25Carretera con peajes  <br>Toma la salida hacia Rozo/Yumbo  <br>Continúa por Rozo-Palmira  <br>Continúa recto por Rozo-Palmira  <br>Continúa por El Cerrito-Rozo Sur  <br>En la rotonda, toma la primera salida y continúa por El Cerrito-Rozo Sur  <br>Mantente a la izquierda en la bifurcación, sigue las señales de Buga/Tuluá y pasa a Guacarí-El Cerrito/Carretera 25Carretera con peajes  <br>Continúa por Buga - Guacarí/Ginebra-GuacaríContinúa hacia Buga - Guacarí  <br>En la rotonda, toma la segunda salida en dirección Carretera 25  <br>Continúa por Cra. 24/Tulua - CaliContinúa hacia Tulua - CaliCarretera con peajes  <br>Continúa por Andalucía-Tuluá/Bugalagrande - TuluaContinúa hacia Bugalagrande - Tulua  <br>Continúa por Andalucía - Bugalagrande Road/Tulua - Cartago/Carretera 25Continúa hacia Tulua - CartagoCarretera con peajes  <br>Continúa recto hacia La Paila-Uribe/Tulua - Cartago/Carretera 25Continúa hacia Tulua - Cartago/Carretera 25Carretera con peajes  <br>Mantente a la derecha para continuar por Tulua - Cartago/Vía Principal Zarzal/Zarzal-La Paila/Carretera 25  <br>En la rotonda, toma la primera salida en dirección Carretera 25  <br>En la rotonda, toma la segunda salida y continúa por Carretera 25  <br>En la rotonda, toma la segunda salida y continúa por Carretera 25Carretera con peajes  <br>Mantente a la izquierda para continuar por Carretera 29RS  <br>Continúa por Av. 30 de Agosto  <br>Toma el ramal en dirección Variante Romelia El Pollo  <br>Mantente a la izquierda y sigue las señales de Manizales.  <br>En la rotonda, toma la tercera salida en dirección Variante Romelia El Pollo  <br>Continúa por Carretera 29RSC  <br>Toma el ramal en dirección Manizales/Medellín  <br>Incorpórate a Cra. 10/Carretera 29  <br>Incorpórate a Cra. 16/Pereira-Manizales/Av. Simón Bolivar  <br>En la rotonda, toma la primera salida en dirección Dosquebradas-Santa Rosa De Cabal/Pereira-Manizales/Carretera 29/Carretera 29RSEContinúa hacia Pereira-Manizales  <br>Mantente a la izquierda para continuar por Carretera 29RSCCarretera con peajes  <br>Gira ligeramente a la izquierda hacia Chinchiná-La Manuela/Vía Manizales-Chinchina/Carretera 29CL  <br>Gira ligeramente a la derecha hacia Vía Manizales-Chinchina/Carretera 29CLCarretera con peajes  <br>Continúa por Manizales-La Felisa/Carretera 50Continúa hacia Carretera 50  <br>Continúa recto por Carretera 50  <br>Mantente a la izquierda para continuar por Vía Panamericana, sigue las señales de Bogota  <br>En la rotonda, toma la primera salida y continúa por Vía Panamericana  <br>Continúa recto hacia Letras-Manizales/Vía PanamericanaContinúa hacia Letras-Manizales  <br>Continúa por Padua-Letras  <br>Gira a la izquierda hacia Fresno-Padua/Via Principal PaduaContinúa hacia Fresno-Padua  <br>Continúa por Via Principal Fresno  <br>Continúa por Cl. 2  <br>Continúa por Cra. 9/Mariquita-FresnoContinúa hacia Mariquita-Fresno  <br>Continúa por Cl. 7  <br>Gira a la izquierda para continuar por Cl. 7  <br>Continúa por Mariquita-Honda/Via Principal MariquitaContinúa hacia Mariquita-HondaCarretera con peajes  <br>Continúa por Honda-Guarinocito/Puente Honda/Carretera 45  <br>Honda-Guarinocito/Carretera 45 gira a la derecha hasta Honda-Guarinocito/Carretera 45Continúa hacia Carretera 45  <br>Continúa por</html>");
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
