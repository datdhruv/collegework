import java.util.ArrayList;
import java.util.Scanner;
class Restraunt{
    public String name, email_id, ph_no, location, description, emirate;
    public int star, people, option;
    public double avg_cost;

    public Restraunt(String name,String email_id,String ph_no,String location,String description,String emirate,int star,int people,int option, double avg_cost){
    this.name = name;
	this.email_id = email_id;
	this.ph_no = ph_no;
	this.location = location;
	this. description = description;
	this.emirate = emirate;
	this.star = star;
	this.people = people;
	this.option = option;
    }
    
    public Restraunt(){}

    void Display(){
    	System.out.println(name + email_id + ph_no + location + description + emirate + star + people + option + avg_cost);
    }
}

class InitRestraunt{
    ArrayList<Restraunt> Dubai;
    
    public InitRestraunt(){

	ArrayList<Restraunt> Dubai = new ArrayList<Restraunt>();
	
	Dubai.add(new Restraunt("Roda Grill Dining", "rodagrilldining@gmail.com", "5043412345", "Popular Dishes\n" + "Chocolate Souffle, Jumbo Prawns, Grilled Salmon, Lobster, Sea Food, Wine\n " + "People Say This Place Is Known For\n" + "Cozy Setting, Modern Vibe, Sophisticated, Worth the Price, Fancy Crowd, Waitress","","",3,3,3,  550.0));
    }

    public void choose(){

	Scanner scan = new Scanner(System.in);
    System.out.println("Choose Emirate");
	ArrayList<Restraunt> emirate = null;
	int choice = scan.nextInt();
	switch(choice){
		case 1: emirate = Dubai;
		    System.out.println(emirate);
			break;
		//case 2: emirate = AbuDhabi;
		//	break;
	}
	System.out.println(emirate);
	System.out.println("Choose Restraunt");
	choice = scan.nextInt();
	Restraunt restraunt = new Restraunt();
	int count = 1;
	for (Restraunt i : emirate){
		System.out.println(count + " " +i); //check
	}
	switch(choice){
		case 1: restraunt = Dubai.get(0);
	}

	restraunt.Display();
    }


// similiarly keep adding whatever number you want;

// show choice for emirate
//
// then show choice for restraunts in emirate
//
// then show option to choose

}

public class Main{
    public static void main(String args[]){
        InitRestraunt avani = new InitRestraunt();
        avani.choose();
        
    }
    
}


