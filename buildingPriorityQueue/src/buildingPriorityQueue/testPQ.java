package buildingPriorityQueue;

public class testPQ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    PriorityQueue pq=new PriorityQueue(6);
    pq.add(1);
    pq.add(2);
    pq.add(5);
    pq.add(7);
    pq.add(3);
    pq.add(1);
    
    
    System.out.println(pq.toString());
    while(!pq.isEmpty()) 
    	System.out.println(pq.remove());
    
	}

}
