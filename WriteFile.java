package com.bridgelabz.util;
import java.io.FileWriter;
public class WriteFile
{
	public void writeFile(String file, String data)throws Exception
	{
		FileWriter writer = new FileWriter(file);
		writer.write(data);
		writer.close();
	}
}
