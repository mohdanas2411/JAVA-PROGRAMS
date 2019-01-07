import java.util.PriorityQueue;
class PriorityQueueDemo{
	
	public static void main(String[] arga){
		PriorityQueue pq = new PriorityQueue();
		pq.add("anas");
		pq.add("anas1");
		pq.offer("anas2");
		pq.add("anas3");
		System.out.println(pq);
		System.out.println(pq.size());
		System.out.println(pq.peek());
		System.out.println(pq.remove());
		System.out.println(pq.poll());
	}
}