package com.OIT.ServiceNowHelper;

import java.util.ArrayList;

public class Fields {
	
	private ArrayList<String> serviceOfferings = new ArrayList<>();
	private ArrayList<String> buisnessServices = new ArrayList<>();
	private ArrayList<String> categories = new ArrayList<>();
	
	
	public void addServiceOffering(String serviceOffering) {
		this.serviceOfferings.add(serviceOffering);
		
	}

	public void addBuisnessServices(String buisnessService) {
		this.serviceOfferings.add(buisnessService);
	}

	public void addCategories(String category) {
		this.categories.add(category);
	}
	

	public ArrayList<String> getServiceOfferings() {
		return serviceOfferings;
	}

	public void setServiceOfferings(ArrayList<String> serviceOfferings) {
		this.serviceOfferings = serviceOfferings;
	}


	public ArrayList<String> getBuisnessServices() {
		return buisnessServices;
	}


	public void setBuisnessServices(ArrayList<String> buisnessServices) {
		this.buisnessServices = buisnessServices;
	}


	public ArrayList<String> getCategories() {
		return categories;
	}


	public void setCategories(ArrayList<String> categories) {
		this.categories = categories;
	}
		
	
	
}
