package homework;

import java.util.Scanner;
import java.lang.Math;
import static javax.swing.JOptionPane.*;

public class Scan {

	public static void main(String[] args) {
		
		try {
			int iDan;
			
			String sDan = showInputDialog("����� ��");
			
			if(sDan != null) {
				iDan = Integer.valueOf(sDan);
				for(int i = 1; i <= 9; i++) {
					System.out.print(iDan*i + "\t123");
				}
			}
		} catch(Exception e){
			showMessageDialog(null, "�ٽ��Է�");
		}
		
	}
}
