package com.haktanozgur.leapYear;

import java.util.Scanner;

public class leapYear {
	
 /*calculateLeapYear metodu kullanıcıdan gelen yıl bilgisine göre 4 ve 400 sayılarına
 tam bölünme durumu göz önünde bulundurularak, hesaplama yapar ve geriye String bir 
 açıklama değeri döndğürür*/
	public static String calculateLeapYear(int year) {
		String leapYearDescription = null;
		/*Bu kısımdaki iç içe if yapısı, 100'ün katı olup sadece 400'e tam olarak 
		bölünen sayıların artık yıl kabul edilmesinden dolayı kullanıldı.*/
		if(year % 4 == 0 ) {  
		  if(year % 400 == 0) 
			  leapYearDescription = "bir artık yıldır !";
		  else if (year % 100 == 0 && year % 400 != 0)
			  leapYearDescription = "bir artık yıl değildir !";
		  else if (year % 4 == 0)
			  leapYearDescription = "bir artık yıldır !";
		}
		
		else {
			leapYearDescription = "bir artık yıl değildir !";
		}
		
		return leapYearDescription;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Yıl Giriniz : ");
		int leapYear = scanner.nextInt();
		System.out.println(leapYear + " " +calculateLeapYear(leapYear));
	}
}
