/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

/**
 *
 * @author Bruno
 */
public class Controller {
    
    public String encrypt(String sentence){
        String code = "";
        sentence = sentence.toLowerCase();
        
        for(int i = 0; i < sentence.length();i++ ){
            char c = sentence.charAt(i);
            if(Character.isLetter(c)){
                c = (char)(c + 13);
                
                if(c > 'z'){
                    code += (char)(c - 26);
                }else{
                    code += c;
                }
            }else{
                code += c;
            }
        }
        return code;
    }
}
