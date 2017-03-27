package com.maggioni;

import javax.ejb.Stateful;

@Stateful 
public class InfoCreator{

   
    public String sayHello() {
       return "Hello there";
    }
}
