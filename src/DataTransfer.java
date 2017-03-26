import com.fazecast.jSerialComm.*;

public class DataTransfer {
    public static void main(String[] args) {
        TimeOfFlight tofSensor = new TimeOfFlight();

        while(true) {
            System.out.println(tofSensor.GetDataInMillimeters());
            try {
                Thread.sleep(20);
            } catch(Exception e) { }
        }
    }
}
