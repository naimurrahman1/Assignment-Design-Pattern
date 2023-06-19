public class ProductionOfficier {
    private PhoneBuilder phoneBuilder;

    public void setPhoneBuilder(PhoneBuilder _phoneBuilder) {

        phoneBuilder = _phoneBuilder;
    }

    public Phone getPhone() {
        return phoneBuilder.getPhone();
    }

    public void constructPhone(){

        phoneBuilder.createNewPhone();

        phoneBuilder.buildSpeaker();

        phoneBuilder.buildMicrophone();

        phoneBuilder.buildCamera();
        phoneBuilder.buildBattery();
    }
}
