# When to use Character Stream over Byte Stream? When to use Byte Stream over Character Stream? Give example

## 1. When to use Character Stream over Byte Stream? 
   - In Java, characters are stored using Unicode conventions. Character stream is useful when we want to process text files. These text files can be processed character by character. A character size is typically 16 bits.
### Example
```
// Java Program illustrating that we can read a file in
// a human readable format using FileReader
import java.io.*; // Accessing FileReader, FileWriter, IOException
public class Adnan
{
	public static void main(String[] args) throws IOException
	{
		FileReader sourceStream = null;
		try
		{
			sourceStream = new FileReader("test.txt");
			// Reading sourcefile and writing content to
			// target file character by character.
			int temp;
			while ((temp = sourceStream.read()) != -1)
				System.out.println((char)temp);
		}
		finally
		{			
			// Closing stream as no longer in use
			if (sourceStream != null)			
				sourceStream.close();		
		}
	}
}
```
## 2. When to use Byte Stream over  Character Stream? 
   - Byte oriented reads byte by byte.  A byte stream is suitable for processing raw data like binary files or any other files like images or audio/video files.

### Example
```
// Java Program illustrating the Byte Stream to copy
// contents of one file to another file.
import java.io.*;
public class BStream
{
	public static void main(String[] args) throws IOException
	{
		FileInputStream sourceStream = null;
		FileOutputStream targetStream = null;

		try
		{
			sourceStream = new FileInputStream("sorcefile.txt");
			targetStream = new FileOutputStream ("targetfile.txt");

			// Reading source file and writing content to target
			// file byte by byte
			int temp;
			while ((temp = sourceStream.read()) != -1)
				targetStream.write((byte)temp);			
		}
		finally
		{
			if (sourceStream != null)
				sourceStream.close();			
			if (targetStream != null)			
				targetStream.close();			
		}
	}
}
```


---
**_The detailed article is present on [GFG](https://www.geeksforgeeks.org/character-stream-vs-byte-stream-java/)_**
---
