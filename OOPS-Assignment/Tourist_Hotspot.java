package oopsassignment;
import java.util.*;
//import java.lang.*;

public class Tourist_Hotspot {
	Scanner scan = new Scanner(System.in);	
	String Emirate1="DXB";
	String Emirate2="AUH";
	String Emirate3="RAK";
	String Emirate4="FUJ";
	
  void Display()
  {   
	  System.out.println("Enter the city you want to travel:");
	  System.out.println("Dubai:DXB , Abu Dhabi:AUH , Ras-Al-Khaimah:RAK , Fujairah:FUJ");
	     }
  
 String City=scan.nextLine();
  boolean isDXB = City.equalsIgnoreCase(Emirate1);
  boolean isAUH = City.equalsIgnoreCase(Emirate2);
  boolean isRAK = City.equalsIgnoreCase(Emirate3);
  boolean isFUJ = City.equalsIgnoreCase(Emirate4);
  
 void location()
 {
	if(isDXB==true)
	{
	  forDXB();
	}
	else if(isAUH==true)
	{
	  forAUH();
	}
	else if(isRAK==true)
	{
	  forRAK();
	}
	else if(isFUJ==true)
	{
	  forFUJ();
	}
	else
	{
		System.out.println("Invalid Input");
		
	}
	
 }
  
  
  
   void forDXB()
   {   double Total_Cost=0;
   		System.out.println();
	   System.out.println("Places for Visit:");
	   System.out.println("BURJ KHALIFA");
	   System.out.println("Burj Khalifa is a highly exotic place to visit in Dubai."
	   		+ "It is a skyscraper which has more than 160 stories"+ "and holds the following records:"
	   				+ " Tallest building in the world,"
	   				+ "Tallest free-standing structure in the world,"
	   				+ "Highest number of stories in the world.");
	   System.out.println("Price: AED: 136.45");
	   System.out.println("Press y/n for confirmation");
	   char dec1 = scan.next().charAt(0);
	   if(dec1 == 'y')
	   {
		  Total_Cost = Total_Cost+136.45;
	   }
	   
	   
	   System.out.println();
	   System.out.println("DUBAI DESERT SAFARI");
	   System.out.println("Desert Safari is undoubtedly one of the most exclusive activities to try in Dubai."
	   		+ "Exploring the endless deserts while on your Dubai trip is an adventure you must not miss. "
	   		+ "The moments you spend taking the experience of a desert safari in Dubai will stay with you forever as a treasured memory.");
	   System.out.println("Price: AED: 38.61");
	   System.out.println("Press y/n for confirmation");
	   char dec2 = scan.next().charAt(0);
	   if(dec2 == 'y')
	   {
		  Total_Cost = Total_Cost+38.61;
	   }
	   
	   
	   System.out.println();
	   System.out.println("GLOBAL VILLAGE");
	   System.out.println(" Global Village is Dubai’s leading family entertainment,"
	   		+ " undoubtedly one of the best places to visit in Dubai with family and cultural attraction that offers a unique shopping experience in Dubai through its 31 pavilions,"
	   		+ " each representing a different country across the globe");
	   System.out.println("Price: AED: 15");
	   System.out.println("Press y/n for confirmation");
	   char dec3 = scan.next().charAt(0);
	   if(dec3 == 'y')
	   {
		  Total_Cost = Total_Cost+15;
	   }
	   
	   System.out.println();
	   System.out.println("DUBAI MIRACLE GARDEN");
	   System.out.println("Dubai Miracle garden should be on top priority on the must do things in Dubai for nature lovers. "
	   		+ "The lush gardens are a treat to your senses and will leave you with a pleasant and happy feeling throughout.");
	   System.out.println("Price: AED: 108.07");
	   System.out.println("Press y/n for confirmation");
	   char dec4 = scan.next().charAt(0);
	   if(dec4 == 'y')
	   {
		  Total_Cost = Total_Cost+108.07;
	   }
	   
	   System.out.println();
	   System.out.println("DUBAI FRAME");
	   System.out.println("Dubai’s architectural designs and structures are always magnificent, and Dubai frame is one amongst most popular tourist places in Dubai. "
	   		+ "This massive picture frame with height and breadth of 150m and 93m respectively is one of the best places to see in Dubai");
	   System.out.println("Price: AED: 61.73");
	   System.out.println("Press y/n for confirmation");
	   char dec5 = scan.next().charAt(0);
	   if(dec5 == 'y')
	   {
		  Total_Cost = Total_Cost+61.73;
	   }
	   
	   System.out.println();
	   System.out.println("DUBAI MALL");
	   System.out.println("Among various Dubai tourist places, Dubai Mall is a place that attracts a major tourist crowd. "
	   		+ "It’s magnificent a sprawling structure with the vivacious interior designs, the expensive shops, portray the rich and splendid lifestyle of Dubai."
	   		+ " It is the largest mall in the world with respect to the total area."
	   		+ " Inside it, there are more than 1200 shops. ");
	   System.out.println("Price: FREE");
	   char dec6 = scan.next().charAt(0);
	   if(dec6 == 'y')
	   {
		  Total_Cost = Total_Cost+0;
	   }
	   
	   System.out.println();
	   System.out.println("Places you've selected to visit:");
	   if(dec1=='y') {
		   System.out.println("Burj Khalifa");
	   }
	   if(dec2=='y') {
		   System.out.println("Dubai Desert Safari");
	   }
	   if(dec3=='y') {
		   System.out.println("Global Village");
	   }
	   if(dec4=='y') {
		   System.out.println("Dubai Miracle Garden");
	   }
	   if(dec5=='y') {
		   System.out.println("Dubai Frame");
	   }
	   if(dec6=='y') {
		   System.out.println("Dubai Mall");
	   }
	   System.out.println();
	   System.out.println("How many people you want to book for:");
	   int peps = scan.nextInt();
	   Total_Cost=Total_Cost*peps;
	   System.out.println("Total Cost for the places you've selected to visit is: AED "+Total_Cost);
	   	   
   }
   
