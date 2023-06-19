abstract class PhoneBuilder {
    protected Phone phone;

    public void createNewPhone() {
        phone = new Phone();
    }

    public Phone getPhone()
    {
        return phone;
    }

    public abstract void buildSpeaker();
    public abstract void buildMicrophone();

    public abstract void buildCamera();
    public abstract void buildBattery();

}
