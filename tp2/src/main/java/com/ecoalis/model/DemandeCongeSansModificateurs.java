package com.ecoalis.model;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

public class DemandeCongeSansModificateurs {

	@SuppressWarnings("unused")
	private Collaborateur collaborateur;
	@SuppressWarnings("unused")
	private Periode periode;

	public DemandeCongeSansModificateurs(Collaborateur collaborateur, Periode periode) {
		this.collaborateur = collaborateur;
		this.periode = periode;
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this, ToStringStyle.MULTI_LINE_STYLE);
	}

}
