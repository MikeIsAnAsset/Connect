package com.claim.entity;

import java.util.ArrayList;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class GoogleMapPins {

	@Id
	@GeneratedValue
	private int id;
	
	private ArrayList<String> training = new ArrayList<>();
	private ArrayList<String> coworking = new ArrayList<>();
	private ArrayList<String> funding = new ArrayList<>();
	private ArrayList<String> guides = new ArrayList<>();
	
	
	
//	public GoogleMapPins(String business) {
//		super();
//		training.add(business);
//	}

	public void mapPinsTraining(String business) {
		training.add(business);
	}

	public void mapPinsCoworking(String business) {
		coworking.add(business);	
	}

	public void mapPinsFunding(String business) {
		funding.add(business);	
	}
	
	public void mapPinsGuides(String business) {
		guides.add(business);	
	}
	
	
	
	
	
	
	public ArrayList<String> getTraining() {
		return training;
	}

	public void setTraining(ArrayList<String> training) {
		this.training = training;
	}

	public ArrayList<String> getCoworking() {
		return coworking;
	}

	public void setCoworking(ArrayList<String> coworking) {
		this.coworking = coworking;
	}

	public ArrayList<String> getFunding() {
		return funding;
	}

	public void setFunding(ArrayList<String> funding) {
		this.funding = funding;
	}

	public ArrayList<String> getGuides() {
		return guides;
	}

	public void setGuides(ArrayList<String> guides) {
		this.guides = guides;
	}
	
	
	
}
