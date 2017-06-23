package com.sapient.product.resource;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

import com.sapient.product.config.MessagesConfiguration;

@Path(value = "/hello")
public class MsgResource {

    private final MessagesConfiguration conf;

    public MsgResource(final MessagesConfiguration conf) {
        this.conf = conf;
    }

    @GET
    public String sayHello() {
        return "Hello Satish";
    }

}
