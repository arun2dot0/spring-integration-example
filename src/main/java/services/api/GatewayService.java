package services.api;


import org.springframework.integration.annotation.Header;
import org.springframework.messaging.handler.annotation.Payload;

import model.Person;


public interface GatewayService {
 @Payload("new java.util.Date()")
 public Person getPerson();
}
