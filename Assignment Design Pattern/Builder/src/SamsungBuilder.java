public class SamsungBuilder extends PhoneBuilder{
    @Override
    public void buildSpeaker() {

        phone.setSpeaker("SpX54");
    }

    @Override
    public void buildMicrophone() {
        phone.setMicrophone("micX4");

    }

    @Override
    public void buildCamera() {
        phone.setCamera("cam40Mp");

    }

    @Override
    public void buildBattery() {
        phone.setBattery("X023");

    }
}
