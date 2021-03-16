package com.company;

import java.util.ArrayList;
import java.util.Collections;

public class BaseConverter {
    public Integer BinaryToDecimal (String input) throws Exception {

        Integer result=0;
        Integer incr=1;
        String[] list=input.split("");
        for (int i=list.length-1;i>=0; i--) {
            String value= list[i];
            if (value.equals("1")) {
                result = result+incr;

            }
            else if (value.equals("0")) {

            }
            else {
                throw new Exception("Error.Number you entered is not correct.");

            }
            incr=incr*2;
        }
        return result;

    }
    public String DecimalToBinary (int input) {
        ArrayList<String> resultS=new ArrayList<>();
        while (input!=0) {
            if (input%2==0) {
                resultS.add("0");
            }
            else {
                resultS.add("1");
            }
            input=input/2;
        }
        Collections.reverse(resultS);
        String listString = String.join("", resultS);
        return listString;
    }
}
