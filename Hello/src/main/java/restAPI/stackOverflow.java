package restAPI;

import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.SortOrder;

public class stackOverflow {

	private static final String BASE_URL="https://api.stackexchange.com:90/2.2/search?";
	private static final String PARAM_SITE="site=";
	private static final String PARAM_ORDER = "&order=";
	private static final String PARAM_SORT = "&sort";
	private static final String PARAM_TAG = "&tagged=";
	private static final String PARAM_FILTER = "&filter=";
	private static final String PARAM_SEARCH_TERM = "&intitle=";
	
	
	private String site = "stackoverflow";
	private int size = 5 ;
	private SortOrder sortOrder=SortOrder.ASCENDING;
	
	
	
	public enum SortOrder{
		ASCENDING ("asc"),
		DESCENDING ("desc");
		
		
		private final String key;
		
		SortOrder(String key)
		{
			this.key = key;
		}
		
		public String toString(String key)
		{
			return key;
		}
	}	
	public enum Sort{
		ACTIVITY("activity"),
		RELEVANCE ("relevance");
		;
		
		
		private final String key;
		
		Sort(String key)
		{
			this.key = key;
		}
		
		public String toString(String key)
		{
			return key;
		}
	}
		public String buildUrl()
		{
			StringBuilder url = new StringBuilder();
			url.append(BASE_URL);
			url.append(PARAM_SITE).append(this.site);
			url.append(PARAM_ORDER).append(SortOrder.ASCENDING);
			url.append(PARAM_SORT).append(Sort.ACTIVITY);
			
			return toString(url);
		}
	
	public static void main(String args[])
	{
		try {
			URL url = new URL(BASE_URL);
			System.out.println(url.getHost());
			System.out.println(url.getPort());

			
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}
