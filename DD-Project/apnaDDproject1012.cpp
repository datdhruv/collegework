#include <SPI.h>
#include <MFRC522.h>
#include <Servo.h>
#include <Keypad.h>
#include <LiquidCrystal_I2C.h>




#define SS_PIN A1 //10 A1
#define RST_PIN A0 //9 A0
#define BUZZER 1 //buzzer pin
MFRC522 mfrc522(SS_PIN, RST_PIN);   // Create MFRC522 instance.
Servo myServo;   //define servo name


// Initialize LCD Display
LiquidCrystal_I2C lcd(0x27, 16, 2);

// Constants for row and column sizes
const byte ROWS = 4;
const byte COLS = 4;
const int RELAY_PIN = 10;
int count=0;
 
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
 
 
void setup() 
{
    // Setup serial monitor
  Serial.begin(9600);
  pinMode(RELAY_PIN,OUTPUT);
  pinMode(13,OUTPUT);
  lcd.init();   // LCD screen
  lcd.backlight();
  lcd.clear();
  
  //Serial.begin(9600);   // Initiate a serial communication
  SPI.begin();      // Initiate  SPI bus
  mfrc522.PCD_Init();   // Initiate MFRC522
  //myServo.attach(3); //servo pin
  //myServo.write(0); //servo start position
  //pinMode(LED_G, OUTPUT);
 // pinMode(LED_R, OUTPUT);
  pinMode(BUZZER, OUTPUT);
  noTone(BUZZER);
  Serial.println("Put your card to the reader...");
  Serial.println();

}


void loop() 
{
  rfid_unlock();
  pass_unlock();
 }

 void rfid_unlock(){
    lcd.clear();
    lcd.setCursor(0, 0);
    lcd.print("   Door currently Locked");
      // Look for new cards
      if ( ! mfrc522.PICC_IsNewCardPresent()) 
      {
        return;
        }
         // Select one of the cards
      if ( ! mfrc522.PICC_ReadCardSerial()) 
      {
        return;
      }
        //Show UID on serial monitor
        Serial.print("UID tag :");
        String content= "";
         byte letter;
         for (byte i = 0; i < mfrc522.uid.size; i++) 
          {
              Serial.print(mfrc522.uid.uidByte[i] < 0x10 ? " 0" : " ");
              Serial.print(mfrc522.uid.uidByte[i], HEX);
              content.concat(String(mfrc522.uid.uidByte[i] < 0x10 ? " 0" : " "));
              content.concat(String(mfrc522.uid.uidByte[i], HEX));
           }
           
            Serial.println();
            Serial.print("Message : ");
            content.toUpperCase();
            if (content.substring(1) == "29 D8 69 40" || content.substring(1) == "F9 4A CC 98" ) //change here the UID of the card/cards that you want to give access
              {
                  Serial.println("Authorized access");
                  Serial.println();
                  delay(500);
                  //digitalWrite(LED_G, HIGH);
                  tone(BUZZER, 500);
                  //delay(300);
                  noTone(BUZZER);
                 // delay(5000);
                  digitalWrite(RELAY_PIN, HIGH);
                  delay(2000);
                  digitalWrite(RELAY_PIN, LOW);
                  delay(2000);
                  
                  //digitalWrite(LED_G, LOW);
              }
 
           else   {
                      Serial.println(" Access denied");
                      //digitalWrite(LED_R, HIGH);
                      tone(BUZZER, 300);
                       delay(1000);
                        //digitalWrite(LED_R, LOW);
                      noTone(BUZZER);
                   }
 
 } 

 void pass_unlock(){
   char customKey = customKeypad.getKey();

         //lcd will prolly go here
          // LCD initial display
    lcd.setCursor(0, 0);
    lcd.print("   Door currently Locked");
 


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
          delay(2000);
          digitalWrite(RELAY_PIN, LOW);
          delay(2000);
        }
    
        else
        {

          lcd.clear();
           lcd.setCursor(0, 0);
          lcd.print("Wrong Password");

          Serial.println("Invalid input");
          Serial.println(count);
          count++;

         // lcd.setCursor(1, 0);
         //lcd.print(3-count + "attempts left");

              if(count >= 3)
              {
                digitalWrite(BUZZER, HIGH);
                delay(1000);
                digitalWrite(BUZZER, LOW);
                delay(1000);
              }      
         }
   
 }