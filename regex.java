package samples;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class regex {
	public static void main(String args[]) {

		// String to be scanned to find the pattern.
		String line = "ABB";
		// String pattern = "AB";
		replace(line);
	}

	private static void replace(String line) {
		// Create a Pattern object
		Pattern r;
		Matcher m;
		ArrayList<String> list = new ArrayList();
		list.add("AB");
		list.add("BA");
		list.add("BC");
		list.add("CB");
		list.add("CC");
		list.add("AA");
		for (int i = 0; i < list.size(); i++)
		{
			
			//System.out.println(i);
			String pattern = list.get(i);
			//System.out.println(list.get(i));
			switch (pattern) {
			case "AB":
				 r = Pattern.compile(pattern);
				// System.out.println("pattern" +r);

				// Now create matcher object.
				 m = r.matcher(line);
				if (m.find())
				{
					System.out.println("found");
					line = line.replaceAll(pattern, "AA");
					System.out.println(line);
					replace(line);
				}	
				else {
					break;
				}
				break;
			case "BA":
				r = Pattern.compile(pattern);
				// System.out.println("pattern" +r);

				// Now create matcher object.
				m = r.matcher(line);
				if (m.find())
				{
					System.out.println("found");
					line = line.replaceAll(pattern, "AA");
					System.out.println(line);
					replace(line);
				}
				else
					break;
				break;
			case "BC":
				r = Pattern.compile(pattern);
				// System.out.println("pattern" +r);

				// Now create matcher object.
				m = r.matcher(line);
				if (m.find())
				{
					System.out.println("found");
					line = line.replaceAll(pattern, "CC");
					System.out.println(line);
					replace(line);
				}
				else
					break;
				break;
			case "CB":
				r = Pattern.compile(pattern);
				// System.out.println("pattern" +r);

				// Now create matcher object.
				m = r.matcher(line);
				if (m.find())
				{
					System.out.println("found");
					line = line.replaceAll(pattern, "CC");
					System.out.println(line);
					replace(line);
				}
				else
					break;
				break;	
			case "CC":
				r = Pattern.compile(pattern);
				// System.out.println("pattern" +r);

				// Now create matcher object.
				m = r.matcher(line);
				if (m.find())
				{
					System.out.println("found");
					line = line.replaceAll(pattern, "C");
					System.out.println(line);
					replace(line);
				}
				else break;
				break;
			case "AA":
				r = Pattern.compile(pattern);
				// System.out.println("pattern" +r);

				// Now create matcher object.
				m = r.matcher(line);
				if (m.find())
				{
					System.out.println("found");
					line = line.replaceAll(pattern, "A");
					System.out.println(line);
					replace(line);
				}
				else break;
				break;
				default:
					System.out.println("Match not found");	
					return;
					
			}
			
			
				
		}
		return;
		
	}
}