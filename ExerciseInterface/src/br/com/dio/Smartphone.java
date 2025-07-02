package br.com.dio;

public class Smartphone implements TeamMarketing {

    @Override
    public void submitMessageFromSMS() {
        System.out.println("This smartphone submit a message from SMS");
    }

    @Override
    public void submitMessageFromWhatsapp() {
        System.out.println("This smartphone submit a message from WhatsApp");
    }

    @Override
    public void submitMessageFromInstagram() {
        System.out.println("This smartphone submit a message from Instagram");
    }

    @Override
    public void submitMessageFromEmail() {
        System.out.println("This smartphone submit a message from e-mail");
    }

}
