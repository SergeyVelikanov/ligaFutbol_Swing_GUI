package com;

public class Partido
{
	private String fecha;

	public Partido(Equipo loc,Equipo vis){
		throw new UnsupportedOperationException("not implemented");
	}

	@SuppressWarnings("unused")
	private void setFecha(String value){
		this.fecha=value;
	}

	@SuppressWarnings("unused")
	private String getFecha(){
		return this.fecha;
	}
	private int golLocal;

	@SuppressWarnings("unused")
	private void setGolLocal(int value){
		this.golLocal=value;
	}

	@SuppressWarnings("unused")
	private int getGolLocal(){
		return this.golLocal;
	}
	private int golVis;

	@SuppressWarnings("unused")
	private void setGolVis(int value){
		this.golVis=value;
	}

	@SuppressWarnings("unused")
	private int getGolVis(){
		return this.golVis;
	}
}
