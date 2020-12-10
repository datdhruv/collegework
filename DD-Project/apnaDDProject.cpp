// Include the Keypad library
#include <Keypad.h>
#include <LiquidCrystal_I2C.h>

#define password_length 8
 
// Initialize LCD Display
LiquidCrystal_I2C lcd(0x27, 16, 2);

// Constants for row and column sizes
const byte ROWS = 4;
const byte COLS = 4;
const int RELAY_PIN = 10;

// Array to represent keys on keypad
char hexaKeys[ROWS][COLS] = {
  {'1', '2', '3', 'A'},
  {'4', '5', '6', 'B'},
  {'7', '8', '9', 'C'},
  {'*', '0', '#', 'D'}
};
 
// Connections to Arduino
byte rowPins[ROWS] = {9, 8, 7, 6};
byte colPins[COLS] = {5, 4, 3, 2};
 
// Create keypad object
Keypad customKeypad = Keypad(makeKeymap(hexaKeys), rowPins, colPins, ROWS, COLS);

int count=0;

char password[password_length] = {'1','2','3','4'};
char data[password_length];

bool correct_password = false;
 
void setup() {
  // Setup serial monitor
  Serial.begin(9600);
  pinMode(RELAY_PIN,OUTPUT);
  pinMode(13,OUTPUT);
  lcd.init();   // LCD screen
  lcd.backlight();
  lcd.clear();

}
 
void loop() {
  // Get key value if pressed
  correct_password = true;
  for (int i=0; i< password_length;i++){
  	data[i] = customKeypad.getKey();
	if (data[i] == password[i]){continue;}
	else (correct_password = false;)
  }

  /* //lcd will prolly go here
  	// LCD initial display
	lcd.setCursor(0, 0);
    	lcd.print("   Door currently Locked");
    	lcd.setCursor(0, 1);
    	lcd.print(" Enter Password ");
*/
  if ( data[0] != '\0') 
  {

	// LCD initial display
	lcd.setCursor(0, 0);
    	lcd.print("   Door currently Locked");
    	lcd.setCursor(0, 1);
    	lcd.print(" Enter Password ");


        if(correct_password)
        {
	
       	  // LCD Conditionals
	  lcd.clear();
	  lcd.setCursor(0, 0);
       	  lcd.print("   Door unlocked!");


          digitalWrite(RELAY_PIN, HIGH);
          delay(2000);
          digitalWrite(RELAY_PIN, LOW);
          delay(2000);
	  count = 0;
        }
    
        else
        {

	  lcd.clear();
	  lcd.setCursor(0, 0);
          lcd.print("Wrong Password");
	  count++;

          //Serial.println("Invalid input");
          //Serial.println(count);

	  //lcd.print(3-count + "attempts left");

/*	  we give the user three attempts to unlock the code,
 *	  if he cannot unclock within three times, the buzzer buzzes
 *	  and the unlock code changes accordingly
 */
          if(count >= 3)
          {
		  // buzz accoriding to number of incorect attempts
		  for (int i = 0; i<count;i++){
            		digitalWrite(13, HIGH);
            		delay(1000);
            		digitalWrite(13, LOW);
            		delay(1000);
		  }

          	// change the passcode

		}
	  }      
       
	}
   }
 }