   	void forAUH()
   	{  
   		double Total_Cost=0;
		System.out.println();
   System.out.println("Places for Visit:");
   System.out.println("SHEIKH ZAYED MOSQUE");
   System.out.println("Sheikh Zayed Mosque is one of the best places to visit in Abu Dhabi."
   		+ "From its dome and minarets to its carpets and chandeliers, every single foot of Sheikh Zayed Mosque reminds the "
   		+ "lavishness of the Arab world and an amalgamation of Persian,"
   		+ " Moorish and Mughal architectures.");
   System.out.println("Price: No entry fee");
   System.out.println("Press y/n for confirmation");
   char dec1 = scan.next().charAt(0);
   if(dec1 == 'y')
   {
	  Total_Cost = Total_Cost+0;
   }
   
   
    System.out.println();
   System.out.println("FERRARI WORLD");
   System.out.println("Ferrari World comes across the most popular places to visit in Abu Dhabi, "
   		+ "it is ones among the list of thrilling rides here are Flying Aces,  Turbo Track, Scuderia Challenge,"
   		+ " and the world’s fastest roller coaster – Formula Rossa. Numerous events are also held at Ferrari World.");
   System.out.println("Price: AED 249.97");
   System.out.println("Press y/n for confirmation");
   char dec2 = scan.next().charAt(0);
   if(dec2 == 'y')
   {
	  Total_Cost = Total_Cost+249.97;
   }
   
   
   System.out.println();
   System.out.println("EMIRATES PARK ZOO");
   System.out.println(" This zoo in Abu Dhabi gives you an opportunity to come across a wide range of wildlife species."
   		+ " There are 1,700 animals in total which include species like White Tiger, Siberian Bear, Lion, and Cheetah, among many others");
   System.out.println("Price: AED 74.46");
   System.out.println("Press y/n for confirmation");
   char dec3 = scan.next().charAt(0);
   if(dec3 == 'y')
   {
	  Total_Cost = Total_Cost+74.46;
   }
   
   System.out.println();
   System.out.println("LOUVRE MUSEUM");
   System.out.println("The museum showcases artwork from across the globe including works of Leonardo Da Vinci, Vincent Van Gogh, Claude Monet, Jacques-Louis David and Henri Matisse among others. "
   		+ "Not only the artwork but the architecture of the building itself with a floating dome-shaped structure is something not to be missed.");
   System.out.println("Price: AED 63");
   System.out.println("Press y/n for confirmation");
   char dec4 = scan.next().charAt(0);
   if(dec4 == 'y')
   {
	  Total_Cost = Total_Cost+63;
   }
   
   System.out.println();
   System.out.println("WARNER BROS WORLD");
   System.out.println("Different features of the park have been inspired by different Warner Bros. "
   		+ "franchises like Looney Tunes, DC Comics and Hanna Barbra amongst others. "
   		+ "Some of the rides include The Joker Funhouse, Tom and Jerry: Swiss Cheese Spin, The Jetsons Cosmic Orbiter, Scooby-Doo ");
   System.out.println("Price: AED 250");
   char dec5 = scan.next().charAt(0);
   if(dec5 == 'y')
   {
	  Total_Cost = Total_Cost+250;
   }
   
   
      System.out.println();
   System.out.println("Places you've selected to visit:");
   if(dec1=='y') {
	   System.out.println("Sheikh Zayed Mosque");
   }
   if(dec2=='y') {
	   System.out.println("Ferrari World");
   }
   if(dec3=='y') {
	   System.out.println("Emirated Park Zoo");
   }
   if(dec4=='y') {
	   System.out.println("Louvre Museum");
   }
   if(dec5=='y') {
	   System.out.println("Warner Bros World");
   }
   
   System.out.println();
   System.out.println("How many people you want to book for:");
   int peps = scan.nextInt();
   Total_Cost=Total_Cost*peps;
   
   System.out.println("Total Cost for the places you've selected to visit is: AED "+Total_Cost);
   	   

   }
   	
   	
   	
