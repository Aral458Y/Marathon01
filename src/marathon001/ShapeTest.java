package marathon001;

import java.util.Scanner;


public class ShapeTest {
	
	private Scanner input;

	public static void main(String[] args) {
		
		ShapeTest shapeTest = new ShapeTest();
		shapeTest.readInput();
		System.out.println("Byee..");

	}

	private void readInput() {
		
		this.input = new Scanner(System.in);
		while(true) {
			System.out.println("Çevre uzunluğu hesaplamak için 1");
			System.out.println("Alan hesaplamak için 2");
			System.out.println("Hem uzunluk hem alan hesaplamak için 3");
			System.out.println("Çıkmak için -1");
			int selection = this.input.nextInt();
			input.nextLine();
			if (selection == -1) {
				break;
			}
			if(!this.processSelection(selection)){
				System.err.println("Yanlış seçim yaptınız!! Lütfen tekrar deneyin.");
				continue;
			}
		}
		
		input.close();
		
		
	}

	private boolean processSelection(int selection) {
		boolean returnValue = true;
		switch (selection) {
		case 1:
			System.out.println("Çevre uzunluğu hesaplayıcısına hoşgeldiniz.");
			this.perimeterCalculator();
			break;
			
		case 2:
			System.out.println("Alan hesaplayıcısına hoşgeldiniz.");
			this.areaCalculator();
			
			break;
			
		case 3:
			System.out.println("Hem çevre hem alan hesaplayıcısına hoşgeldiniz.");
			this.perimeterAndArea();
			
			break;
			

		default:
			returnValue = false;
		}
		return returnValue;
	}

	private void perimeterAndArea() {
		System.out.println("Lütfen kenarları giriniz(En fazla 4 kenar)");
		System.out.println("Lütfen 1. kenarı giriniz.");
		double line1 = input.nextDouble();
		if(line1==0) {
			System.out.println("Kenarsız şekil olmaz! Lütfen tekrar deneyiniz.");
			return;
		}
		System.out.println("Lütfen 2. kenarı giriniz.");
		double line2 = input.nextDouble();
		if(line2==0) {
			System.out.println("1 kenarlı şekil olmaz! Lütfen tekrar deneyiniz.");
			return;
		}
		System.out.println("Lütfen 3. kenarı giriniz!Lütfen tekrar deneyiniz.");
		double line3 = input.nextDouble();
		if(line3==0) {
			System.out.println("2 kenarlı şekil olmaz.");
			return;
		}
		System.out.println("Lütfen 4. kenarı giriniz.");
		double line4 = input.nextDouble();
		if(line4==0) {
			double s = (line1+line2+line3)/2;
			double area = Math.sqrt(s*(s-line1)*(s-line2)*(s-line3));
			double perimeter = line1+line2+line3;
			System.out.println("Üçgenin çevresi: "+perimeter + "  Üçgenin alanı: "+area);
		}else {
			double area= line1+line2+line3+line4;
			double perimeter= line1+line2+line3+line4;
			System.out.println("Dörtgenin çevresi: "+perimeter + "  Dörgenin alanı: "+area);
			
			
			
		}
		
		
	}

	private void areaCalculator() {
		System.out.println("Lütfen kenarları giriniz(En fazla 4 kenar)");
		System.out.println("Lütfen 1. kenarı giriniz.");
		double line1 = input.nextDouble();
		if(line1==0) {
			System.out.println("Kenarsız şekil olmaz! Lütfen tekrar deneyiniz.");
			return;
		}
		System.out.println("Lütfen 2. kenarı giriniz.");
		double line2 = input.nextDouble();
		if(line2==0) {
			System.out.println("1 kenarlı şekil olmaz! Lütfen tekrar deneyiniz.");
			return;
		}
		System.out.println("Lütfen 3. kenarı giriniz!Lütfen tekrar deneyiniz.");
		double line3 = input.nextDouble();
		if(line3==0) {
			System.out.println("2 kenarlı şekil olmaz.");
			return;
		}
		System.out.println("Lütfen 4. kenarı giriniz.");
		double line4 = input.nextDouble();
		
		if(line4==0){
			double s = (line1+line2+line3)/2;
			double area = Math.sqrt(s*(s-line1)*(s-line2)*(s-line3));
			System.out.println("Üçgenin alanı: " +area);
		}else {
			double area = line1* line2*line3*line4;
			System.out.println("Dikdörtgenin alanı: "+area);
		}
		 
		
		
		
		
	}

	private void perimeterCalculator() {
		System.out.println("Lütfen kenarları giriniz(En fazla 4 kenar)");
	System.out.println("Lütfen 1. kenarı giriniz.");
	double line1 = input.nextDouble();
	if(line1==0) {
		System.out.println("Kenarsız şekil olmaz! Lütfen tekrar deneyiniz.");
		return;
	}
	System.out.println("Lütfen 2. kenarı giriniz.");
	double line2 = input.nextDouble();
	if(line2==0) {
		System.out.println("1 kenarlı şekil olmaz! Lütfen tekrar deneyiniz.");
		return;
	}
	System.out.println("Lütfen 3. kenarı giriniz!Lütfen tekrar deneyiniz.");
	double line3 = input.nextDouble();
	if(line3==0) {
		System.out.println("2 kenarlı şekil olmaz.");
		return;
	}
	System.out.println("Lütfen 4. kenarı giriniz.");
	double line4 = input.nextDouble();
	
	if(line4==0) {
		double perimeter = line1+line2+line3;
		System.out.println("Üçgenin çevresi: "+perimeter);
	}else {
		double perimeter= line1+line2+line3+line4;
		System.out.println("Dörtgenin alanı: "+ perimeter);
	}
			
		}
		
		
		
	}
