package account;

public class Bill {

	public char gender;
	public int beer;
	public int barbecue;
	public int softDrink;

	public double cover() {
		return 4;
	}

	public double feeding() {
		int valueBeer = 5;
		int valueBarbecue = 7;
		int valueSoftDrink = 3;
		
		return (beer * valueBeer) + (barbecue * valueBarbecue) + (softDrink * valueSoftDrink);
		
	}

	public double ticket() {
		int ticket = 0;
		if (gender == 'M') {
			ticket = 10 ;
		} else if (gender == 'F') {
			ticket = 8;
		}
		return ticket;
	}

	public double total() {
		return feeding() + cover() + ticket();
	}

	@Override
	public String toString() {
		if (feeding() > 30.0) {
			return "RELATÓRIO: \n"
					+ "Consumption = R$ "
					+ String.format("%.2f%n", feeding())
					+ "Cover charge"
					+"\n"
					+ "Ticket = R$ "
					+ String.format("%.2f%n", ticket())
					+ "\r\n"
					+ "Amount to pay = R$ "
					+ String.format("%.2f%n", total());
		}else {
			return "RELATÓRIO: \n"
					+ "Consumption = R$ "
					+ String.format("%.2f%n", feeding()) 
					+ "Couvert = R$ "
					+ String.format("%.2f%n", cover())
					+ "Ticket = R$ "
					+ String.format("%.2f%n", ticket())
					+ "\r\n"
					+ "Amount to pay = R$ "
					+ String.format("%.2f%n", total());
		}
		
	}
	
	
}
