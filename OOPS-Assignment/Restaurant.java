

import java.util.ArrayList;
import java.util.Scanner;

public class Main{
    public static void main(String args[]){
        
        Scanner input = new Scanner(System.in);

        Restaurant r = new Restaurant();
        r.check();
        r.choose();
        
    }
}
class Restaurant {
    public String name, email_id, ph_no, location, description, emirate;
    public int star, option;
    public double avg_cost;

    ArrayList<Restaurant> Dubai= new ArrayList <Restaurant>();
    ArrayList <Restaurant> AbuDhabi= new ArrayList <Restaurant>();
    ArrayList <Restaurant> Fujairah= new ArrayList <Restaurant>();
    ArrayList <Restaurant> RasAlKhaimah= new ArrayList <Restaurant>();
    ArrayList <Restaurant> Emirate;

    public Restaurant(){

    }

    public Restaurant(String name, String email_id, String ph_no, String location, String description,
                      String emirate, int star, int option, double avg_cost){
        this.name = name;
        this.email_id = email_id;
        this.ph_no = ph_no;
        this.location = location;
        this.description = description;
        this.emirate = emirate;
        this.star = star;
        this.option = option;
        this.avg_cost = avg_cost;
    }

    void check(){

        // for dubai
        Restaurant RodaGrillDining = new Restaurant("Roda Grill Dining", "rodagrilldining@gmail.com",
                "5043412345", "Downtown", "Popular Dishes\n" +
                "Chocolate Souffle, Jumbo Prawns, Grilled Salmon, Lobster, Sea Food, Wine\n " + "People Say This Place Is Known For\n" +
                "Cozy Setting, Modern Vibe, Sophisticated, Worth the Price, Fancy Crowd, Waitress", "Dubai",
                3, 1, 250.0);
        Dubai.add(RodaGrillDining);

        Restaurant TheCheesecakeFactory = new Restaurant("The Cheesecake Factory", "thecheesecakefactory@gmail.com",
                "5087792526", "Jumeirah", "Popular Dishes\n" +
                "Cheescakes, Steak Diane, Chicken Madeira, Godiva Chocolate Cheesecake, " + "Bang Bang Chicken, Salted Caramel Cake\n" +
                "\n" + "People Say This Place Is Known For\n" + "Free Refills, Family Favorite, Big Serving, Huge Place, Large Portions, " +
                "Efficient Service", "Dubai", 3, 2, 275.0);
        Dubai.add(TheCheesecakeFactory);

        Restaurant CALIPOKECaliforniaSeafoodHouse = new Restaurant("CALI-POKE California Seafood House", "calipoke@gmail.com",
                "5056826985", "Zaabeel", "Popular Dishes\n" +
                "Sushi Taco, Coconut Drink, Seaweed Salad, Tempura Shrimp, Acai Smoothie, " + "California Roll\n" + "\n" +
                "People Say This Place Is Known For\n" + "Super Fast Delivery, Spill Proof Packaging, Vegan, Bowls, Cute Packaging, " +
                "Perfect Presentation", "Dubai", 3, 3, 180.0);
        Dubai.add(CALIPOKECaliforniaSeafoodHouse);

        Restaurant DinTaiFung = new Restaurant("Din Tai Fung", "dintaifung@gmail.com",
                "508788752", "Downtown", "Popular Dishes\n" +
                "Spicy Dumpling, Truffle Dim Sum, Xiaolongbao, Beef Noodle, Fried Rice Chicken, Crispy " + "Beef\n" + "\n" +
                "People Say This Place Is Known For\n" + "Everything was very Good, Service and Quality of Food, " +
                "Gastronomical Experience, Staff " + "Service, Comfortable Seating Area, Young Crowd",
                "Dubai", 4, 1, 360.0);
        Dubai.add(DinTaiFung);

        Restaurant Kamat = new Restaurant("Kamat", "kamat@gmail.com",
                "507659294", "Jumeirah", "Known For\n" +
                "An extensive array of vegetarian delicacies from North Indian, South Indian and " +
                "Indo-Chinese cuisines\n Popular Dishes\n" +
                "Andhra Masala Dosa, Dal Kichadi, Sambar, Dosa, Pav Bhaji, Thali\n" + "\n" + "People Say This Place Is Known For\n" +
                "Themed Decor, Relaxed Atmosphere, Courteous Staff, Good Ambience, Tasty Food, " +
                "Breakfast", "Dubai", 4, 2, 400.0);
        Dubai.add(Kamat);

        Restaurant NandostheDubaiMall = new Restaurant("Nando's - the Dubai Mall", "nandos@gmail.com",
                "502587732", "Zaabeel", "Popular Dishes\n" +
                "Espetada Carnival, Garlic Bread, Cheesecake, Chicken, Drink\n" + "\n" + "People Say This Place Is Known For\n" +
                "The Service, Excellent View, Good Service Good Quality, Served Us Perfectly, " +
                "Service is Great and Fast, Sitting Area", "Dubai", 4, 3, 300.0);
        Dubai.add(NandostheDubaiMall);

        Restaurant SocialHouse = new Restaurant("Social House", "socialhouse@gmail.com",
                "50258792", "Downtown", "Popular Dishes\n" +
                "Basil Cooler, Nacho Pizza, Eggs Benny, Mie Goreng, Chilli Garlic Prawns, Nasi " +
                "Goreng Chicken\n" + "\n" + "People Say This Place Is Known For\n" +
                "Wooden Interiors, Location of the Restaurant, Burj Khalifa View, Cozy Ambience, " +
                "Perfect View, Best View", "Dubai", 5, 1, 475.0);
        Dubai.add(SocialHouse);

        Restaurant Markette = new Restaurant("Markette", "markette@gmail.com",
                "508729732", "Jumeirah", "Popular Dishes\n" +
                "Mama Mia Burger, Sweet Crepe, Chilli Cheese Fries, Healthy Breakfast, Meatballs, " + "Club Sandwich\n" +
                "\n" + "People Say This Place Is Known For\n" + "Great Food Great Service, Ample Seating Area, Good View, " +
                "Family Place, Nice View, " + "Friendly Service", "Dubai", 5, 2, 500.0);
        Dubai.add(Markette);

        Restaurant ShakespeareandCotheDubaiMall = new Restaurant("Shakespeare and Co. - the Dubai Mall", "rodagrilldining@gmail.com",
                "5043412345", "Zaabeel", "Popular Dishes\n" + "Chocolate Souffle, Jumbo Prawns, " +
                "Grilled Salmon, Lobster, Sea Food, Wine\n " + "People Say This Place Is Known For\n" +
                "Cozy Setting, Modern Vibe, Sophisticated, Worth the Price, Fancy Crowd, Waitress", "Dubai",
                5, 3, 600.0);
        Dubai.add(ShakespeareandCotheDubaiMall);

        // for abu dhabi

        Restaurant AlloBeirut = new Restaurant("Allo Beirut", "allobeirut@gmail.com",
                "504628756", "Yas", "Popular Dishes\n" +
                "Chocolate Souffle, Jumbo Prawns, Grilled Salmon, Lobster, Sea Food, Wine\n " + "People Say This Place Is Known For\n" +
                "Cozy Setting, Modern Vibe, Sophisticated, Worth the Price, Fancy Crowd, Waitress", "Abu Dhabi",
                3, 1, 250.0);
        AbuDhabi.add(AlloBeirut);

        Restaurant ClintonStreetBakingCompany = new Restaurant("Clinton Street Baking Company", "clintonstreet@gmail.com",
                "5028579223", "Markaziya", "Popular Dishes\n" + "Bottomless Coffee, Country Breakfast, " +
                "Eggs Florentine, Crab Cake, Egg Benedict," + " Pancake\n" + "\n" + "People Say This Place Is Known For\n" +
                "Good Quality Food, Breakfasts, Ample Seating Area, Relaxed Atmosphere, " + "Good for Large Groups, Big Portions",
                "Abu Dhabi", 3, 2, 190.0);
        AbuDhabi.add(ClintonStreetBakingCompany);

        Restaurant Mmmbox = new Restaurant("Mmmbox", "mmmbox@gmail.com",
                "503562995", "Khalidiya", "Popular Dishes\n" +
                "Wasabi Sushi, Asparagus Sushi, Curry Crab, Spicy Salmon, Dimsum, Dumplings\n" +
                "\n" +
                "People Say This Place Is Known For\n" +
                "Everything is Perfect, Wonderful Presentation, Cute Packaging, Comfortable " +
                "Seating Area, Food Presentation, Extensive Menu", "Abu Dhabi", 3, 3, 130.0);
        AbuDhabi.add(Mmmbox);

        Restaurant LadsBurger = new Restaurant("Lads Burger", "ladsburger@gmail.com",
                "505862909", "Yas", "Popular Dishes\n" +
                "Wagyu Beef Burger, Coleslaw Salad, Chicken Escalope, Classic Burger, Nutella " +
                "Crepe, Wagyu\n" +
                "\n" +
                "People Say This Place Is Known For\n" +
                "Elegantly Decorated, Inexpensive, Value for Money, Prompt Service, Great " +
                "Recommendations, Polite Staff",
                "Abu Dhabi", 4, 1, 360.0);
        AbuDhabi.add(LadsBurger);

        Restaurant BrunchCake = new Restaurant("Brunch & Cake", "brunch@gmail.com",
                "505692879", "Markaziya", "Popular Dishes\n" +
                "Acai Bowl, Cheesecake, Desserts, Cake, Pizza\n" +
                "\n" +
                "People Say This Place Is Known For\n" +
                "Instagramable, Variety of Pizza, Great Presentation, Weekend Brunch, Service " +
                "is Great, Beautiful Interiors", "Abu Dhabi", 4, 2, 450.0);
        AbuDhabi.add(BrunchCake);

        Restaurant BottegaCafe = new Restaurant("Bottega Cafe", "bottega@gmail.com",
                "535782862", "Khalidiya", "People Say This Place Is Known For\n" +
                "Seaview, Good Pricing, Amazing Location, Brilliant Service, Wonderful Staff, " +
                "Best Staff", "Abu Dhabi", 4, 3, 300.0);
        AbuDhabi.add(BottegaCafe);

        Restaurant ItalianSalsa = new Restaurant("Italian Salsa", "salsa@gmail.com",
                "535699128", "Yas", "People Say This Place Is Known For\n" +
                "Prices, Menu, Taste, Experience, Food", "Abu Dhabi", 5, 1, 500.0);
        AbuDhabi.add(ItalianSalsa);

        Restaurant NamasteCuisine = new Restaurant("Namaste Cuisine", "namaste@gmail.com",
                "53679252", "Markaziya", "People Say This Place Is Known For\n" +
                "Friendly Staff, Ambiance, Quality, Service, Food", "Abu Dhabi", 5, 2, 600.0);
        AbuDhabi.add(NamasteCuisine);

        Restaurant AlAbra = new Restaurant("Al Abra", "alabra@gmail.com",
                "534768167", "Khalidiya", "Arabian cuisine\n" + "People Say This Place Is Known For\n" +
                "Comfortable Seating Area, Quick Service, Waiter, Location, Ambience, Food", "Abu Dhabi",
                5, 3, 650.0);
        AbuDhabi.add(AlAbra);


        // for ras al khaimah

        Restaurant PestoRistorante = new Restaurant("Pesto Ristorante", "pesto@gmail.com",
                "5365241411", "Nakheel", "Italian cuisine" + "People Say This Place Is Known For\n" +
                "Appetizers, Nice Ambience, Great Food, View, Ambiance, Quality", "Ras Al Khaimah",
                3, 1, 180.0);
        RasAlKhaimah.add(PestoRistorante);

        Restaurant Marjan = new Restaurant("Marjan", "marjan@gmail.com",
                "535762540", "Sidroh", "Moroccan cuisine" + "People Say This Place Is Known For\n" +
                "Meals, Menu, Food, Staff", "Ras Al Khaimah", 3, 2, 250.0);
        RasAlKhaimah.add(Marjan);

        Restaurant BelgianCafe = new Restaurant("Belgian Cafe", "belgiancafe@gmail.com",
                "535621499", "Hamra", "People Say This Place Is Known For\n" +
                "Good Atmosphere, Happy Hour, Great Location, Cafe, Nice Place, Good Place", "Ras Al Khaimah", 3, 3, 300.0);
        RasAlKhaimah.add(BelgianCafe);

        Restaurant Umi = new Restaurant("Umi", "umi@gmail.com",
                "535471694", "Nakheel", "People Say This Place Is Known For\n" +
                "Chef, Great Food, Ambience, Staff, Service","Ras Al Khaimah", 4, 1, 400.0);
        RasAlKhaimah.add(Umi);

        Restaurant LexingtonGrill = new Restaurant("Lexington Grill", "lexingtongrill@gmail.com",
                "535707328", "Sidroh", "Popular Dishes\n" +
                "Chocolate Souffle, Oysters, Steak, Cake\n" +
                "\n" +
                "People Say This Place Is Known For\n" +
                "Decor, Chef, Portions, Customer Service, Server, Friendly Staff", "Ras Al Khaimah", 4, 2, 910.0);
        RasAlKhaimah.add(LexingtonGrill);

        Restaurant Piaceri = new Restaurant("Piaceri", "piaceri@gmail.com",
                "537468447", "Hamra", "Italian cuisine" +"People Say This Place Is Known For\n" +
                "Customizable Food, Good Quality, Fresh Food, Elaborate Menu, Taste, Staff", "Ras Al Khaimah", 4, 3, 250.0);
        RasAlKhaimah.add(Piaceri);

        Restaurant AlMaeda = new Restaurant("Al Maeda", "almaeda@gmail.com",
                "534756885", "Nakheel", "Known For\n" +
                "Make your way to the newest and one of Ras Al Khaimah's most outstanding " +
                "contemporary Lebanese inspired restaurant - Al Maeda. Be entranced by the taste," +
                " color and aroma of the Levant. Gather family and friends to sample delicious " +
                "dishes including the smoked lamb Frikih and Fish Saiyadiah", "Ras Al Khaimah", 5, 1, 475.0);
        RasAlKhaimah.add(AlMaeda);

        Restaurant BellaVenezia = new Restaurant("Bella Venezia", "bellavenezia@gmail.com",
                "53845728", "Sidroh", "Italian cuisine\n" + "People Say This Place Is Known For\n" +
                "Good Wifi, Customizable Food, Elaborate Menu, Fresh Food, Worth the Money, Good Quality", "Ras Al Khaimah", 5, 2, 700.0);
        RasAlKhaimah.add(BellaVenezia);

        Restaurant Podium = new Restaurant("Podium", "podium@gmail.com",
                "535878442", "Hamra", "American cuisine\n" +"People Say This Place Is Known For\n" +
                "Student Crowd, Friendly Service, Vibe, Breakfast, Bread, Nice Place", "Ras Al Khaimah",
                5, 3, 600.0);
        RasAlKhaimah.add(Podium);


        // for fujairah

        Restaurant Sharkeys = new Restaurant("Sharkeys", "sharkeys@gmail.com",
                "52792521", "City", "European cuisine\n"+ "People Say This Place Is Known For\n" +
                "Great Food and Service, Ambience was Super Cool, Customizable Dishes, Clean, " +
                "Good Wifi, Weekend Brunch", "Fujairah",
                3, 1, 250.0);
        Fujairah.add(Sharkeys);

        Restaurant Mammone = new Restaurant("Mammone", "mammone@gmail.com",
                "524768232", "Aqah", "Italian cuisine\n"+ "People Say This Place Is Known For\n" +
                "Great Food and Service, Ambience was Super Cool, Customizable Dishes, Clean, " +
                "Good Wifi, Weekend Brunch", "Fujairah", 3, 2, 275.0);
        Fujairah.add(Mammone);

        Restaurant Breeze = new Restaurant("Breeze", "breeze@gmail.com",
                "525764312", "Dibba", "People Say This Place Is Known For\n" +
                "View, Breakfast, Experience, Staff, Food, Service", "Fujairah", 3, 3, 200.0);
        Fujairah.add(Breeze);

        Restaurant AlNokhada = new Restaurant("Al Nokhada", "alnokhada@gmail.com",
                "52562423", "City", "People Say This Place Is Known For\n" +
                "Cutlery, Live Music, Interior, Decor, Taste, Service",
                "Fujairah", 4, 1, 360.0);
        Fujairah.add(AlNokhada);

        Restaurant TheLounge = new Restaurant("TheLounge", "lounge@gmail.com",
                "52572323", "Aqah", "Continental cuisine\n" + "People Say This Place Is Known For\n" +
                "Efficient Service, Amazing Hospitality, " + "Lovely Food, Warm Service", "Fujairah", 4, 2, 400.0);
        Fujairah.add(TheLounge);

        Restaurant Canvas = new Restaurant("Canvas", "canvas@gmail.com",
                "525471466", "Dibba", "Indian, European cuisine\n" + "People Say This Place Is Known For\n" +
                "Friendly Staff, Ambience, Food, Service", "Fujairah", 4, 3, 450.0);
        Fujairah.add(Canvas);

        Restaurant Marina = new Restaurant("Marina", "marina@gmail.com",
                "525707342", "City", "Italian cuisine\n" + "People Say This Place Is Known For\n" +
                "Friendly Staff, Ambience, Food, Service", "Fujairah", 5, 1, 525.0);
        Fujairah.add(Marina);

        Restaurant GrandBleu = new Restaurant("Grand Bleu", "grandbleu@gmail.com",
                "527946123", "Aqah", "People Say This Place Is Known For\n" +
                "Main Course, Presentation, View, Atmosphere, Delicious Food, Taste", "Fujairah", 5, 2, 600.0);
        Fujairah.add(GrandBleu);

        Restaurant LavaDining = new Restaurant("Lava Dining", "lavadining@gmail.com",
                "5257223", "Dibba", "European cuisine\n" + "People Say This Place Is Known For\n" +
                "Friendly Staff, Ambience, Food, Service", "Fujairah", 5, 3, 700.0);
        Fujairah.add(LavaDining);
    }

