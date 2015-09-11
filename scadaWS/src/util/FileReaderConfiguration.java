/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

import javax.xml.transform.stream.StreamResult;

public class FileReaderConfiguration {
	
	public StreamResult lines;
	private static String user;
	private static String password;

	public FileReaderConfiguration(){
		this.getConfiguration();
	}
	
	public static String getUser() {
		return user;
	}

	public static void setUser(String user) {
		FileReaderConfiguration.user = user;
	}

	public static String getPassword() {
		return password;
	}

	public static void setPassword(String password) {
		FileReaderConfiguration.password = password;
	}

	public static void main(String[] args) {
		FileInputStream fstream = null;
		try {
			fstream = new FileInputStream("c:/configuracion.txt");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		BufferedReader br = new BufferedReader(new InputStreamReader(fstream));

		String strLine;

		// Read File Line By Line
		try {
			while ((strLine = br.readLine()) != null) {
				// Print the content on the console
				System.out.println(strLine);
				String[] lineVariables = strLine.split(",");
				for (int i = 0; i < lineVariables.length; i++) {
					System.out.println(lineVariables[i]);
					switch (i) {
					case 0:
						user = lineVariables[i];
						break;
					case 1:
						password = lineVariables[i];
						break;

					}

				}

			}
			System.out.println(user + "," + password);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// Close the input stream
		try {
			br.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void getConfiguration() {
		FileInputStream fstream = null;
		try {
			fstream = new FileInputStream("c:/configuracion.txt");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		BufferedReader br = new BufferedReader(new InputStreamReader(fstream));

		String strLine;

		// Read File Line By Line
		try {
			while ((strLine = br.readLine()) != null) {
				// Print the content on the console
				System.out.println(strLine);
				String[] lineVariables = strLine.split(",");
				for (int i = 0; i < lineVariables.length; i++) {
					System.out.println(lineVariables[i]);
					switch (i) {
					case 0:
						user = lineVariables[i];
						break;
					case 1:
						password = lineVariables[i];
						break;

					}

				}

			}
			System.out.println(user + "," + password);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// Close the input stream
		try {
			br.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}