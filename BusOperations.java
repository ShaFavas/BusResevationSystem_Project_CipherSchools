package bus;

import java.util.ArrayList;
import java.util.List;

public class BusOperations {

    static List<Bus> busList = new ArrayList<>();
    public void addBus(String busNumber, String operatorName, String source, String destination, int fare, int seat){
        Bus bus = new Bus(busNumber,operatorName,source,destination,fare,seat);
        busList.add(bus);
    }

    //Searching the required Bus from the bus lists

    public static List<Bus> searchBus(String source, String destination){
        List<Bus> resultList = new ArrayList<>();
        for (Bus bus : busList){
            if(source.equals(bus.getSource()) && destination.equals(bus.getDestination())){
                resultList.add(bus);
            }
        }
        return resultList;
    }
    public static void busBooking(String operator){

        for (Bus bus:busList){

            if(bus.getOperatorName().equals(operator)){
                if (bus.getSeat()>0){
                    bus.setSeat(bus.getSeat()-1);
                    System.out.println("Bus booked Successfully!!!");
                    System.out.println(bus);
                }
                else {
                    System.out.println("No seats are available for this bus");
                }
            }
        }
    }
}
