package manav;

import java.util.Scanner;

public class Manav {

	public static void main(String[] args) {
		
		double armut = 2.14, elma = 3.67, domates = 1.11, muz = 0.95, patlican = 5;
		
		Scanner scanner = new Scanner(System.in);
		
		
		System.out.print("Armut Kaç Kilo ? : ");		
		
		double armutKilo = scanner.nextDouble();
		
		
		System.out.print("Elma Kaç Kilo ? : ");		
		
		double elmaKilo = scanner.nextDouble();
		
		
		System.out.print("Domates Kaç Kilo ? : ");		
		
		double domatesKilo = scanner.nextDouble();
		
		
		System.out.print("Muz Kaç Kilo ? : ");		
		
		double muzKilo = scanner.nextDouble();
		
		
		System.out.print("Patlıcan Kaç Kilo ? : ");		
		
		double patlicanKilo = scanner.nextDouble();
		
		
		double toplam = (armutKilo*armut) + (elmaKilo*elma) + (domatesKilo*domates) + (muzKilo*muz) + (patlicanKilo*patlican);      
		
		System.out.println("Toplam Tutar : " + toplam);
		
		
		
		

	}

}
