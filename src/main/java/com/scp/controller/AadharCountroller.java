package com.scp.controller;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.scp.webServiceProduce.AadharDeatils;
import com.scp.webServiceProduce.AadharService;

@Path("/aadhar")
public class AadharCountroller {
	AadharService aadharservice = new AadharService();

	@GET
	@Path("/list")
	@Produces(MediaType.APPLICATION_JSON)
	public List<AadharDeatils> getAadharDetails() {

		List<AadharDeatils> listOfAadharDetails = aadharservice.getAllAadharDeatils();
		return listOfAadharDetails;

	}
}
