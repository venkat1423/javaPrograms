package javaPrograms;

public class RemoveSpaces {
	
	public static void main(String[] args) {
		String str = "hello               world program";
		String removedSpacestr = str.replaceAll("\\s+", "");
		
		System.out.println("After Removing spaces : "+removedSpacestr);
	}

}
