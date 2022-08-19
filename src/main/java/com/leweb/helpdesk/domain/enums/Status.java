package com.leweb.helpdesk.domain.enums;

public enum Status {
	ABERTO(0,"ABERTO"), 
	ANDAMENTO(1,"ANDAMENTO"), 
	FECHADO(2,"FECHADO");
	
	private Integer codigo;
	private String descricao;
		
	private Status(Integer codigo, String descricao) {
		this.codigo = codigo;
		this.descricao = descricao;
	}
	public Integer getCodigo() {
		return codigo;
	}
	public String getDescricao() {
		return descricao;
	}
	
	public static Status toEnum(Integer codigo) {
		if(codigo.equals(null)) {
			return null;
		}
		for(Status status : Status.values()) {
			if(codigo.equals(status.getCodigo()))
				return status;
		}
		throw new IllegalArgumentException("Status inválido!");
	}
}
