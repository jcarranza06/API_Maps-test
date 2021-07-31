package maven_test;

import java.io.IOException;

import javax.swing.JOptionPane;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.maps.DirectionsApi;
import com.google.maps.ElevationApi;
import com.google.maps.GeoApiContext;
import com.google.maps.GeocodingApi;
import com.google.maps.errors.ApiException;
import com.google.maps.errors.ZeroResultsException;
import com.google.maps.model.DirectionsResult;
import com.google.maps.model.ElevationResult;
import com.google.maps.model.GeocodingResult;
import com.google.maps.model.LatLng;
import com.google.maps.model.TransitMode;
import com.google.maps.model.TravelMode;

public class App {
	static GeoApiContext context;
	
	public static void main(String[] args) throws ApiException, InterruptedException, IOException {
		// TODO Auto-generated method stub
		System.out.print("hola mundo");
		
		context = new GeoApiContext.Builder()
			    .apiKey("AIzaSyD0fXFekJMMuyeawlMBsjhZ4OH7ygbiRIE")
			    .build();
		Ventana ventana = new Ventana();
		ventana.setVisible(true);
		/*String i = "Turn \\u003cb\\u003eright\\u003c/b\\u003e onto \\u003cb\\u003eCr";
		System.out.println(i);
		System.out.println(i.replace("\\u003cb", "").replace("\\u003e", "").replace("\\u003c/b", ""));*/
	}
	
	public static void buscar(String busqueda) {
		GeocodingResult[] results;
		try {
			results = GeocodingApi.geocode(context,
					busqueda).await();
			Gson gson = new GsonBuilder().setPrettyPrinting().create();
			System.out.println(gson.toJson(results[0]));
			Panel.setText(results[0].formattedAddress,0);
			//Ventana.setText(results[0].addressComponents[results[0].addressComponents.length-1].longName,1);
			Panel.setText(String.valueOf(getAlturaInfo(results[0].geometry.location).elevation), 1);
			Panel.setText(String.valueOf(results[0].geometry.location.lat),2);
			Panel.setText(String.valueOf(results[0].geometry.location.lng),3);
			
			for (int i =0; i<results[0].addressComponents.length;i++) {
				String type = String.valueOf(results[0].addressComponents[i].types[0]);
				String data = results[0].addressComponents[i].longName;
				Panel.setTexto(type+": "+data, i);
				type="";
				data="";
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
			
	}
	
	public static void buscar1(String origen, String destino,int seleccion) {
		DirectionsResult results;
		TravelMode modo = TravelMode.DRIVING;
		if (seleccion ==0) {
			modo = TravelMode.DRIVING;
		}else if (seleccion ==1) {
			modo = TravelMode.WALKING;
		}else if (seleccion ==2) {
			modo = TravelMode.BICYCLING;
		}
		
		try {
			results = DirectionsApi.getDirections(context, origen,destino).mode(modo).language("es").await();
			Gson gson = new GsonBuilder().setPrettyPrinting().create();
			System.out.println(gson.toJson(results));
			String pasos="";
			for (int i=0;i<results.routes[0].legs[0].steps.length;i++) {
				pasos += limpiarHTML(results.routes[0].legs[0].steps[i].htmlInstructions)
									+" (Distancia:"+results.routes[0].legs[0].steps[i].distance.humanReadable+", tiempo:"
									+results.routes[0].legs[0].steps[i].duration.humanReadable+
									") "+"  <br>";
			}
			Panel1.setTexto("<html><body>"+pasos+"</body></html>");
			System.out.println(pasos);
			Panel1.setTexto("Distancia: "+results.routes[0].legs[0].distance.humanReadable,0);
			Panel1.setTexto("Duracion " +results.routes[0].legs[0].duration.humanReadable,1);
			Panel1.setTexto("Modalidad: "+String.valueOf(results.routes[0].legs[0].steps[0].travelMode),2);
			Panel1.setTexto("Origen: " +results.routes[0].legs[0].startAddress,3);
			Panel1.setTexto("Destino: " +results.routes[0].legs[0].endAddress,4);
	
			ElevationResult infoAlturaOrigen = getAlturaInfo(results.routes[0].legs[0].startLocation);
			ElevationResult infoAlturaDestino = getAlturaInfo(results.routes[0].legs[0].endLocation);
			System.out.println(gson.toJson(infoAlturaOrigen));
			Panel1.setTexto("Altura Origen: "+String.valueOf(infoAlturaOrigen.elevation).substring(0, 8) + " metros",5);
			Panel1.setTexto("Altura Destino: "+String.valueOf(infoAlturaDestino.elevation).substring(0, 8)+" metros",6);
			Panel1.setTexto("Pendiente Promedio: "+String.valueOf(((infoAlturaDestino.elevation - infoAlturaOrigen.elevation)/results.routes[0].legs[0].distance.inMeters)*100).substring(0, 4)+"%",7);
			
		}catch (Exception e) {
			e.printStackTrace();
			JOptionPane.showMessageDialog(null,"No se encontraron resultados");
		}
		
	}
	public static String limpiarHTML(String a) {
		a=a.replaceAll("\\<.*?\\>", "");
		return a.replace("\\u003cb", "").replace("\\u003e", "").replace("\\u003c/b", "");
	}
	public static ElevationResult getAlturaInfo(LatLng a) {
		try {
			return ElevationApi.getByPoint(context,a).await();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return new ElevationResult();
		} 
	}

}
