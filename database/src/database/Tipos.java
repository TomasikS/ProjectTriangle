/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

/**
 *
 * @author pc
 */
public class Tipos {
    private  int [] arr;

    public Tipos(){

        arr=new int[5];

    }

    public int[] getArr() {
        return arr;
    }

    public  void generate() {
        Random r = new Random();


        for (int i = 0; i < 5; i++) {
            arr[i] = (int)(Math.random()*34+1);

            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    arr[j] = (int)(Math.random()*34+1);
                }
            }
        }
        Arrays.sort(arr);
        for (int i = 0; i < 5; i++)
            System.out.println(arr[i]);

    }

    public void printNewBets(List<Bet> list)
            {
    
               for (Bet temp:list) 
               {
    temp.getbet1();
      temp.getbet2();
        temp.getbet3();
          temp.getbet4();
            temp.getbet5();
    
    
               }
            }

}
