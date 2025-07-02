package br.com.dio;

public class Main {

    public static void main(String[] args) {

        Smartphone smartphone = new Smartphone();
        submitMessage(smartphone);

    }

    public static void submitMessage(TeamMarketing teamMarketing) {
        teamMarketing.submitMessageFromSMS();
        teamMarketing.submitMessageFromWhatsapp();
        teamMarketing.submitMessageFromInstagram();
        teamMarketing.submitMessageFromEmail();
    }

}
