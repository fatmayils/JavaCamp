package intro;

public class Main {

	public static void main(String[] args) {
		String internetSubeButon="internet þubesi";
        System.out.println("hello world");
        System.out.println(internetSubeButon);
        double dolarDun=8.15;
        double dolarBugun=8.15;
        int vade=899;
        boolean dustuMu=false;
        if(dolarBugun<dolarDun)
        {
        	System.out.println("düþtü");
        }
        else if(dolarBugun>dolarDun)
        {
        	System.out.println("arttý");
        }
        else {
        	System.out.println("deðiþim yok");
        }
        
        String krediler[]= {"hýzlý kredi","çiftçi kredisi","msb kredisi","mutlu emelki kredisi","meb kredisi"};
        for(int i=0;i<krediler.length;i++)
        {
        	System.out.println(krediler[i]);
        }
        for(String kredi:krediler)
        {
        	System.out.println(kredi);
        }
         int sayi1=10;
         int sayi2=20;
         sayi1=sayi2;
         System.out.println(sayi1);
         int[] sayilar1= {1,2,3,4,5};
         int[] sayilar2= {10,20,30,40,50};
         sayilar1=sayilar2;
         sayilar2[0]=100;
         System.out.println(sayilar1[0]);
         String sehir1="Ýstanbul";
         String sehir2="Ankara";
         sehir1=sehir2;
         sehir2="Ýzmir";
         System.out.println(sehir1);
	}

}
