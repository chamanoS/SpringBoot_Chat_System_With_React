package chat.system.Chat.system.model;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class Message {
    private  String senderName;
    private  String receiverName;
    private  String message;
    private  String date;
    private Status status;

}
