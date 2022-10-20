package com.java8;

import java.util.Base64;
import java.util.UUID;
import java.io.UnsupportedEncodingException;

//With Java 8, Base64 has finally got its due. Java 8 now has inbuilt encoder and decoder for Base64 encoding. In Java 8, we can use three types of Base64 encoding.

//1. Simple − Output is mapped to a set of characters lying in A-Za-z0-9+/. The encoder does not add any line feed in output, and the decoder rejects any character other than A-Za-z0-9+/.

//2. URL − Output is mapped to set of characters lying in A-Za-z0-9+_. Output is URL and filename safe.

//3. MIME − Output is mapped to MIME friendly format. Output is represented in lines of no more than 76 characters each, and uses a carriage return '\r' followed by a linefeed '\n' as the line separator. No line separator is present to the end of the encoded output.

//Nested Classes

//1. static class Base64.Decoder
//This class implements a decoder for decoding byte data using the Base64 encoding scheme as specified in RFC 4648 and RFC 2045.

//2. static class Base64.Encoder
//This class implements an encoder for encoding byte data using the Base64 encoding scheme as specified in RFC 4648 and RFC 2045.

//Methods

//1. static Base64.Decoder getDecoder()
//Returns a Base64.Decoder that decodes using the Basic type base64 encoding scheme.

//2. static Base64.Encoder getEncoder()
//Returns a Base64.Encoder that encodes using the Basic type base64 encoding scheme.

//3. static Base64.Decoder getMimeDecoder()
//Returns a Base64.Decoder that decodes using the MIME type base64 decoding scheme.

//4. static Base64.Encoder getMimeEncoder()
//Returns a Base64.Encoder that encodes using the MIME type base64 encoding scheme.

//5. static Base64.Encoder getMimeEncoder(int lineLength, byte[] lineSeparator)
//Returns a Base64.Encoder that encodes using the MIME type base64 encoding scheme with specified line length and line separators.

//6. static Base64.Decoder getUrlDecoder()
//Returns a Base64.Decoder that decodes using the URL and Filename safe type base64 encoding scheme.

//7. static Base64.Encoder getUrlEncoder()
//Returns a Base64.Encoder that encodes using the URL and Filename safe type base64 encoding scheme.

//This class inherits methods from the following class − java.lang.Object

public class Base64EncodeDecode {

	public static void main(String args[]) {

		try {

			// Encode using basic encoder
			String base64encodedString = java.util.Base64.getEncoder().encodeToString(
					"TutorialsPoint?java8".getBytes("utf-8"));
			System.out.println("Base64 Encoded String (Basic) :" + base64encodedString);

			// Decode
			byte[] base64decodedBytes = Base64.getDecoder().decode(base64encodedString);

			System.out.println("Original String: " + new String(base64decodedBytes, "utf-8"));
			base64encodedString = Base64.getUrlEncoder().encodeToString(
					"TutorialsPoint?java8".getBytes("utf-8"));
			System.out.println("Base64 Encoded String (URL) :" + base64encodedString);

			StringBuilder stringBuilder = new StringBuilder();

			for (int i = 0; i < 10; ++i) {
				stringBuilder.append(UUID.randomUUID().toString());
			}

			byte[] mimeBytes = stringBuilder.toString().getBytes("utf-8");
			String mimeEncodedString = Base64.getMimeEncoder().encodeToString(mimeBytes);
			System.out.println("Base64 Encoded String (MIME) :" + mimeEncodedString);

		} catch(UnsupportedEncodingException e) {
			System.out.println("Error :" + e.getMessage());
		}
	}
}