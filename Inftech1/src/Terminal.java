
import java.io.*;
import java.util.*;

/***********************************************************************
* Diese Klasse stellt einige einfache Methoden zur Ein- und		
* Ausgabe auf einem Terminal zur Verf&uuml;gung.			
*	@author  P. Pepper und Gruppe					
*	@version 1.1							
************************************************************************/

public class Terminal {

/****************************************************************
* Gibt eine Zeichenkette aus.					
* @param text  die auszugebende Zeichenkette.			
****************************************************************/
    public static void print (String text) {
	System.out.print(text);
	System.out.flush();
    }

/****************************************************************
* Gibt eine Zeichenkette gefolgt von einem Zeilenumbruch aus.	
* @param text  die auszugebende Zeichenkette.			
****************************************************************/
    public static void println (String text) {
	System.out.println(text);
	System.out.flush();
    }

/****************************************************************
* Gibt einen booleschen Wert aus.				
* @param val  der auszugebende boolesche Wert.			
****************************************************************/
    public static void print (boolean val) { print(norm(val)); }

/****************************************************************
* Gibt eine booleschen Wert gefolgt von einem Zeilenumbruch aus.
* @param val  der auszugebende boolesche Wert.			
****************************************************************/
    public static void println (boolean val) { println(norm(val)); }

/****************************************************************
* Gibt ein Zeichen aus.						
* @param val  das auszugebende Zeichen.				
****************************************************************/
    public static void print (char val) { print(norm(val)); }

/****************************************************************
* Gibt ein Zeichen gefolgt von einem Zeilenumbruch aus.		
* @param val  das auszugebende Zeichen.				
****************************************************************/
    public static void println (char val) { println(norm(val)); }

/****************************************************************
* Gibt eine ganze Zahl aus.					
* (Kann auch mit byte und short aufgerufen werden.)		
* @param number  die auszugebende ganze Zahl.			
****************************************************************/
    public static void print (long number) { print(norm(number)); }

/****************************************************************
* Gibt eine ganze Zahl gefolgt von einem Zeilenumbruch aus.	
* (Kann auch mit byte und short aufgerufen werden.)		
* @param number  die auszugebende ganze Zahl.			
****************************************************************/
    public static void println (long number) { println(norm(number)); }

/***************************************************************
* Gibt eine Gleitpunktzahl(32 Bit) aus.				
* @param number  die auszugebende Gleitpunktzahl.		
****************************************************************/
    public static void print (float number) { print(norm(number)); }

/***************************************************************
* Gibt eine Gleitpunktzahl(32 Bit) gefolgt von einem		
* Zeilenumbruch aus.						
* @param number  die auszugebende Gleitpunktzahl.		
****************************************************************/
    public static void println (float number) { println(norm(number)); }

/***************************************************************
* Gibt eine Gleitpunktzahl(64 Bit) aus.				
* @param number  die auszugebende Gleitpunktzahl.		
****************************************************************/
    public static void print (double number) { print(norm(number)); }

/***************************************************************
* Gibt eine Gleitpunktzahl(64 Bit) gefolgt von einem		
* Zeilenumbruch aus.						
* @param number  die auszugebende Gleitpunktzahl.		
****************************************************************/
    public static void println (double number) { println(norm(number)); }



//***************************************************************
//***************************************************************
// Array-Ausgabe			 			 
//***************************************************************
//***************************************************************
//								 

/****************************************************************
* Gibt einen Array von ganzen Zahlen (32 Bit) aus.		
* @param array der auszugebende Array.				
****************************************************************/
    public static void print (int[] array) {
	System.out.print("{ ");
	for (int i = 0; i < array.length; i++) {
	    System.out.print(norm(array[i]));
	    if (i != array.length - 1) { System.out.print(", "); }
	}//for
	System.out.print(" }");
    }

/****************************************************************
* Gibt einen Array von ganzen Zahlen (32 Bit) gefolgt		
* von einem Zeilenumbruch aus.					
* @param array  der auszugebende Array.				
****************************************************************/
    public static void println (int[] array) {
	print(array);
	System.out.println();
	System.out.flush();
    }

/****************************************************************
* Gibt einen Array von ganzen Zahlen (64 Bit) aus.		
* @param array der auszugebende Array.				
****************************************************************/
    public static void print (long[] array) {
	System.out.print("{ ");
	for (int i = 0; i < array.length; i++) {
	    System.out.print(norm(array[i]));
	    if (i != array.length - 1) { System.out.print(", "); }
	}//for
	System.out.print(" }");
    }

/****************************************************************
* Gibt einen Array von ganzen Zahlen (64 Bit) gefolgt		
* von einem Zeilenumbruch aus.					
* @param array  der auszugebende Array.				
****************************************************************/
    public static void println (long[] array) {
	print(array);
	System.out.println();
	System.out.flush();
    }

/****************************************************************
* Gibt einen Array von Gleitpunktzahlen (32 Bit) aus.		
* @param array der auszugebende Array.				
****************************************************************/
    public static void print (float[] array) {
	System.out.print("{ ");
	for (int i = 0; i < array.length; i++) {
	    System.out.print(norm(array[i]));
	    if (i != array.length - 1) { System.out.print(", "); }
	}//for
	System.out.print(" }");
    }

/****************************************************************
* Gibt einen Array von Gleitpunktzahlen (32 Bit) gefolgt	
* von einem Zeilenumbruch aus.					
* @param array  der auszugebende Array.				
****************************************************************/
    public static void println (float[] array) {
	print(array);
	System.out.println();
	System.out.flush();
    }

/****************************************************************
* Gibt einen Array von Gleitpunktzahlen (64 Bit) aus.		
* @param array der auszugebende Array.				
****************************************************************/
    public static void print (double[] array) {
	System.out.print("{ ");
	for (int i = 0; i < array.length; i++) {
	    System.out.print(norm(array[i]));
	    if (i != array.length - 1) { System.out.print(", "); }
	}//for
	System.out.print(" }");
    }

/****************************************************************
* Gibt einen Array von Gleitpunktzahlen (64 Bit) gefolgt	
* von einem Zeilenumbruch aus.					
* @param array  der auszugebende Array.				
****************************************************************/
    public static void println (double[] array) {
	print(array);
	System.out.println();
	System.out.flush();
    }

/****************************************************************
* Gibt eine Matrix von ganzen Zahlen (32 Bit) aus.
* @param matrix  die auszugebende Matrix..
****************************************************************/
    public static void print (int[][] matrix) {
	System.out.print("{ ");
	for (int i = 0; i < matrix.length; i++) {
	    for (int j = 0; j < matrix[i].length; j++) {
		System.out.print(norm(matrix[i][j]));
		if (j != matrix[i].length - 1) {
		    System.out.print(", ");
		} else {
		    if (i != matrix.length - 1) {
			System.out.print(" / ");
		    }
		}
	    }
	}
	System.out.print(" }");
    }

/****************************************************************
* Gibt eine Matrix von ganzen Zahlen (64 Bit) aus.		
* @param matrix  die auszugebende Matrix..			
****************************************************************/
    public static void print (long[][] matrix) {
	System.out.print("{ ");
	for (int i = 0; i < matrix.length; i++) {
	    for (int j = 0; j < matrix[i].length; j++) {
		System.out.print(norm(matrix[i][j]));
		if (j != matrix[i].length - 1) {
		    System.out.print(", ");
		} else {
		    if (i != matrix.length - 1) {
			System.out.print(" / ");
		    }
		}
	    }
	}
	System.out.print(" }");
    }

/****************************************************************
* Gibt eine Matrix von Gleitpunktzahlen (32 Bit) aus.		
* @param matrix  die auszugebende Matrix..			
****************************************************************/
    public static void print (float[][] matrix) {
	System.out.print("{ ");
	for (int i = 0; i < matrix.length; i++) {
	    for (int j = 0; j < matrix[i].length; j++) {
		System.out.print(norm(matrix[i][j]));
		if (j != matrix[i].length - 1) {
		    System.out.print(", ");
		} else {
		    if (i != matrix.length - 1) {
			System.out.print(" / ");
		    }
		}
	    }
	}
	System.out.print(" }");
    }

/****************************************************************
* Gibt eine Matrix von Gleitpunktzahlen (64 Bit) aus		
* @param matrix  die auszugebende Matrix..			
****************************************************************/
    public static void print (double[][] matrix) {
	System.out.print("{ ");
	for (int i = 0; i < matrix.length; i++) {
	    for (int j = 0; j < matrix[i].length; j++) {
		System.out.print(norm(matrix[i][j]));
		if (j != matrix[i].length - 1) {
		    System.out.print(", ");
		} else {
		    if (i != matrix.length - 1) {
			System.out.print(" / ");
		    }
		}
	    }
	}
	System.out.print(" }");
    }

/****************************************************************
* Gibt eine Matrix von ganzen Zahlen (32 Bit) aus.
* gefolgt von einem Zeilenumbruch				
* @param matrix  die auszugebende Matrix..
****************************************************************/
    public static void println (int[][] matrix) {
	print(matrix);
	System.out.println();
	System.out.flush();
    }

/****************************************************************
* Gibt eine Matrix von ganzen Zahlen (64 Bit) aus.
* gefolgt von einem Zeilenumbruch				
* @param matrix  die auszugebende Matrix..
****************************************************************/
    public static void println (long[][] matrix) {
	print(matrix);
	System.out.println();
	System.out.flush();
    }

/***************************************************************
* Gibt eine Matrix von Gleitpunktzahlen (32 Bit) aus		
* gefolgt von einem Zeilenumbruch				
* @param matrix  die auszugebende Matrix..			
****************************************************************/
    public static void println (float[][] matrix) {
	print(matrix);
	System.out.println();
	System.out.flush();
    }

/***************************************************************
* Gibt eine Matrix von Gleitpunktzahlen (64 Bit) aus		
* gefolgt von einem Zeilenumbruch				
* @param matrix  die auszugebende Matrix..			
****************************************************************/
    public static void println (double[][] matrix) {
	print(matrix);
	System.out.println();
	System.out.flush();
    }

//***************************************************************
//								 
//  R E A D I N G						 
//								 
//***************************************************************

/***************************************************************
* Liest eine Zeichenkette vom Terminal.				
* @return das gelesene Zeichen.					
****************************************************************/
    public static String readString () {
	String line = "";
	BufferedReader R = new BufferedReader(
			       new InputStreamReader(System.in));
	try {
	    line = R.readLine();
	}
	catch (IOException e) { error1(); }
	return line;
    }

/****************************************************************
* Gibt eine Zeichenkette aus und erwartet die Eingabe einer	
* Zeichenkette.							
* @param prompt  die auszugebende Zeichenkette.			
* @return die eingegebene Zeichenkette.				
****************************************************************/
    public static String askString (String prompt) {
	print(prompt);
	return readString();
    }

/****************************************************************
* Gibt eine Zeichenkette aus und erwartet die Eingabe einer	
* Zeichenkette.							
* @param prompt  die auszugebende Zeichenkette.			
* @return die eingegebene Zeichenkette.				
****************************************************************/
    public static String ask (String prompt) {
	return askString(prompt);
    }

/****************************************************************
* Liest einen Wahrheitswert vom Terminal.			
* Die Zeichenkette "true" (unabh&auml;ngig von Gro&szlig;-/Kleinschreibung)
* liefert true, alles andere false.				
* @return der eingegebene Wert.					
****************************************************************/
    public static boolean readBoolean () {
	StringTokenizer tokenizer = getTokenizer();
	while (true) {
	    try {
		String token = tokenizer.nextToken();
		return Boolean.valueOf(token).booleanValue();
	    }
	    catch (NoSuchElementException e1) { tokenizer = getTokenizer(); }
	    catch (NumberFormatException e2)  { error2("Boolean"); }
	}//while
    }

/****************************************************************
* Gibt eine Zeichenkette aus und erwartet die Eingabe eines	
* Wahrheitswerts.							
* Die Zeichenkette "true" (unabh&auml;ngig von Gro&szlig;-/Kleinschreibung)
* liefert true, alles andere false.				
* @param prompt  die auszugebende Zeichenkette.			
* @return der eingegebene Wert.					
****************************************************************/
    public static boolean askBoolean (String prompt) {
	print(prompt);
	return readBoolean();
    }

/****************************************************************
* Liest ein Zeichen vom Terminal.				
* @return das gelesene Zeichen.					
****************************************************************/
    public static char readChar () {
	int x = 0;
	InputStreamReader R = new InputStreamReader(System.in);
	try {
	    x = R.read();
	}
	catch (IOException e1) { error1(); }
	return (char) x;
    }

/***************************************************************
* Gibt eine Zeichenkette aus und erwartet die Eingabe eines	
* Zeichens.							
* @param prompt  die auszugebende Zeichenkette.			
* @return das eingegebene Zeichen.				
****************************************************************/
    public static char askChar (String prompt) {
	print(prompt);
	return readChar();
    }

/****************************************************************
* Liest eine ganze Zahl (8 Bit) vom Terminal.			
* @return die gelesene Zahl.					
****************************************************************/
    public static byte readByte () {
	StringTokenizer tokenizer = getTokenizer();
	while (true) {
	    try {
		String token = tokenizer.nextToken();
		return Byte.valueOf(token).byteValue();
	    }
	    catch (NoSuchElementException e1) { tokenizer = getTokenizer(); }
	    catch (NumberFormatException e2)  { error2("Byte"); }
	}//while
    }

/****************************************************************
* Gibt eine Zeichenkette aus und erwartet die Eingabe einer	
* ganzen Zahl (8 Bit).							
* @param prompt  die auszugebende Zeichenkette.			
* @return die eingegebene Zahl.					
****************************************************************/
    public static byte askByte (String prompt) {
	print(prompt);
	return readByte();
    }

/****************************************************************
* Liest eine ganze Zahl (16 Bit) vom Terminal.			
* @return die gelesene Zahl.					
****************************************************************/
    public static short readShort () {
	StringTokenizer tokenizer = getTokenizer();
	while (true) {
	    try {
		String token = tokenizer.nextToken();
		return Short.valueOf(token).shortValue();
	    }
	    catch (NoSuchElementException e1) { tokenizer = getTokenizer(); }
	    catch (NumberFormatException e2)  { error2("Short"); }
	}//while
    }

/****************************************************************
* Gibt eine Zeichenkette aus und erwartet die Eingabe einer	
* ganzen Zahl (16 Bit).							
* @param prompt  die auszugebende Zeichenkette.			
* @return die eingegebene Zahl.					
****************************************************************/
    public static short askShort (String prompt) {
	print(prompt);
	return readShort();
    }

/****************************************************************
* Liest eine ganze Zahl (32 Bit) vom Terminal.
* @return die gelesene Zahl.
****************************************************************/
    public static int readInt () {
	StringTokenizer tokenizer = getTokenizer();
	while (true) {
	    try {
		String token = tokenizer.nextToken();
		return Integer.valueOf(token).intValue();
	    }
	    catch (NoSuchElementException e1) { tokenizer = getTokenizer(); }
	    catch (NumberFormatException e2)  { error2("Integer"); }
	}//while
    }

/****************************************************************
* Gibt eine Zeichenkette aus und erwartet die Eingabe einer	
* ganzen Zahl (32 Bit).							
* @param prompt  die auszugebende Zeichenkette.			
* @return die eingegebene Zahl.					
****************************************************************/
    public static int askInt (String prompt) {
	print(prompt);
	return readInt();
    }

/****************************************************************
* Liest eine ganze Zahl (64 Bit) vom Terminal.
* @return die gelesene Zahl.
****************************************************************/
    public static long readLong () {
	StringTokenizer tokenizer = getTokenizer();
	while (true) {
	    try {
		String token = tokenizer.nextToken();
		return Long.valueOf(token).longValue();
	    }
	    catch (NoSuchElementException e1) { tokenizer = getTokenizer(); }
	    catch (NumberFormatException e2)  { error2("Long"); }
	}//while
    }

/****************************************************************
* Gibt eine Zeichenkette aus und erwartet die Eingabe einer	
* ganzen Zahl (64 Bit).							
* @param prompt  die auszugebende Zeichenkette.			
* @return die eingegebene Zahl.					
****************************************************************/
    public static long askLong (String prompt) {
	print(prompt);
	return readLong();
    }

/****************************************************************
* Liest eine Gleitpunktzahl(32 Bit) vom Terminal.
* @return die gelesene Zahl.
****************************************************************/
    public static float readFloat () {
	StringTokenizer tokenizer = getTokenizer();
	while (true) {
	    try {
		String token = tokenizer.nextToken();
		return Float.valueOf(token).floatValue();
	    }
	    catch (NoSuchElementException e1) { tokenizer = getTokenizer(); }
	    catch (NumberFormatException e2)  { error2("Float"); }
	}
    }

/****************************************************************
* Gibt eine Zeichenkette aus und erwartet die Eingabe einer
* Gleitpunktzahl einfacher Genauigkeit (32 Bit).
* @param prompt  die auszugebende Zeichenkette.
* @return die eingegebene Gleitpunktzahl.
****************************************************************/
    public static float askFloat (String prompt) {
	print(prompt);
	return readFloat();
    }

/****************************************************************
* Liest eine Gleitpunktzahl(64 Bit) vom Terminal.
* @return die gelesene Zahl.
****************************************************************/
    public static double readDouble () {
	StringTokenizer tokenizer = getTokenizer();
	while (true) {
	    try {
		String token = tokenizer.nextToken();
		return Double.valueOf(token).doubleValue();
	    }
	    catch (NoSuchElementException e1) { tokenizer = getTokenizer(); }
	    catch (NumberFormatException e2)  { error2("Double"); }
	}
    }


/****************************************************************
* Gibt eine Zeichenkette aus und erwartet die Eingabe einer	
* Gleitpunktzahl doppelter Genauigkeit (64 Bit).		
* @param prompt  die auszugebende Zeichenkette.			
* @return die eingegebene Gleitpunktzahl.			
****************************************************************/
    public static double askDouble (String prompt) {
	print(prompt);
	return readDouble();
    }






/****************************************************************
* Liest ein Integer-Array vom Terminal.
 * @return array  das gelesene Array.
 * @throws NoSuchElementException bei unerwarteter Eingabe.
 * @throws NumberFormatException  bei falschem Zahlenformat.
 ****************************************************************/
    public static int[] readIntArray () {
	StringTokenizer     tokenizer;
	String		    token;
	int                 anzahl, i;

	while (true) {
	    tokenizer = new StringTokenizer(readString(), ",");
	    anzahl = tokenizer.countTokens();

	    if (anzahl > 0) {
		int[]   array = new int[anzahl];
		
		try {
		    for (i = 0; i < anzahl; i++) {
			token = tokenizer.nextToken();
			array[i] = Integer.valueOf(token).intValue();
		    }
		    return array;
		}
		catch (NoSuchElementException e1) { }
		catch (NumberFormatException e2)  { error2("Integer"); }
	    } else {
		error3();
	    }
	}
    }

/****************************************************************
* Liest eine Integer-Matrix vom Terminal.
 * @return matrix  die gelesene Matrix..
 * @throws NoSuchElementException bei unerwarteter Eingabe.
 * @throws NumberFormatException  bei falschem Zahlenformat.
 ****************************************************************/
    public static int[][] readIntMatrix () {
	StringTokenizer     tokenizer;
	String		    token;
	int                 zeilen, spalten, i, j, anzahl;

	while (true) {
	    tokenizer = new StringTokenizer(readString(), "/");
	    zeilen = tokenizer.countTokens();

	    if (zeilen > 1) {
		StringTokenizer[]  eingabe = new StringTokenizer[zeilen];
		
		spalten = 0;
		try {
		    for (i = 0; i < zeilen; i++) {
			eingabe[i] = new StringTokenizer(tokenizer.nextToken(), ",");
			if (eingabe[i].countTokens() > spalten) spalten = eingabe[i].countTokens();
		    }
		}
		catch (NoSuchElementException e1) { }

		if (spalten > 0) {
		    int[][]     matrix = new int[zeilen][spalten];

		    // Matrix mit 0 initialisieren
		    for (i = 0; i < zeilen; i++) {
			for (j = 0; j < spalten; j++) {
			    matrix[i][j] = 0;
			}
		    }

		    try {
			for (i = 0; i < zeilen; i++) {
			    anzahl = eingabe[i].countTokens();
			    for (j = 0; j < anzahl; j++) {
				token = eingabe[i].nextToken();
				matrix[i][j] = Integer.valueOf(token).intValue();
			    }
			}

			return matrix;
		    }
		    catch (NoSuchElementException e1) { }
		    catch (NumberFormatException e2)  { error2("Integer"); }
		} else {
		    error4();
		}
	    } else {
		error5();
	    }
	}
    }

