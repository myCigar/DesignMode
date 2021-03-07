package com.LSPrinciple;

public class Main {
    public static void main(String[] args) {
        Customer commonCustomer = new CommonCustomer("Common", "common@163.com");
        Customer vipCustomer = new CommonCustomer("VIP", "vip@163.com");

        EmailSender emailSender = new EmailSender();
        emailSender.send(commonCustomer);
        emailSender.send(vipCustomer);
    }
}
