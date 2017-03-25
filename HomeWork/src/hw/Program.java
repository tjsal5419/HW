package hw;

import java.util.List;

public class Program {

	public static void main(String[] args) {
		
		ShuffleSeats sf = new ShuffleSeats(5,3); // 5group, 3명씩
		       
		sf.add(1, 1, "newlec");
		sf.add(1, 2, "dragon");
		sf.add(1, 3, "ball");
		
		sf.add(2, 1, "newlec2");
		sf.add(2, 2, "dragon2");
		sf.add(2, 3, "ball2");
		       
		sf.add(3, 1, "newlec3");
		sf.add(3, 2, "dragon3");
		sf.add(3, 3, "ball3");
		
		sf.add(4, 1, "newlec4");
		sf.add(4, 2, "dragon4");
		sf.add(4, 3, "ball4");
		
		sf.add(5, 1, "newlec5");
		sf.add(5, 2, "dragon5");
		sf.add(5, 3, "ball5");
		
		int count = 0;
		
		System.out.println("변경 전");
		List<Seat> list = sf.getSeats();	
		for(Seat s : list){
			count++;
			System.out.printf(s.getUserName() +"\t");
			if(count%3==0)
				System.out.println("");
		}
		
		sf.shuffle();
		

		System.out.println("변경 후");
		list = sf.getSeats();	
		for(Seat s : list){
			count++;
			System.out.printf(s.getUserName() +"\t");
			if(count%3==0)
				System.out.println("");
		}
	}

}
