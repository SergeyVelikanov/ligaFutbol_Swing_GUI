package com;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Equipo
{

	protected String ciudad;
	protected String nombre;
	protected Entrenador ent;
	protected static HashMap<String,Object> listaEquipos=new HashMap<String,Object>();//todos los equipos, clave nombre equipo
	protected HashMap<String,Object> jugadoresEquipo; //Clave=nif del jugador+nombre equipo/valor=datos jugador

	public Equipo(String nombre,String ciudad){
		jugadoresEquipo=new HashMap<String,Object>();
		this.nombre=nombre;
		this.ciudad=ciudad;
		listaEquipos.put(this.nombre,this);
		Liga.equipos.add(this);
	}

	/*
	 * añadir judador si el equipo y jugador existen 
	 */
	public void addJugador(Equipo eq,String nomEq,String nif){
		Equipo equipo;
		Set<Map.Entry<String,Object>> set=Equipo.listaEquipos.entrySet();
		if(Liga.listaJug.containsKey(nif)&&listaEquipos.containsKey(nomEq)){
			for(Map.Entry<String,Object> borra:set){
				equipo=(Equipo)borra.getValue();
				if(equipo.jugadoresEquipo.containsKey(nif))
					equipo.jugadoresEquipo.remove(nif);
			}
			eq.jugadoresEquipo.put(nif,Liga.listaJug.get(nif));
		}
	}

	/*
	 * cambiar entrenador de equipo cambiando la clave en Map(clave = equipo)
	 */
	public static void cambiarEntr(String nomEq,String nifEntr){
		Set<Map.Entry<String,Object>> set=Entrenador.listaEntrenadores.entrySet();
		String clave=null;
		Entrenador entr=null;
		for(Map.Entry<String,Object> borra:set){
			clave=borra.getKey();
			entr=(Entrenador)Entrenador.listaEntrenadores.get(clave);
			if(entr.getInfo(entr).contains(nifEntr)){
				Entrenador.listaEntrenadores.remove(clave);
				Entrenador.listaEntrenadores.put(nomEq,entr);
				break;
			}
		}
	}

	/*
	 * mostrar datos del equipo
	 */
	public String getDatosEq(String nom){
		Equipo eq=(Equipo)Equipo.listaEquipos.get(nom);
		Set<Map.Entry<String,Object>> set=eq.jugadoresEquipo.entrySet();
		String datEquipo=" Jugadores del equipo: "+"\n";
		Entrenador entr=null;
		if(listaEquipos.containsKey(nom)){
			for(Map.Entry<String,Object> me:set){
				datEquipo+=((Jugador)me.getValue()).getDatosJug((Jugador)me
						.getValue())+"\n";
			}
		}
		if(Entrenador.listaEntrenadores.containsKey(nom)){
			entr=(Entrenador)Entrenador.listaEntrenadores.get(nom);
			return(toString((Equipo)listaEquipos.get(nom))+"\n"+datEquipo
					+"Entrenador del equipo: \n"
					+entr.getInfo((Persona)Entrenador.listaEntrenadores
					.get(nom)));
		}else
			return(toString((Equipo)listaEquipos.get(nom))+"\n"+datEquipo+"\n"
			+"Este equipo no tiene entrenador");
	}

	public String toString(Equipo eq){
		String str="Ciudad: "+eq.ciudad+", Nombre de equipo: "+eq.nombre;
		return str;
	}

	public String getCiudad(){
		return this.ciudad;
	}

	public String getNombre(Equipo eq){
		return this.nombre;
	}

	public void setCiudad(String value){
		this.ciudad=value;
	}

	public void setNombre(String value){
		this.nombre=value;
	}
}
