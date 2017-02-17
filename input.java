import java.io.*;

class input {
	public static void main (String[]args)throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		String tampung = br.readLine();
		System.out.println(tampung);
		
		System.out.println("masukkan bilangan :");
		int bil = Integer.parseInt(br.readLine());
		
	}
}