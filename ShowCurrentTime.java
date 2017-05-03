public class ShowCurrentTime{
	public static void main(String[] args) {
		long total_milli_seconds = System.currentTimeMillis();

		long total_seconds = total_milli_seconds / 1000;
		long current_seconds = total_seconds % 60;
		long total_minutes = total_seconds / 60;
		long current_minutes = total_minutes % 60;
		long total_hours = total_minutes / 60;
		long current_hours = total_hours % 24;

		System.out.println("Current time is " + current_hours +" : " + current_minutes + " : " + current_seconds + " GMT");
	}
}