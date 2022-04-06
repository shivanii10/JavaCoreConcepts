package com.logicbig.example;


import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.test.JerseyTest;
import org.junit.Assert;
import org.junit.Test;

import javax.ws.rs.core.Application; 
 
public class OrderServiceTest extends JerseyTest { 
 
    @Override 
    protected Application configure() { 
        return new ResourceConfig(OrderService.class); 
    } 
 
    @Test 
    public void ordersPathParamTest() { 
        String response = target("orders/4534").request().get(String.class);
        Assert.assertTrue("orderId: 4534".equals(response));

        response = target("orders/453").request().get(String.class);
        Assert.assertTrue("orderId: 453".equals(response));

        response = target("orders/a453").request().get(String.class);
        Assert.assertTrue("orderId: a453".equals(response));

        response = target("orders/s45").request().get(String.class);
        Assert.assertTrue("orderId: s45".equals(response));
 
    } 
}