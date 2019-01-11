class StringReverseUsingReverseFun{
	public static void main(String[] args) {
		String s1 = "Mohd Anas";
		StringBuffer sb = new StringBuffer(s1);
		System.out.println("before reverse "+s1);
		sb.reverse();
		System.out.println("after reverse "+sb);

	}
}