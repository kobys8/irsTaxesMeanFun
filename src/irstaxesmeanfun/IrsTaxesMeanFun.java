/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package irstaxesmeanfun;

/**
 *
 * @author kms080
 */
import java.util.Scanner;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
public class IrsTaxesMeanFun {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int null1 = 0;
        System.out.println("Enter taxable income for Jobob McGee: $");
        areYouAlCaponeingMe yesIAm1 = new areYouAlCaponeingMe(in.nextDouble()); // should be 15500
        System.out.println("Your federal tax = $" + yesIAm1.crunchTaxInfo());
        System.out.println("Enter taxable income for Jobob Smith: $");
        areYouAlCaponeingMe yesIAm2 = new areYouAlCaponeingMe(in.nextDouble()); // should be 100000
        System.out.println("Your federal tax = $" + yesIAm2.crunchTaxInfo());
        System.out.println("Enter taxable income for Jobob Roberts: $");
        areYouAlCaponeingMe yesIAm3 = new areYouAlCaponeingMe(in.nextDouble()); // should be 480000
        System.out.println("Your federal tax = $" + yesIAm3.crunchTaxInfo());
        System.out.println("Enter taxable income for Jobob Samuel: $");
        areYouAlCaponeingMe yesIAm4 = new areYouAlCaponeingMe(in.nextDouble()); // should be 50000
        System.out.println("Your federal tax = $" + yesIAm4.crunchTaxInfo());
        System.out.println("Enter taxable income for Jobob Rainbow: $");
        areYouAlCaponeingMe yesIAm5 = new areYouAlCaponeingMe(in.nextDouble()); // should be 125000
        System.out.println("Your federal tax = $" + yesIAm5.crunchTaxInfo());
        System.out.println("Enter taxable income for Jobob Jeans: $");
        areYouAlCaponeingMe yesIAm6 = new areYouAlCaponeingMe(in.nextDouble()); // should be 400000
        System.out.println("Your federal tax = $" + yesIAm6.crunchTaxInfo());
        JOptionPane.showMessageDialog(null, "Wow! All these Jobobs should meet at a convention! Say, why not at JobobCon?", "Title", 0, new ImageIcon(IrsTaxesMeanFun.class.getResource("jobobcon.png")));
    }
}

class areYouAlCaponeingMe {
    private static final String FILING_STATUS = "single";
    private double taxableIncome;
    private double federalTax;
    public areYouAlCaponeingMe(double taxCome) {
        taxableIncome = taxCome;
    }
    public double crunchTaxInfo() {
        if(taxableIncome > 0 && taxableIncome <= 27050) {
            federalTax = 0.15 * taxableIncome;
        }
        else if(taxableIncome > 27050 && taxableIncome <= 65550) {
            federalTax = 4057.50 + (.275*(taxableIncome-27050));
        }
        else if(taxableIncome > 65550 && taxableIncome <= 136750) {      
            federalTax = 14645 + (.305*(taxableIncome-65550));      
        }
        else if(taxableIncome > 136750 && taxableIncome <= 297350) {  
            federalTax = 36361 + (.355*(taxableIncome-136750));          
        }
        else if(taxableIncome > 297350) {            
            federalTax = 93374 + (.391*(taxableIncome-297350));
        }
        return federalTax;
    }
}