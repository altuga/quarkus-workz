
package com.kodcu.quarkus.boundary;

import javax.enterprise.context.RequestScoped;


@RequestScoped
public class HelloService {
    
    public String sayHello() {
        return "hello quarkes " + System.currentTimeMillis();
    }
    
}
