package equipment.phone;

public class UnboxingLg implements PhoneDevice {
    @Override
    public void call() {
        System.out.println("Call");
    }

    @Override
    public void answer() {
        System.out.println("Answer");
    }

    @Override
    public void initVoiceMail() {
        System.out.println("Initializing the voice mail");
    }
}
