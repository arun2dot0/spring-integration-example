package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


import model.Person;
import services.api.GatewayService;

@Controller
public class FirstGatewayController{

@Autowired
private GatewayService gatewayService;


 @RequestMapping(value = "/getperson", method = RequestMethod.GET)
 public @ResponseBody Person getPerson() {
  return gatewayService.getPerson();
 }
}