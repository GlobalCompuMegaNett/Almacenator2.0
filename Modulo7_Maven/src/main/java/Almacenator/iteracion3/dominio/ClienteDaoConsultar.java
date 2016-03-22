package Almacenator.iteracion3.dominio;

import Almacenator.iteracion2.dominio.*;
import java.io.IOException;

import Almacenator.iteracion2.persistencia.Agente;



public class ClienteDaoConsultar {

	
	public static String BuscarCliente(String nombre) throws IOException {
		Object o = null;
		o=Agente.BuscarCliente(nombre);
		System.out.println(o.toString());

		Cliente c=(Cliente)o;
		String texto=c.toString();
		System.out.println(texto);
		return texto;
	}
}


