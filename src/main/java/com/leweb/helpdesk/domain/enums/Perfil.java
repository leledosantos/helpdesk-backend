package com.leweb.helpdesk.domain.enums;

public enum Perfil {
	ADMIN(0,"HOLE_ADMIN"), 
	CLIENTE(1,"HOLE_CLIENTE"), 
	TECNICO(2,"HOLE_TECNICO");
	
	private Integer codigo;
	private String descricao;
		
	private Perfil(Integer codigo, String descricao) {
		this.codigo = codigo;
		this.descricao = descricao;
	}
	public Integer getCodigo() {
		return codigo;
	}
	public String getDescricao() {
		return descricao;
	}
	
	public static Perfil toEnum(Integer codigo) {
		if(codigo.equals(null)) {
			return null;
		}
		for(Perfil perfil : Perfil.values()) {
			if(codigo.equals(perfil.getCodigo()))
				return perfil;
		}
		throw new IllegalArgumentException("Perfil inválido!");
	}
}
