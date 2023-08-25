package com.example.demo;

import java.util.*;

import com.stripe.*;
import com.stripe.exception.StripeException;
import com.stripe.model.WebhookEndpoint;


public class WebhookTest {

	public static void main(String[] args) throws StripeException {
		//Manage your API keys to authenticate requests with Stripe. 
		//Stripe authenticates your API requests using your account's API keys. 
		//If you don't include your key when making an API request, or use an incorrect or outdated one, Stripe returns a 401 - Unauthorized HTTP response code.
		
    	Stripe.apiKey ="sk_test_51KREGoSJ63JAew6qG9ByRtmFZV420viSqZ9ftnF7l4C9TW6AN6ivwR3UvOzUTUTQB1OwrEpAYZFCFAGA2YGk7hoz00fJs44WWG"; //Check for project's authentication mechanism
    	List<Object> events = new ArrayList<Object>();
    	events.add("charge.succeeded");
    	events.add("charge.failed");
    	
    	Map<String, Object> param = new HashMap<String, Object>();
    	param.put("enabled_events",events);
    	param.put("url", "https://webhook.site/8da3653c-c44a-4a0e-92a1-6b48ac557548");
    	
    	WebhookEndpoint weEndpoint = WebhookEndpoint.create(param);
    	System.out.println(weEndpoint);
	}

}
