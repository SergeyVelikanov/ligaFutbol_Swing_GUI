package com;

public class Jugador extends Persona
{

	
	private String posicion;

	public Jugador(String nif,String nom,String f,String posicion){
		super(nif,nom,f);
		this.posicion=posicion;
		Liga.listaJug.put(nif,this);
	}

	public String getDatosJug(Jugador jug){
		return super.getInfo(jug)+", Posicion: "+getPosicion(jug);
	}

	public String getPosicion(Jugador jug){
		return jug.posicion;
	}

	public void setPosicion(Jugador jug,String pos){
		jug.posicion=pos;
	}
}
