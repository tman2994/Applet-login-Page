/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author w1549895
 */
class passwordCheck {
    // instance variables
    private final int PWD_MINSIZE = 8;
    private final int PWD_MAXSIZE = 10;
    
            //test password strings
    public passwordCheck() { 
    
    
        String[] strPasswords = {
                "password",
                "password1a",
                "password01",
                "Password01",
                "P@ssword01",
                "abcd",
                "mypassword",
                "00000000",
                "AlphaRomeo4c",
                "fiatlinea2014",
                "F@rd1co",
                "F@rd1coSports",
                "Suzuki@lpha2016",
                "!vwvento2015",
                "!@#$%^&*Aa1",
                "myDream1@$$",
                "HelloWorld@001!"
        };
 
        System.out.println("Java check password strength example passwords");
    
        for(String password : strPasswords)
            System.out.println( password + ": " + calculatePasswordStrength(password) );
    }
       
    public int getMinPwd(){
        return PWD_MINSIZE;
    }
    
    public int getMaxPwd(){
        return PWD_MAXSIZE;
    }
    
    public int calculatePasswordStrength(String password){
        
        //total score of password
        int iPasswordScore = 0;
        
        if( password.length() < PWD_MINSIZE )
            return 0;
        else if( password.length() > PWD_MAXSIZE )
            iPasswordScore += 2;
        else 
            iPasswordScore += 1;   // within the valid range 8 to 10 characters
        
        //if it contains one digit, add 2 to total score
        if( password.matches("(?=.*[0-9]).*") )
            iPasswordScore += 2;
        
        //if it contains one lower case letter, add 2 to total score
        if( password.matches("(?=.*[a-z]).*") )
            iPasswordScore += 2;
        
        //if it contains one upper case letter, add 2 to total score
        if( password.matches("(?=.*[A-Z]).*") )
            iPasswordScore += 2;    
        
        //if it contains one special character, add 2 to total score
        if( password.matches("(?=.*[~!@#$%^&*()_-]).*") )
            iPasswordScore += 2;
        
        return iPasswordScore;
        
    }
 
    }

