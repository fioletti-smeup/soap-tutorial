package com.smeup.tutorial.soap;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public class Contacts {

    private final List<Contact> contacts = new ArrayList<>();

    public Contacts() {

        this.contacts.add(new Contact("000001", "Antonio Manfredi"));
        this.contacts.add(new Contact("000002", "Giacomo Boselli"));
        this.contacts.add(new Contact("000003", "Pasquale Baudaffi"));
    }

    @WebMethod
    public List<Contact> search(final String description) {

        if (null == description) {

            return this.contacts;
        }
        return this.contacts.stream().filter(c -> c.getDescription().toUpperCase().contains(description.toUpperCase()))
                .collect(Collectors.toList());
    }

    @WebMethod
    public Contact get(final String code) {

        return this.contacts.stream().filter(c -> c.getCode().equals(code)).findAny()
                .orElseThrow(new NotFoundExceptionSupplier("Contact code: " + code + " not found"));
    }
}
