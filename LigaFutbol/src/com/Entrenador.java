package com;

import java.util.HashMap;

public class Entrenador extends Persona
{

	protected static HashMap<String,Object> listaEntrenadores=new HashMap<String,Object>();//clave=nomEquipo
	protected String nomEquipo;

	public Entrenador(String nif,String nom,String f,String nomEquipo){
		super(nif,nom,f);
		this.nomEquipo=nomEquipo;
		listaEntrenadores.put(nomEquipo,this);
		Liga.entrenadores.add(this);
	}

	public String getInfoEnt(Entrenador ent){
		return getInfo(ent);
	}
}
