package com.claim.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class PerksBenefits implements Serializable{

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int perksBenefitsId;
}
