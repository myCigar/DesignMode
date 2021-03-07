package com.LSPrinciple;

public class EmailSender {
    public void send(Customer customer) {
        System.out.println("Hello, " + customer.getName() + " & " + customer.getEmail());
    }
}
