package com.claim.service;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.claim.entity.Job;
import com.claim.entity.Skills;
import com.claim.repository.SkillsRepository;

@Service
public class SkillsService {

	@Autowired
	private SkillsRepository skillsRepository;
	
	public void saveSkills(Skills skills) {
		skillsRepository.save(skills);
	}

	public void createSomeSkills() {
		Skills skillset1 = new Skills();
		skillset1.setDotNet(true);
		skillset1.setA_B_Testing(true);
		skillset1.setAccountDevelopment(true);
		skillsRepository.save(skillset1);
			
	}
	
	
/*	try {
		SkillsService.sendMessage();
	} catch (Exception e) {
		e.printStackTrace();
	}
	*/
	
	
	
	 public static void sendMessage() throws Exception {
		    URL url = new URL("https://slack.com/api/chat.postMessage");
		    LinkedHashMap<Object, Object> params = new LinkedHashMap<>();
		    params.put("token", "xoxa-414052581681-417522501351-416628311445-f21cf6ca0aedecab3cb568c68a63f31a");
		    params.put("channel", "CC9M9CCBG");
		    params.put("text", "Another skill has been created.  What do you want to do?");
		    params.put("attachments", "[{\"text\": \"Choose a game to play\","
		    		+ "\"fallback\": \"If you could read this message, you'd be choosing something fun to do right now.\","
		    		+ "\"color\": \"#3AA3E3\","
		    		+ "\"attachment_type\": \"default\","
		    		+ "\"callback_id\": \"game_selection\","
		    		+ "\"actions\": [{\"name\": \"games_list\","
		    		+ 		    		"\"text\": \"Pick a game...\","
		    		+		    		"\"type\": \"select\","
		    		+		    		"\"options\": ["
		    		+ 								"{\"text\": \"Hearts\","
		    		+					    		"\"value\": \"hearts\"},"
		    		+					    		"{'text': 'Bridge',"
		    		+					    		"'value': 'bridge',}"
		    		+                    			"]}]}]");
		    StringBuilder postData = new StringBuilder();
		    for (Map.Entry param : params.entrySet()) {
		        if (postData.length() != 0) postData.append('&');
		        postData.append(URLEncoder.encode((String) param.getKey(), "UTF-8"));
		        postData.append('=');
		        postData.append(URLEncoder.encode(String.valueOf(param.getValue()), "UTF-8"));
		    }
		    byte[] postDataBytes = postData.toString().getBytes("UTF-8");
		    HttpURLConnection conn = (HttpURLConnection)url.openConnection();
		    conn.setRequestMethod("POST");
		    conn.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
		    conn.setRequestProperty("Content-Length", String.valueOf(postDataBytes.length));
		    conn.setDoOutput(true);
		    conn.getOutputStream().write(postDataBytes);
		    Reader in = new BufferedReader(new InputStreamReader(conn.getInputStream(), "UTF-8"));
		    StringBuilder sb = new StringBuilder();
		    for (int c; (c = in.read()) >= 0;)
		        sb.append((char)c);
		    String response = sb.toString();
		    System.out.println(response);
		    /*JSONObject myResponse = new JSONObject(response.toString());
		    System.out.println("result after Reading JSON Response");
		    System.out.println("ok- "+myResponse.getString("ok"));
		    System.out.println("channel- "+myResponse.getString("channel"));
		    JSONObject form_data = myResponse.getJSONObject("form");
		    System.out.println("ts- "+form_data.getString("ts"));
		    System.out.println("message- "+form_data.getString("message"));*/
		 
		}
	
	
	
	
/*	
	// Find all skills
	public ResponseEntity<ArrayList<Skills>> fetchAllSkills() {
//		ResponseEntity<ArrayList<String>> allSkillNames;
		
		
//		ArrayList<Skills> allSkills = (ArrayList<Skills>) skillsRepository.findAll();
//			for (Skills skill : allSkills) {
//				for (Field field : skill.getClass().getDeclaredFields()) {
//		            
//					
//					allSkillNames = ((ResponseEntity<ArrayList<String>>) allSkillNames).add(field.getName());
//					
//					
//					Log.i("Field", field.getName() + ":" + field.get(obj));
//
//		        }
//			}
		
		
		
		ResponseEntity<ArrayList<Skills>> allSkills = (ResponseEntity<ArrayList<Skills>>) skillsRepository.findAll();
		return allSkills;
	}*/
	
	
	
	
	
	// Loop through all jobs and return jobs sorted by number of skills that match each job
	public TreeMap<Integer, Integer> findAllJobsWithMatchingSkills(Skills skillsToMatch) {

		HashMap<Integer, Integer> mapCountOfMatchingJobSkills = new HashMap<>();
				
		for (Job job : Job.getJobs()) {
			int count = Skills.countMatchingSkillsInTwoObjects(skillsToMatch, job);
			if (count > 0) {
				mapCountOfMatchingJobSkills.put(job.getJobId(), count);
			}
		}
		
		Comparator<Integer> comparator2 = new ValueComparator<Integer, Integer>(mapCountOfMatchingJobSkills);
		TreeMap<Integer, Integer> result = new TreeMap<Integer, Integer>(comparator2);
		result.putAll(mapCountOfMatchingJobSkills);
		
		return result;
	}
	
	// a comparator using generic type
	class ValueComparator<K, V extends Comparable<V>> implements Comparator<K>{
	 
		HashMap<K, V> map = new HashMap<K, V>();
	 
		public ValueComparator(HashMap<K, V> map){
			this.map.putAll(map);
		}
	 
		@Override
		public int compare(K s1, K s2) {
			return -map.get(s1).compareTo(map.get(s2));//descending order	
		}
	}
}
