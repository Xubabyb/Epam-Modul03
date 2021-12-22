package by.jonline.modul03.regularExpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Exercise02 {
    private static Pattern patternOpen = Pattern.compile("<\\w.+?>");
	private static Pattern patternClose = Pattern.compile("</\\w+>");
	private static Pattern patternBody = Pattern.compile(">.+?<");
	private static Pattern patternEmpty = Pattern.compile("<\\w.+?/>");

	public static void main(String[] args) {
		String xmlDoc ="<notes>\n"+
					   "    <note id = \"1\">\n"+
					   "         <to>Вася</to>\n"+
					   "         <from>Света</from>\n"+
					   "		 <heading>Напоминание</heading>\n"+
					   "		 <body>Позвони мне завтра!</body>\n"+
					   "    </note>\n"+
					   "    <note id = \"2\">\n"+
					   "         <to>Петя</to>\n"+
					   "         <from>Маша</from>\n"+
					   "		 <heading>Важное напоминание</heading>\n"+
					   "		 <body/>\n"+
					   "    </note>\n"+
					   "</notes>\n";
		String xmlDocAnalyz = analizatorXml(xmlDoc);
		System.out.println(xmlDocAnalyz);
	}
	
	public static String analizatorXml(String string) {
		StringBuilder str = new StringBuilder();
		String [] sentences = string.split("\n");
		for(String line:sentences) {
			Matcher matcherOpen = patternOpen.matcher(line);
			Matcher matcherClose = patternClose.matcher(line);
			Matcher matcherBody = patternBody.matcher(line);
			Matcher matcherEmpty = patternEmpty.matcher(line);
			
			if (matcherEmpty.find()) {
				str.append(matcherEmpty.group()).append(" - тег без тела\n");
			}else if(matcherOpen.find()) {
				str.append(matcherOpen.group()).append(" - тег октрытия\n");
			}
			if (matcherBody.find()) {
				str.append(matcherBody.group()).append(" - содержимое тега\n");
			}
			if (matcherClose.find()) {
				str.append(matcherClose.group()).append(" - тег закрытия\n");
			}
			
		}
		return str.toString();
	}

}
