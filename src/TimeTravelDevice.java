public class TimeTravelDevice {
    TimeTraveler timeTraveler = null;

    public void preserveTimeTravelerForNextLoop(TimeTraveler timeTraveler){
        this.timeTraveler = timeTraveler;
    }

    public TimeTraveler returnTimeTravelerToReality(){
        return timeTraveler;
    }
}