package com.chat.Controller;

import java.util.Date;

import org.slf4j.*;
import org.springframework.messaging.handler.annotation.*;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import com.chat.dto.*;

@Controller
public class ChatController {

  //private Logger logger = LoggerFactory.getLogger(getClass());

  @RequestMapping(value="/index",method=RequestMethod.GET)
  public String viewApplication() {
    return "index";
  }

  @MessageMapping("/chat")
  @SendTo("/topic/message")
  public OutputMessage sendMessage(Message message) {
    //logger.info("Message sent");
    return new OutputMessage(message, new Date());
  }
}