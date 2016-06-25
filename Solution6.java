/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;

/**
 *
 * @author Nixaè
 */
public class Solution6 {
    public static void main(String []args){
        Scanner in=new Scanner(System.in);
        ArrayList<String>arr=new ArrayList<>();
        HashSet<String>set=new HashSet<>();
        boolean flag=true;
        while(in.hasNext()){
            String a=in.nextLine();
        arr.add(a);
        set.add(a);
        in.nextLine();
        if(in.next().isEmpty()){
        	break;
        }
        }
        System.out.println(arr.toString());
        for(String a:set){
        int freq=Collections.frequency(arr,a);
        if(freq%2!=0){
            flag=false;
            break;
        
        }
                }
        System.out.println(flag);
        
    }
}
