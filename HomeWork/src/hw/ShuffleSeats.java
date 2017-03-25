package hw;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ShuffleSeats {
	private int groupCapa;
	private int seatCapa;
	List<Seat> seats;
    public ShuffleSeats(int groupCapa, int seatCapa){
    	this.groupCapa = groupCapa;
    	this.seatCapa = seatCapa;
    	seats = new ArrayList<>();
    }

	
	public void add(int group, int seatIndex, String userName){
		Seat seat = new Seat(group, seatIndex, userName);
		seats.add(seat);
	}
	
	public void shuffle(){
	     int x=0,sw=0,tt=0;
	     int size = seats.size();
	     int batch[] = new int[size];
	     List<Seat> changedSeats = new ArrayList<>();

	      Random rand = new Random();
	      do {
	         int p = rand.nextInt(size);
	         for(int i=0;i<x;i++) {
	            if (p == batch[i]) {sw = 1;} 
	         }
	         if (sw !=1) {
	            batch[x] = p;
	            x++;
	         }
	         sw=0;
	      } while(x!=size);
	      
	      for (int i=0;i<size;i++) {
	         changedSeats.add(seats.get(batch[i]));
	      }
	      
	      seats.clear();
	      seats.addAll(changedSeats);
	}
	
	public List<Seat> getSeats(){
		return seats;
	}
  
}
