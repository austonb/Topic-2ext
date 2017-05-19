package chapter9;
import java.util.Stack;

import Toolkit.Stock;
public class Exercise9_2 {
	 public static void main(String[] args) {

	        Stock stock1 = new Stack("ORCL", "Oracle Corporation");
	        stock1.setCurrentPrice(34.5);
	        stock1.setCurrentPrice(34.35);
	        System.out.println("Stock name: " + stock1.getName() + " Symbol: " + stock1.getSymbol());
	        System.out.println("previous price: " + stock1.getPreviousClosingPrice());
	        System.out.println("current price: " + stock1.getCurrentPrice());
	        System.out.println("Percent changed: " + stock1.getChangePercent());

	}
}
