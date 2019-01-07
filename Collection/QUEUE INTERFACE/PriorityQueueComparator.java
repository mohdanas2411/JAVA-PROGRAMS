import java.util.PriorityQueue;
import java.util.Comparator;
import java.util.Iterator;

class PriorityQueueComparator{
	
	public static void main(String[] arga){
		PriorityQueue pq = new PriorityQueue(new HetroDecen());
		pq.add("anas");
		pq.offer(780);
		pq.add("enas1");
		pq.offer(57800);
		pq.offer("anas2");
		pq.add("anas3");
		pq.offer(50);
		
		Iterator i = pq.iterator();
		while(i.hasNext()){
			System.out.println(pq.remove());
		}
	}
}
class HetroDecen implements Comparator{
	public int compare(Object o, Object o1){
		String s1 = o.toString();
		String s2 = o1.toString();

		int l1 = s1.length();
		int l2 = s2.length();

		if (l1<l2) {
			
			return +1;
		}
		if (l1>l2) {
			
			return -1;
		}
		else{
			
			return -s1.compareTo(s2);
		}

	}
}