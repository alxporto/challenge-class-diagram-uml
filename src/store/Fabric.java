package store;

import equipment.phone.PhoneDevice;
import equipment.music.Music;
import equipment.browser.Browser;
import iphone.Iphone;

public class Fabric {
    public static void main(String[] args) {
        Iphone iphone = new Iphone();
        Music music = (Music) iphone;
        PhoneDevice phoneDevice = (PhoneDevice) iphone;
        Browser browser = (Browser) iphone;

        System.out.println("Music");
        music.selectMusic();
        music.play();
        music.pause();
        System.out.println(" *(ºoº)* ");
        System.out.println(" ");

        System.out.println("Phone");
        phoneDevice.call();
        phoneDevice.answer();
        phoneDevice.initVoiceMail();
        System.out.println(" *(o)* ");
        System.out.println(" ");

        System.out.println("Internet");
        browser.page();
        browser.addNewTab();
        browser.updatePage();
        System.out.println(" (.*|*.) ");
    }
}

