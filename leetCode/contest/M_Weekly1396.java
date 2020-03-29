//Link:https://leetcode.com/problems/design-underground-system/
package leetCode.contest;

import java.util.ArrayList;
import java.util.HashMap;

public class M_Weekly1396 {

    class Passenger{
        int id;
        int time;
        Passenger(int id,int time){
            this.id = id;
            this.time = time;
        }
    }
    class UndergroundSystem {
        HashMap<String, ArrayList<Passenger>> station;
        public UndergroundSystem() {
            station = new HashMap<>();
        }

        public void checkIn(int id, String stationName, int t) {
            if ( station.get(stationName)!=null){
                ArrayList<Passenger> value = station.get(stationName);
                value.add( new Passenger(id,t));
                station.put(stationName,value);
            }else {
                ArrayList<Passenger> value = new ArrayList<>();
                value.add(new Passenger(id,t));
                station.put(stationName, value);
            }
        }

        public void checkOut(int id, String stationName, int t) {
            checkIn(id,stationName,t);
        }

        public double getAverageTime(String startStation, String endStation) {
            double result = 0;
            int count = 0 ;
            for (Passenger startP : station.get(startStation)){
                for (Passenger endP : station.get(endStation)){
                    if (startP.id == endP.id){
                        result += (endP.time -startP.time);
                        count++;
                    }
                }
            }
            return result/count;
        }
    }
}
