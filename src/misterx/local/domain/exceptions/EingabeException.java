package misterx.local.domain.exceptions;

public class EingabeException extends Exception {

	public EingabeException(String text) {
		super("Fehlerhafte Eingabe: " + text + ". Es d�rfen keine Zahlen sowie die Zeichen !, /, _, ?, � enthalten sein!");
	}
}
