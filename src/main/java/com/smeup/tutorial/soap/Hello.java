package com.smeup.tutorial.soap;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public class Hello {

    @WebMethod
    public String hello(final String name) {

        return "Hello, " + name + "!";
    }

    @WebMethod
    public String helloWorld() {

        return "Hello, World!";
    }

}
