package iphone;

import equipment.phone.PhoneDevice;
import equipment.browser.Browser;
import equipment.music.Music;

public class Iphone implements Music, Browser, PhoneDevice {
    @Override
    public void play() {
        System.out.println("Playing the music in iphone device");
    }

    @Override
    public void pause() {
        System.out.println("Pause music in iphone device");
    }

    @Override
    public void selectMusic() {
        System.out.println("Selecting music in iphone device");
    }

    @Override
    public void page() {
        System.out.println("Opening the webpage using an iphone device");
    }

    @Override
    public void addNewTab() {
        System.out.println("Add a new tab using an iphone device");
    }

    @Override
    public void updatePage() {
        System.out.println("Updating a webpage using an iphone device");
    }

    @Override
    public void call() {
        System.out.println("Calling using an iphone device");
    }

    @Override
    public void answer() {
        System.out.println("Answering using an iphone device");
    }

    @Override
    public void initVoiceMail() {
        System.out.println("Initializing the voice mail using an iphone device");
    }
}
