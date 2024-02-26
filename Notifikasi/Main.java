package notifikasi;

public class Main {

    public static void main(String[] args) {
        String emailPenerima = "mrezky.eksatama@gmail.com";
        String nomerHp = "+62 821-2529-9265";
        String mobileId = "android-723648";

        EmailNotification emailNotif = new EmailNotification();
        SMSNotification smsNotif = new SMSNotification();
        PushNotification pushNotif = new PushNotification();

        String message = "Rezky Luo yi mu jago banget, ayo mabar!";
        
        emailNotif.sendMessage(emailPenerima, message);
        smsNotif.sendMessage(nomerHp, message);
        pushNotif.sendMessage(mobileId, message);
    }
}