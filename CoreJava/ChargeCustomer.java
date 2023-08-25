package com.example.demo;
import java.util.*;

import com.stripe.Stripe;
import com.stripe.exception.StripeException;
import com.stripe.model.Charge;

public class ChargeCustomer {

	public static void main(String[] args) throws StripeException {
		Stripe.apiKey ="sk_test_51KREGoSJ63JAew6qG9ByRtmFZV420viSqZ9ftnF7l4C9TW6AN6ivwR3UvOzUTUTQB1OwrEpAYZFCFAGA2YGk7hoz00fJs44WWG"; // add your api key
    		Map<String, Object> params = new HashMap<>();
		params.put("amount", 1);
		params.put("currency", "usd");
		params.put("customer", "cus_L7TFIgG7h1PpVi");

		Charge charge = Charge.create(params);
		System.out.println(charge);
	}

}
