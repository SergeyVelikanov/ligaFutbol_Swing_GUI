package com;

public class Arbitro extends Persona
{

	protected String categoria;

	public Arbitro(String nif,String nom,String f,String cat){
		super(nif,nom,f);
		this.categoria=cat;
		Liga.arbitros.add(this);
	}

	public String getCat(){
		return this.categoria;
	}

	public void setCat(String cat){
		this.categoria=cat;
	}
}
