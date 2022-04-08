/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package quiz;
import penilaian.web;

/**
 *
 * @author mac
 */
public class NilaiWeb implements web{
    double writingW, codingW, interviewW;
    String nim, name;
    double result;
    public NilaiWeb (String name, String nim){
        this.name = name;
        this.nim  = nim;
    }
    public NilaiWeb (double writing, double coding, double interview){
        this.writingW = writingW;
        this.codingW = codingW;
        this.interviewW = interviewW;
    }

    @Override
    public double writing() {
        writingW = writingW * 0.4;
        return writingW;
    }
    @Override
    public double coding(){
        codingW = codingW * 3.5;
        return codingW;
    }
    @Override
    public double interview(){
        interviewW = interviewW * 2.5;
        return interviewW;
    }
    @Override
    public void result(){
        result = writingW + codingW + interviewW;
    }
    
}
