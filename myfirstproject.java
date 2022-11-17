package myfirstproject;

import javax.swing.JOptionPane;

public class myfirstproject {
public static void main(String[] args) {
int computerNumber = (int) (Math.random()*100 + 1) ;
int userAnswer = 0 ;
System.out.println("La bonne réponse est" + computerNumber) ;
int count = 1 ;
int compte = 0;
while (userAnswer != computerNumber)
{
    String response = JOptionPane.showInputDialog(null,
        "Entrez une estimation entre 1 et 100", "Guessing Game", 3) ;
    userAnswer = Integer.parseInt(response) ;
    JOptionPane.showMessageDialog(null, ""+ determineGuess(userAnswer, computerNumber, count)) ;
    
	compte++ ;
}  
}

public static String determineGuess(int userAnswer, int computerNumber, int count){
String nombre;
if (userAnswer <=0 || userAnswer >100) {
    return "Your guess is invalid" ;
}
else if (userAnswer == computerNumber ){
    return ("Correct!\nTotal Devices : " + count) ;
}
else if (userAnswer > computerNumber) {
    return ("Votre réponse est trop élevée, essayez à nouveau.\nNombre d'essais : " + count) ;
}
else if (userAnswer < computerNumber) {
    return ("Your guess is too low, try again.\nTry Number : " + count) ;
}
else {
    return ("Votre réponse est incorrecte\nTry Number : " + count) ;
}
}
}