    // asking ...

/****************************************************************
* Gibt eine Zeichenkette aus und erwartet die Eingabe eines
* Integer Arrays.
* @return  das gelesene Array.
****************************************************************/

    public static int[] askIntArray (String prompt) {
	        print(prompt);
		return readIntArray();
    }

/****************************************************************
* Gibt eine Zeichenkette aus und erwartet die Eingabe einer
* Integer Matrix.
* @return  die gelesene Matrix.
****************************************************************/

    public static int[][] askIntMatrix (String prompt) {
	        print(prompt);
		return readIntMatrix();
    }



//****************************************************************/
//****************************************************************/
//								   
// auxiliary stuff for writing ...				   
//								   
//****************************************************************/
//****************************************************************/

    private static String norm (boolean val) {
	return Boolean.toString(val);
    }

    private static String norm (char val) {
	return Character.toString(val);
    }

    private static String norm (long number) {
	return Long.toString(number);
    }

    private static String norm (float number) {
	if ( Math.abs(number) < 1e-8F ) { number = 0.0F;}
	return Float.toString(number);
    }

    private static String norm (double number) {
	if ( Math.abs(number) < 1e-8F ) { number = 0.0;}
	return Double.toString(number);
    }

//****************************************************************/
// auxiliary stuff for reading ...				   
//****************************************************************/
// the auxiliary (but central) method

    private static StringTokenizer getTokenizer () {
	String line;
	StringTokenizer tok = null;
	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	try {
	    line = reader.readLine();
	    if (line == null) { throw new IOException(); }
	    tok = new StringTokenizer(line);
	}
	catch  (IOException e) { error1(); }
	return tok;
    }

//****************************************************************/
// error handling ...
//****************************************************************/

    private static void error1 () {
		print("***ERROR*** ");
    }

    private static void error2 ( String kind) {
		print("Ungueltige " + kind + "-Zahl! (Nochmal eingeben) ");
    }

    private static void error3 () {
		print("Ein leeres Array ist nicht erlaubt! (Nochmal eingeben) ");
    }

    private static void error4 () {
		print("Eine leere Zeile ist nicht erlaubt! (Nochmal eingeben) ");
    }

    private static void error5 () {
		print("Eine Matrix muss mindestens zwei Zeilen besitzen! (Nochmal eingeben) ");
    }
}  // end of class Terminal
