package com;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class Liga
{

	protected static HashSet<Object> equipos=new HashSet<Object>();
	protected static HashMap<String,Object> listaJug=new HashMap<String,Object>();
	protected static HashSet<Object> entrenadores=new HashSet<Object>();
	protected static HashSet<Object> arbitros=new HashSet<Object>();

	/*
	 * mostrar los datos de liga
	 */
	public static String listarLiga(){
		Entrenador entr;
		Arbitro arb;
		Equipo eq;
		String info="Equipos de liga:"+"\n";
		Iterator<Object> itr1=equipos.iterator();
		while(itr1.hasNext()){
			eq=(Equipo)itr1.next();
			info+="\n"+(eq.getDatosEq(eq.nombre))+"\n";
		}
		info+="\n"+"Entrenadores de la liga:"+"\n";
		Iterator<Object> itr2=entrenadores.iterator();
		while(itr2.hasNext()){
			entr=(Entrenador)itr2.next();
			info+=(entr.getInfoEnt(entr))+"\n";
		}
		info+="\n"+"Arbitros de liga:"+"\n";
		Iterator<Object> itr3=arbitros.iterator();
		while(itr3.hasNext()){
			arb=(Arbitro)itr3.next();
			info+=(arb.getInfo(arb)+"Categoria: "+arb.categoria)+"\n";
		}
		return info;
	}
}
