package com.claim.controller;

import static org.junit.Assert.assertEquals;

import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import java.util.stream.Collectors;

import org.json.JSONArray;
import org.json.JSONObject;
import org.json.simple.JsonObject;
import org.json.simple.parser.JSONParser;
import org.junit.Test;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fasterxml.jackson.core.JsonParser;


@Controller
public class SlackController {
/*	consumes=MediaType.APPLICATION_JSON_VALUE, */
	@RequestMapping(value="/slack", method=RequestMethod.POST)
	
	public void givenRequestParam_whenUTF8Scheme_thenDecodeRequestParams(@RequestBody String testUrl)   {
	    
		try {
            String result = URLDecoder.decode(testUrl, "UTF-8");
            System.out.println("It has decoded: " + result);
            System.out.println(result.substring(8));
            JSONObject jObjectFromString = new JSONObject(result.substring(8));
            System.out.println(jObjectFromString.toString());
        } catch (UnsupportedEncodingException ex) {
            ex.printStackTrace();
        }
		
		
		
		
		
		
		/*
		
	    String line = URLEncoder.encode(testUrl, "UTF-8") + "=" + URLEncoder.encode("value1", "UTF-8");

	    String[] pairs = line.split("\\&");
	    for (int i = 0; i < pairs.length; i++) {
	      String[] fields = pairs[i].split("=");
	      String name = URLDecoder.decode(fields[0], "UTF-8");
	      System.out.println(name);
	      String value = URLDecoder.decode(fields[1], "UTF-8");
	      System.out.println(value);
		
		
	    }*/
		
/*		
		
		
		URI uri = new URI(testUrl);
	 
	    String scheme = uri.getScheme();
	    String host = uri.getHost();
	    String query = uri.getRawQuery();*/
	 
/*	    String decodedQuery = Arrays.stream(query.split("&"))
	      .map(param -> param.split("=")[0] + "=" + decode(param.split("=")[1]))
	      .collect(Collectors.joining("&"));
	 
	    assertEquals(
	      "http://www.baeldung.com?key1=value 1&key2=value@!$2&key3=value%3",
	      scheme + "://" + host + "?" + decodedQuery);*/
	}
	/*@ResponseBody*/
/*	public ResponseEntity<Object> handleButtonClick(@SuppressWarnings("deprecation") JSONParser  jsonObject) {*/
	/*public ResponseEntity<HttpStatus> handleButtonClick(@RequestBody String  stringForJasonObject) throws UnsupportedEncodingException {
		String result = java.net.URLDecoder.decode(stringForJasonObject, "UTF-8");
		
		@SuppressWarnings("unused")
		JSONObject jObject = new JSONObject("{"+result+"}");
		JsonParser parser = new JsonParser();
		JSONObject json = (JSONObject) parser.parse(jsonObject);
	JSONObject jo = new JsonParser().parse(jsonObject).getAsJsonObject();
	// getting actions
	    return new ResponseEntity<>(HttpStatus.OK);
    JSONArray ja = new JSONArray();//(JSONArray) jsonObject.get("actions");
     
    // iterating actions
    Iterator itr2 = ja.iterator();
     
    while (itr2.hasNext()) 
    {
    	Iterator<Map.Entry> itr1 = ((Map) itr2.next()).entrySet().iterator();
        while (itr1.hasNext()) {
            Map.Entry pair = itr1.next();
            System.out.println(pair.getKey() + " : " + pair.getValue());
        }
    }
    return new ResponseEntity<>(HttpStatus.OK);
	}*/
}
