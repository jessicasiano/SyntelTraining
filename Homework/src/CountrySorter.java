import java.util.*;
import java.text.*;

public class CountrySorter {
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale list[] = DateFormat.getAvailableLocales();
				
		displayLanguageInfo("English", list);
	}
	
	public static void displayLanguageInfo(String language, Locale[] l) {
		System.out.println(language + ": ");
		for(Locale loc : l){
			String lang = language.substring(0, 2).toLowerCase();
			if(lang.equals(loc.getLanguage())){
					System.out.println("Locale: " + loc.getDisplayCountry());
					Currency curr = NumberFormat.getCurrencyInstance(loc).getCurrency();
					System.out.println("Currency: " + curr.getDisplayName());
					System.out.println("");
			}
			
		}
		
	}
	
}
