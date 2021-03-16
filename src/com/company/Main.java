package com.company;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static BaseConverter converter= new BaseConverter();
    public static void main(String[] args)  {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String type = Run(br);
        String input = null;
        try {
            System.out.print("\nEnter input:");
            input=br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

        String result = null;
        switch (type){
            case "dtb":

                result = converter.DecimalToBinary(Integer.valueOf(input));
                System.out.print("\nResult:"+result+"\n\n");
                break;
            case "btd":

                try {
                    result = converter.BinaryToDecimal(input).toString();
                } catch (Exception e) {
                    e.printStackTrace();
                }
                System.out.print("\nResult:"+result+"\n\n");
                break;
        }
        main(null);

    }
    public static String Run(BufferedReader br){
        System.out.print("Enter dtb for Decimal to binary \n");
        System.out.print("Enter btd for Binary to Decimal\n");
        System.out.print("Enter function: ");
        String type=null;
        try {
            type = br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        switch (type){
            case "dtb":
                System.out.print("Decimal to binary");
                break;
            case "btd":
                System.out.print("Binary to Decimal");
                break;
            default:System.out.println("Incorrect function");
                Run(br);
        }
        return type;
    }

}