    public void choose(){
        Scanner input = new Scanner(System.in);
        int ch=0, emi=0, st=0;

        do {
            System.out.println("Would you like to see the restaurant options?(1-yes, 2-no): ");
            ch = input.nextInt();

            System.out.println("In which emirate are you staying?(1-Dubai, 2-Abu Dhabi, 3-Ras Al Khaimah, 4-Fujairah): ");
            emi = input.nextInt();

            /*System.out.println("In what class restaurant would you like to eat?(stars from 3-5): ");
            st = input.nextInt();*/

            Restaurant res = new Restaurant();

            switch (emi){
                case 1: Emirate = Dubai;

                Emirate.get(0).display();
                    break;
                case 2: Emirate = AbuDhabi;

                    Emirate.get(0).display();
                    break;
                case 3: Emirate = RasAlKhaimah;

                    Emirate.get(0).display();
                    break;
                case 4: Emirate = Fujairah;
                    
                    Emirate.get(0).display();
                default:
                    System.out.println("invalid emirate");
            }
            switch(st){
                case 3: star = 3;
                break;
                case 4: star = 4;
                break;
                case 5: star = 5;
                break;
                default:
                    System.out.println("invalid star");
            }

        } while(ch==1);
    }


    public void display(){
        System.out.println("name: " + name);
        System.out.println("email id: " + email_id);
        System.out.println("phone no: " + ph_no);
        System.out.println("description: " + description);
        System.out.println("average cost for 2 people: " + avg_cost + " AED");
        System.out.println();
    }
}


