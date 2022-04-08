/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package quiz;
import penilaian.android;
/**
 *
 * @author mac
 */
public class NilaiAndro implements android{
    double writing, coding, interview, result;
    String name, nim;
    public NilaiAndro(double writing, double coding, double interview){
        this.writing = writing;
        this.coding = coding;
        this.interview = interview;
        this.name = name;
        this.nim = nim;
    }
    @Override
    public double writing(){
        writing = (writing*20)/100;
        return writing;
    }
    @Override
    public double coding(){
        coding = (coding*50)/100;
        return coding;
    }
    @Override
    public double interview(){       
        interview = (interview*30)/100;
        return interview;
    }
    @Override
    public void result(){
        result = writing * coding * interview;
    }
}
