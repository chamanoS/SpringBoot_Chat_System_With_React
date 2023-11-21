package chat.system.Chat.system.controller;

import chat.system.Chat.system.model.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
public class ChatController {

    @Autowired
    private SimpleMessageTemplate simpleMessageTemplate;
    @MessageMapping("/message"); /* /app/message; */
    @SendTo("/chatroom/public")
     public Message receivePublicMessage(@Payload Message message){
        return message;
    }

    @MessageMapping("/private-message");
    public Message receivePrivateMessage(@Payload Message message){


        return message;
    }

}
