package com.sapient.product;


import com.example.providers.RuntimeExceptionMapper;
import com.sapient.product.config.MessagesConfiguration;
import com.sapient.product.resource.ProductResource;
import com.yammer.dropwizard.Service;
import com.yammer.dropwizard.config.Bootstrap;
import com.yammer.dropwizard.config.Environment;


public class ProductService extends Service<MessagesConfiguration> {
	
	public static void main(String[] args) throws Exception {
        new ProductService().run(args);
    }

    @Override
    public void initialize(final Bootstrap<MessagesConfiguration> bootstrap) {
        bootstrap.setName("product-dropwizard");
    }

    @Override
    public void run(final MessagesConfiguration conf, final Environment env) throws Exception {
    	CouchbaseService service = new CouchbaseService(conf);
        env.addResource(new ProductResource(service));
        env.addProvider(new RuntimeExceptionMapper());
    }

}
