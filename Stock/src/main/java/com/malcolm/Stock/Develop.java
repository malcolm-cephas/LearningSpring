package com.malcolm.Stock;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Develop 
{
    @Autowired 
        private Computer comp;
        
    public void build()
    {
        comp.compile();
        System.out.println("Running Stock Project without inbuilt dependency"); 
    }    
}
