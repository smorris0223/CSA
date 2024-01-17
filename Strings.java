public class Strings{

public static String scroll(String s){
    char a = s.charAt(0);
    String b = s.substring(1);
    return b+a;

}

public static String convertName(String name){
 int x = name.indexOf(',');
 String first = name.substring(x+1);
 String last = name.substring(0, x);
 String s = first.trim()+" "+last.trim();
 return s;
}

public static String negative(String s){
    String a= s.replace("0", "2");//if you change them to 1 right away, in the next step they'll just all turn to 0
    String b= a.replace("1", "0");
    String c = b.replace("2", "1");
    return c;
}

public static String dateString(String date){
String day = date.substring(3,5);
String month = date.substring(0, 2);
String year = date.substring(6);
return day+"-"+month+"-"+year;
}
public static String dateString2(String date){
    int x= date.indexOf("/");
    String month = date.substring(0, x);
    int y = date.indexOf("/", x+1);
    String day = date.substring(x+1, y);
    String year = date.substring(date.length()-4);
    if(day.length()!=2){
        String d="0"+day;
        day=d;
    }
    if(month.length()!=2){
        String m="0"+month;
        month=m;
    }
    return day+"-"+month+"-"+year;
}

public static boolean startsWith(String s, String prefix){
    if(prefix.length()<=s.length()){
        String a = s.substring(0, prefix.length());
        return(a.equalsIgnoreCase(prefix));
    }
    else return false;
}

public static boolean endsWith(String s, String suffix){
    if(suffix.length()<=s.length()){
        String a = s.substring(s.length()-suffix.length());
        return(a.equalsIgnoreCase(suffix));
    }
    else{return false;}
}

public static String removeTag(String text, String tag){
    String startTag = "<"+tag+">";
    String endTag = "</"+tag+">";
    int x = text.indexOf("<");
    int y = text.lastIndexOf(">");
    String Word = text.substring(x, y+1);//isolates tags & word within them
    int z = tag.length();
    if(startsWith(Word, startTag)&& endsWith(Word,endTag)){
        return text.substring(x+(z+2),y-(z+2));
    }
    else{return text;}
}

public static void main(String[] args){
    System.out.println(scroll("Hello World"));
    System.out.println(scroll("happy"));
    System.out.println(scroll("h"));
    System.out.println(convertName(" Reubenstein, Lori Renee "));
    System.out.println(convertName("Biden,Joe"));
    System.out.println(convertName("the Clown, Bozo"));
    System.out.println(negative("0010111001"));
    System.out.println(negative("11111111"));
    System.out.println("04/20/2014 becomes " + dateString("04/20/2014"));
    System.out.println("04/20/2014 becomes " + dateString2("04/20/2014"));
    System.out.println("4/20/2014 becomes " + dateString2("4/20/2014"));
    System.out.println("04/2/2014 becomes " + dateString2("04/2/2014"));
    System.out.println("4/2/2014 becomes " + dateString2("4/2/2014"));
    System.out.println("\nstartsWith");
    System.out.println(startsWith("architecture", "arch"));
    System.out.println(startsWith("architecture", "a"));
    System.out.println(startsWith("arch", "architecture"));
    System.out.println(startsWith("architecture", "rch"));
    System.out.println(startsWith("architecture", "architecture"));
    System.out.println("\nendsWith");
    System.out.println(endsWith("astronomy", "nomy"));
    System.out.println(endsWith("astronomy", "y"));
    System.out.println(endsWith("astronomy", "nom"));
    System.out.println(endsWith("nomy", "astronomy"));
    System.out.println(endsWith("astronomy", "astronomy"));
    System.out.println("\nremoveTag");
    System.out.println(removeTag("<b>Hello World</b>", "b"));
    System.out.println(removeTag("<b>Hello World</b>", "head"));
    System.out.println(removeTag("Hello World</b>", "b"));
    System.out.println(removeTag("<b>Hello World", "b"));
    System.out.println(removeTag("</img>Hello World<img>", "img"));
    System.out.println(removeTag("Happy Birthday <b>Hello World</b>", "b"));
    System.out.println(removeTag("<title>Hello World</title> Happy Birthday", "title"));
    System.out.println(removeTag("Happy <b>Hello World</b> Birthday", "b"));

}



}