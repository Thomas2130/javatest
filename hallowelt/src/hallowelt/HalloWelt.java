package hallowelt;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Scanner;

import javax.swing.JFrame;

import java.util.EnumSet;
import java.util.Random;

import javax.swing.JOptionPane;

public class HalloWelt {
	 
	public static void main(String[] args){
		
		/*
		String fn = JOptionPane.showInputDialog("Enter first number");
		String sn = JOptionPane.showInputDialog("Enter second number");
		
		int num1 = Integer.parseInt(fn);
		int num2 = Integer.parseInt(sn);
		
		int sum = num1 + num2;
		
		JOptionPane.showMessageDialog(null, "Sum: " + sum, "Result", JOptionPane.PLAIN_MESSAGE);
		*/
		
		try (
			InputStream in = new BufferedInputStream( new FileInputStream("text.txt") );
			OutputStream out = new BufferedOutputStream( new FileOutputStream("kopie.txt") );
			)
			{
			int c;
			while( (c = in.read()) != -1){
				out.write(c);
			}
			out.flush();
			System.out.println("Kopie wurde angelegt.");
			} catch (IOException e){
				e.printStackTrace();
			}
		
		
		//
		// eclipse hacks
		//
		
		// sysout + strg + space
		System.out.println("Test");
		System.out.println("Test 2");

		
		// other templates are placed under Window->References->Java->Editor->Templates

		// strg + umschalt + t: search
		
		// strg + mouse cursor: open implementation

	}
}