   	void forRAK()
   	{  
   		double Total_Cost=0;
		System.out.println();
   System.out.println("Places for Visit:");
   System.out.println("JEBEL JAIS");
   System.out.println("About 55 kilometers northeast of Ras Al-Khaimah, "
   		+ "Jebel Jais, part of the Hajar Mountain Range, is the United Arab Emirates' "
   		+ "tallest mountain, with its summit at 1,934 meters.");
   System.out.println("Price: AED 125.75");
   System.out.println("Press y/n for confirmation");
   char dec1 = scan.next().charAt(0);
   if(dec1 == 'y')
   {
	  Total_Cost = Total_Cost+125.75;
   }
   
   
    System.out.println();
   System.out.println("RAS-AL-KHAIMAH NATIONAL MUSUEM");
   System.out.println("The Ras Al-Khaimah National Museum is in a fort that was the residence of the ruling "
   		+ "family up until the early 1960s. "
   		+ "The museum houses an excellent collection of archaeological and ethnological artifacts.");
   System.out.println("Price: AED 5");
   System.out.println("Press y/n for confirmation");
   char dec2 = scan.next().charAt(0);
   if(dec2 == 'y')
   {
	  Total_Cost = Total_Cost+5;
   }
   
   
   System.out.println();
   System.out.println("RAS AL KHAIMAH BEACHES");
   System.out.println(" Ras Al-Khaimah has plenty for sun seekers and relaxation fans. "
   		+ "The emirate's long shoreline is strung with luxury resorts all offering their own private patch of golden sand.");
   System.out.println("Price: FREE");
   System.out.println("Press y/n for confirmation");
   char dec3 = scan.next().charAt(0);
   if(dec3 == 'y')
   {
	  Total_Cost = Total_Cost+0;
   }
   
   
   
   System.out.println();
   System.out.println("Places you've selected to visit:");
   if(dec1=='y') {
	   System.out.println("Jebel Jais");
   }
   if(dec2=='y') {
	   System.out.println("Ras-Al-Khaimah National Musuem");
   }
   if(dec3=='y') {
	   System.out.println("Ras-Al-Khaimah Beaches");
	      }
   System.out.println();
   System.out.println("How many people you want to book for:");
   int peps = scan.nextInt();
   Total_Cost=Total_Cost*peps;
   System.out.println("Total Cost for the places you've selected to visit is: AED "+Total_Cost);
   	
   
   }
   	
   	
   	
   	void forFUJ()
   	{
   		double Total_Cost=0;
		System.out.println();
   System.out.println("Places for Visit:");
   System.out.println("FUJAIRAH FORT");
   System.out.println("Considered the oldest fort in the United Arab Emirates, "
   		+ "it has served previously as both a defensive building and a home for the ruling family. "
   		+ "And for many centuries, it was the only stone building along the Fujairah coast. ");
   System.out.println("Price: AED 5");
   System.out.println("Press y/n for confirmation");
   char dec1 = scan.next().charAt(0);
   if(dec1 == 'y')
   {
	  Total_Cost = Total_Cost+5;
   }
   
   
    System.out.println();
   System.out.println("AL AQAH BEACH");
   System.out.println(" Al Aqah beach, dominated by the rocky outcrop of "
   		+ "\"Snoopy Island\" just offshore, is the emirate of Fujairah's top beach resort.");
   System.out.println("Price: AED 300");
   System.out.println("Press y/n for confirmation");
   char dec2 = scan.next().charAt(0);
   if(dec2 == 'y')
   {
	  Total_Cost = Total_Cost+300;
   }
   
   
   System.out.println();
   System.out.println("Fujairah Museum");
   System.out.println(" the Fujairah Museum has an excellent collection of artifacts, dating from the early Bronze Age, "
   		+ "that were unearthed during archaeological digs at Qidfa and Bithnah.");
   System.out.println("Price: AED 10");
   System.out.println("Press y/n for confirmation");
   char dec3 = scan.next().charAt(0);
   if(dec3 == 'y')
   {
	  Total_Cost = Total_Cost+10;
   }
   
   
   
   System.out.println();
   System.out.println("Places you've selected to visit:");
   if(dec1=='y') {
	   System.out.println("Fujairah Fort");
   }
   if(dec2=='y') {
	   System.out.println("Al Aqah Beach");
   }
   if(dec3=='y') {
	   System.out.println("Fujairah Museum");
	      }
   System.out.println();
   System.out.println("How many people you want to book for:");
   int peps = scan.nextInt();
   Total_Cost=Total_Cost*peps;
   System.out.println("Total Cost for the places you've selected to visit is: AED "+Total_Cost);
   	
   		
   		
   	}
   	
   	
   	
   	      	
}

