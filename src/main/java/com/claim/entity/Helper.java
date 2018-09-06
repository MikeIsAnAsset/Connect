package com.claim.entity;

import java.lang.reflect.Field;
import java.util.ArrayList;

import org.springframework.stereotype.Service;

@Service
public class Helper {

	public ArrayList<String> obtainFieldNames() {
		// Create list of field names from Skills
		ArrayList<String> fieldNames = new ArrayList<String>();
		Skills blankSkills = new Skills();
		System.out.println("This is the reflection");
		System.out.println(blankSkills.getClass().getDeclaredFields().toString());
		for (Field obj : blankSkills.getClass().getDeclaredFields()) {
			if (!obj.toString().substring(40).contains("SkillLevel")) {
				fieldNames.add(obj.toString().substring(40));
			}
			System.out.println("These are the fieldnames");
			System.out.println(obj.toString());
		}
		// remove id field
		fieldNames.remove(0);

		return fieldNames;
	}
}
