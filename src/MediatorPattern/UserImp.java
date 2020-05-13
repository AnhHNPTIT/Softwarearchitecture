package MediatorPattern;
public class UserImp extends User{
    public UserImp(ChatMediator mediator, String name){
        super(mediator, name);
    }

    @Override
    public void send(String msg){
        System.out.println("----------------");
        System.out.println(this.name + " is sending the message: " + msg);
        mediator.sendMessage(msg, this);
    }

    @Override
    public void receive(String msg){
        System.out.println(this.name + " received the message: " + msg);
    }
}

