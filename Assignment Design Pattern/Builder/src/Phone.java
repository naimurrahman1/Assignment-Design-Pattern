public class Phone {
    private String speaker="";
    private String microphone="";
    private String  camera="";
    private String battery="";

    public void setSpeaker(String speaker)
    {
        this.speaker=speaker;
    }
    public void setMicrophone(String microphone)
    {
        this.microphone=microphone;
    }

    public void setCamera(String camera)
    {
        this.camera=camera;

    }

    public void setBattery(String battery)
    {
        this.battery=battery;
    }
    public String PhoneComponents() {
        return "Speaker:" + speaker + "\nMicrophone:" + microphone + "\nCamera:" + camera + "\nBattery:" + battery;

    }
}
