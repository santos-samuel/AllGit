package com.dwl.services;

import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.dwl.resources.RewardsResource;

public class App extends Application<CustomerRewardsConfiguration> {
	private static final Logger LOGGER = LoggerFactory.getLogger(App.class);

	@Override
	public void initialize(Bootstrap<CustomerRewardsConfiguration> b) {
	}

	@Override
	public void run(CustomerRewardsConfiguration c, Environment e)
			throws Exception {
		LOGGER.info("Method App#run() called");
		System.out.println("Hello world, by Dropwizard!");
		System.out.println("Coucbase Bucket : " + c.getCouchbaseBucket());
		e.jersey().register(new RewardsResource());
	}

	public static void main(String[] args) throws Exception {
		new App().run(args);
	}
}