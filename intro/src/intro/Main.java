package intro;

public class Main {

	public static void main(String[] args) {
		//camelCase
		//Don't repeat yourself
		String internetSubeButonu="Ýnternet Þubesi";
		double dolarDun = 8.15;
		double dolarBugun=8.15;
		
		int vade=36;
		Boolean dustuMu= false;
		System.out.println(internetSubeButonu);
		
		if(dolarBugun<dolarDun)
		{
			System.out.println("Dolar düþtü resmi");
		}
		else if(dolarBugun>dolarDun){
			System.out.println("Dolar yükseldi resmi");
		}
		else {
			System.out.println("Dolar eþittir resmi");
		}
		String kredi1="Hýzlý Kredi";
		String kredi2="Mutlu emekli Kredi";
		String kredi3="Konut Kredi";
		String kredi4="Çiftçi Kredi";
		String kredi5="Msb Kredi";
		String kredi6="Kültür Bakanlýðý kredisi";
		
		System.out.println(kredi1);
		System.out.println(kredi2);
		System.out.println(kredi3);
		System.out.println(kredi4);
		System.out.println(kredi5);
		
		String[] krediler= {kredi1,kredi2,kredi3,kredi4,kredi5,kredi6};
		for(int i=0;i<krediler.length;++i) {
			System.out.println(krediler[i]);
		}
		//foreeach
		for(String kredi:krediler) {
			System.out.println(kredi);
		}
		int sayi1=10;
		int sayi2=20;
		sayi1=sayi2;
		System.out.println(sayi1);
		
		int[] sayilar1= {1,2,3,4};
		int[] sayilar2= {100,200,300};
		sayilar1=sayilar2;
		sayilar2[0]=120;
		System.out.println(sayilar1[0]);
		
		String sehir1="Ankara";
		String sehir2="Ýstanbul";
		sehir1=sehir2;
		sehir2="izmir";
		System.out.println(sehir1);
		
		
	}
		

}
