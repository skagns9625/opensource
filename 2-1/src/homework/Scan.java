package homework;

import java.util.Scanner;
import java.lang.Math;
import static javax.swing.JOptionPane.*;

public class Scan {

	public static void main(String[] args) {
		
		try {
			int iDan;
			
			String sDan = showInputDialog("출력할 단");
			
			if(sDan != null) {
				iDan = Integer.valueOf(sDan);
				for(int i = 1; i <= 9; i++) {
					System.out.print(iDan*i + "\t");
				}
			}
		} catch(Exception e){
			showMessageDialog(null, "다시입력");
		}
		
	}
}
