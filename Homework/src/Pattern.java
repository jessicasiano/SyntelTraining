import java.util.regex.*;
class Pattern1{
   public static void main (String [] args)
   {
      
      Pattern p;
      String check = "Syntel";
      try
      {
         p = Pattern.compile (check);
      }
      catch (PatternSyntaxException e)
      {
         System.err.println ("Regex syntax error: " + e.getMessage ());
         System.err.println ("Error description: " + e.getDescription ());
         System.err.println ("Error index: " + e.getIndex ());
         System.err.println ("Erroneous pattern: " + e.getPattern ());
         return;
      }
      String s = "My name is Jessica and I work for Syntel.\nSyntel is an IT company.\nSyntel uses Syntelligence to give information to its emplyees.";
      Matcher m = p.matcher(s);
      System.out.println ("Regex = " + check);
      System.out.println ("Text = " + s);
      System.out.println ();
      while (m.find())
      {
         System.out.println ("Found " + m.group ());
         System.out.println ("  starting at index " + m.start () +
                             " and ending at index " + m.end ());
         System.out.println ();
      }
   }
}
  