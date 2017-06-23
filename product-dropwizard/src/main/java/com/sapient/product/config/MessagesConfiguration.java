package com.sapient.product.config;

import java.util.ArrayList;
import java.util.List;

import javax.validation.constraints.NotNull;

import com.yammer.dropwizard.config.Configuration;


@SuppressWarnings("UnusedDeclaration")
public class MessagesConfiguration extends Configuration {

    private String nodes ;
    
    public String getNodes() {
		return nodes;
	}

	public void setNodes(String nodes) {
		this.nodes = nodes;
	}

    private String bucket;
    
    private String password;

	

	public String getBucket() {
		return bucket;
	}

	public void setBucket(String bucket) {
		this.bucket = bucket;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

    
}
