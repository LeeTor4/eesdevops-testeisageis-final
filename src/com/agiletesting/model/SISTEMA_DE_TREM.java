package com.agiletesting.model;

public enum SISTEMA_DE_TREM implements InterfaceZona{
	
	ZONA_A,
	ZONA_B;

	@Override
	public SISTEMA_DE_TREM tipoZonaA() {
		
		return ZONA_A;
	}

	@Override
	public SISTEMA_DE_TREM tipoZonaB() {
		
		return ZONA_B;
	}

	
}
