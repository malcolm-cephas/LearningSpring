package com.malcolm.Stock;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("laptop")
public class Desktop implements Computer 
{
    public void compile()
    {
        System.out.println("Compiling with code and bugs");  
    }
    
}
