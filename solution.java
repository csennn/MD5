import java.util.*;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Solution {

	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			String input = scan.nextLine();

			try {
				MessageDigest md = MessageDigest.getInstance("MD5");
				md.update(input.getBytes());
				byte[] digest = md.digest();

				StringBuilder sb = new StringBuilder();
				for (byte b : digest) {
					sb.append(String.format("%02x", b & 0xff));
				}

				System.out.println(sb.toString());
			} catch (NoSuchAlgorithmException e) {
				System.out.println("Error: " + e);
			}
		}
	}
}
