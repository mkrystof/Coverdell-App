package edu.gatech.omscs.ihi.domain.id;

import java.io.Serializable;

public class PatientId implements Serializable
{
	private static final long serialVersionUID = -7677697653722608351L;

	private String mrn;
	
	private String encounterId;
	
	private String destinationId;
	
	public PatientId()
	{
		
	}
	
	public PatientId( String mrn, String encounterId, String destinationId )
	{
		this.mrn = mrn;
		this.encounterId = encounterId;
		this.setDestinationId(destinationId);
	}

	public String getMrn() 
	{
		return this.mrn;
	}

	public void setMrn( String mrn ) 
	{
		this.mrn = mrn;
	}

	public String getEncounterId() 
	{
		return this.encounterId;
	}

	public void setEncounterId( String encounterId ) 
	{
		this.encounterId = encounterId;
	}

	public String getDestinationId() 
	{
		return this.destinationId;
	}

	public void setDestinationId( String destinationId ) 
	{
		this.destinationId = destinationId;
	}
}