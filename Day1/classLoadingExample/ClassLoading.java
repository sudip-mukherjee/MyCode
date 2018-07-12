package Day1.classLoadingExample;

public class ClassLoading {
	
	public static void main(String[] args) {
		
		
		try {
			Class.forName("com.jspiders.Tree");
			//Class.forName("com.jspiders.Cow"); 
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}
