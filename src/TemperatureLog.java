import java.util.Scanner;
public class TemperatureLog {

	public static void main(String[] args) {
		
		System.out.println("Welcome to HW temperature reader");
		System.out.println("--------------------------------");
		
		Scanner scanner = new Scanner(System.in);
		
		String[] month = {"Jan", "Feb", "Mar", "Apr", "May", "June", "July", "Aug", "Sept", "Oct", "Nov", "Dec"};
		
		int hot = 0;
		int cold = 0;
		int HOTcount = 0;
		int COLDcount = 0;
		int total = 0;

		
		for (int i = 0; i < 12; i++) {
			
			System.out.println("Enter the average temperature for the month of " + month[i]);
			int temperature = scanner.nextInt();
			
			total = total + temperature;
			
			if (i == 0) {
				hot = temperature;
				cold = temperature;
			}
			
			if (temperature > hot) {
				hot = temperature;
				 HOTcount = i;
			}
			
			if (temperature < cold) {
				cold = temperature;
				 COLDcount = i;
			}
			
		}
		
		double average = total/12;
		
		System.out.println("The hottest month of the year was "+month[HOTcount]+"., with a temperature of "+hot+"°C");
		System.out.println("The coldest month of the year was "+month[COLDcount]+"., with a temperature of "+cold+"°C");
		System.out.println("The average temperature of the year is "+average+"°C");
		
	}

}