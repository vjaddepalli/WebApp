package com.zensar;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
@RestController
public class HelloRestController{
  @GetMapping("/Hello")
  public String getmessage()
  {
    return "Welcome to Jenkins Learning";
  }
}
