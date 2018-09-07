package com.claim.entity;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
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
	
	// Create a skills object using the selectedSkills property of Job
	public Skills createSkillsObject(Job job) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {		
	Skills skillsHoldingSelections = new Skills();
			
			

			
			// Add selected skills to the skills object
			// Loop through selected skills
			for (int i=0; i < job.getSelectedSkills().size(); i++) 
			{
				// Loop through fields of Skills object to match a selected skill
				for (Field obj: skillsHoldingSelections.getClass().getDeclaredFields()) 
				{
					if (obj.toString().endsWith(job.getSelectedSkills().get(i)) && !obj.toString().contains("SkillLevel")) 
					{
						System.out.println("This is wherehappening");
						System.out.println(obj.toString());
						// Change first letter of selected to uppercase
						String skillsSetter = job.getSelectedSkills().get(i).substring(0, 1).toUpperCase();
						
						// Concatenate remaining string of selected skill
						skillsSetter += job.getSelectedSkills().get(i).substring(1);
						
	  					// Concatenate "set" to the matching skill to match the skill's setter
						skillsSetter = "set" + skillsSetter;
						System.out.println(skillsSetter);
						
						// Loop through the methods of Skills object to find/invoke the skill's setter
						for (Method meth: skillsHoldingSelections.getClass().getDeclaredMethods()) 
						{
							/*System.out.println(meth.toString());*/
							if (meth.toString().contains(skillsSetter) && !meth.toString().contains("SkillLevel")) 
							{
								// 
								System.out.println(meth.toString());
								meth.invoke(skillsHoldingSelections, true);
								System.out.println("IF THIS PRINTS SOMETHING WORKD");
							}
						}
					}
				}
			}
			return skillsHoldingSelections;
		}
	
}
