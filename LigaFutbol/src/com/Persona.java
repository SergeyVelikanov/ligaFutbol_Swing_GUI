package com;
public class Persona
{

	protected String fechaNac;
	protected String nif;
	protected String nomCompl;

	public Persona(String nif,String nom,String f){
		this.nif=nif;
		this.nomCompl=nom;
		this.fechaNac=f;
	}

	public String getFechaNac(Persona p){
		return p.fechaNac;
	}

	public String getNif(Persona p){
		return p.nif;
	}

	public String getNomCompl(Persona p){
		return p.nomCompl;
	}

	public void setFechaNac(Persona p,String fecha){
		p.fechaNac=fecha;
	}

	public void setNif(Persona p,String nif){
		p.nif=nif;
	}

	public void setNomCompl(Persona p,String nomCompl){
		p.nomCompl=nomCompl;
	}

	public String getInfo(Persona p){
		return "NIF: "+p.nif+", Nombre, Apellido: "+p.nomCompl
				+", Fecha de nacimiento: "+p.fechaNac;
	}
}
