package com.prerna.springboot.demo.Mycoolapp.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController
{
    // expose "/" that return "Hello World"

      @GetMapping(value = "/")
      public String sayHello()
      {
          return "Hello World!";

      }
}
