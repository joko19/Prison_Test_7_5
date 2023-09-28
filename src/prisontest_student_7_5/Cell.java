/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prisontest_student_7_5;

/**
 *
 * @author joko
 */
public class Cell {

    private String name;
    private boolean isDoorOpen;
    private int securityCode;
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isIsDoorOpen() {
        return isDoorOpen;
    }

    public void setIsDoorOpen(int securityCode) {
        if(this.securityCode == securityCode){
            //dijalankan ketika securitycodenya benar            
            if(this.isDoorOpen){
                this.isDoorOpen = false;
                System.out.println("Pintu berhasil ditutup");
            }else{
             this.isDoorOpen = true;
             System.out.println("Pintu berhasil dibuka");
            }
        } else{
            //dijalankan ketika securitycodenya salah
            System.out.println("Kode Kemananan salah");
        }
        
    }
    
    //Constructor
    public Cell(String name, boolean isDoorOpen, int securityCode){
 	this.name = name;
        this.isDoorOpen = isDoorOpen;
        this.securityCode = securityCode;
    }
    
}
