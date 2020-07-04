import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;



public class crawling_main_page {
	  public static void main(String[] args) {

		    Document doc;
		    try {

		        doc = Jsoup.connect("https://www.diretta.it/").get();
		        //System.out.println(doc.body());
		        Element link = doc.select("meta").get(3);
		        System.out.println(link.attr("content"));


		    } catch (IOException e) {
		        e.printStackTrace();
		    }

		  }

		}