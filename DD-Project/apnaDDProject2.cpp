// Include the Keypad library
#include <Keypad.h>
#include <LiquidCrystal_I2C.h>

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
 
void setup() {
  // Setup serial monitor
  Serial.begin(9600);
  pinMode(RELAY_PIN,OUTPUT);
  lcd.init();   // LCD screen
  lcd.backlight();
  lcd.clear();
}
 
void loop() {
  // Get key value if pressed
  char customKey = customKeypad.getKey();
  
  uint8_t count = 0; 
  // if (customKey) {
    // Print key value to serial monitor
  // Serial.println(customKey);

  // char Key = customKeypad.getKey();
  
  while(count != 5){
  if ( customKey != '\0') 
  {	
	// LCD initial display
	lcd.setCursor(0, 0);
    	lcd.print("   Door currently Locked");
    	lcd.setCursor(0, 1);
    	lcd.print(" Enter Password ");

        if(customKey == '*')
        {
	  // LCD Conditionals
	  lcd.clear();
	  lcd.setCursor(0, 0);
       	  lcd.print("   Door unlocked!");

          digitalWrite(RELAY_PIN, HIGH);
          delay(200);
          digitalWrite(RELAY_PIN, LOW);
          delay(200);
	  break;
        }
    
        else {
	  lcd.clear();
	  lcd.setCursor(0, 0);
          lcd.print("Wrong Password");
	  count++;
        }
   }
 }


    
  }
