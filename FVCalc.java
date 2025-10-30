// Computes the future value of a saving investment.
public class FVCalc {
	public static void main(String[] args){
		String CurrentValue = args[0];
		Double rate = Double.parseDouble(args[1]);
		String n = args[2];
		Double futureValue = (Math.pow(rate/100+1,Integer.parseInt(n))*(Integer.parseInt(CurrentValue)));
		System.out.println("After " + n + " years, $" + CurrentValue + " saved at " + rate + "% will yield $" + (int) Math.floor(futureValue));
	}
}