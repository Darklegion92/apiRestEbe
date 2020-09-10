package com.bolsadeideas.springboot.backend.apirest.models.vo;

import java.util.ArrayList;

public class AgrupacionesVo {

	private String NOMBREFAMILIA;
	private ArrayList<String> GRUPOS;

	public AgrupacionesVo(String nOMBREFAMILIA, ArrayList<String> gRUPOS) {
		super();
		NOMBREFAMILIA = nOMBREFAMILIA;
		GRUPOS = gRUPOS;
	}

	public String getNOMBREFAMILIA() {
		return NOMBREFAMILIA;
	}

	public void setNOMBREFAMILIA(String nOMBREFAMILIA) {
		NOMBREFAMILIA = nOMBREFAMILIA;
	}

	public ArrayList<String> getGRUPOS() {
		return GRUPOS;
	}

	public void setGRUPOS(ArrayList<String> gRUPOS) {
		GRUPOS = gRUPOS;
	}

}
