package com.msd.yazlab2.deneme.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ApplicationController {

  double startTime = System.nanoTime(); 


  @RequestMapping(value="/postekrani", method = RequestMethod.POST)
  public ResponseEntity<String> create(@RequestParam(value="array[]") String[] metinler){

  
  
  int uzunluk=metinler.length;
  String birlesmisDizi=metinler[0];

  
  
  for(int i=0 ; i<uzunluk-1 ; i++){
     

    String string1=birlesmisDizi;
    String string2=metinler[i+1];

    char[] metin1 = string1.toCharArray();
    char[] metin2 = string2.toCharArray();
    
    int a=0,b=0;
    int j=0,k=0;
    int ortaklik=2;
    int ilkindex=0;

    for(int x=0 ; x<metin1.length ; x++){
      if(metin1[x]==' ')
      a=1;
    }

    for(int y=0 ; y<metin2.length ; y++){
      if(metin2[y]==' ')
      b=1;
    }


    while(true){

    if(a==0 && b==0){
      if(metin2[j]==metin1[k]){

        if(j==0){
          ilkindex=k;
        }

        if(j==1){
          ortaklik=1;
          break;
        }

        j++;

      }
      else{
        j=0;
        ilkindex=0;
      }

      if(k!=metin1.length-1){
        k++;
      }
      else{
        ortaklik=0;
        break;
      }

    }
    else{

      if(metin2[j]==metin1[k]){

        if(j==0){
          ilkindex=k;
        }

        if(k==metin1.length-1){
          ortaklik=1;
          break;
        }

        j++;

      }
      else{
        j=0;
        ilkindex=0;
      }

      if(k!=metin1.length-1){
        k++;
      }
      else{
        ortaklik=0;
        break;
      }
      
    }


    }


    if(ortaklik==0){
      birlesmisDizi = new String(metin1) + " " + new String(metin2);   
    }
    else if(ortaklik==1){
      birlesmisDizi = new String(metin1,0,ilkindex) + new String(metin2);
    }
    
    
  }

    return new ResponseEntity<String>(birlesmisDizi,HttpStatus.OK);
  }



  double endTime = System.nanoTime(); 
  double totaltime= (endTime-startTime)/1000000;
  String Zaman=Double.toString(totaltime);



  @RequestMapping(value="/zamanekrani", method = RequestMethod.POST)
  public ResponseEntity<String> create(@RequestParam(value="String") String time){

    return new ResponseEntity<String>(Zaman,HttpStatus.OK);
  }

    
}
