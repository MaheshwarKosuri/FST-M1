package activities;

public class CustomException extends Exception{
    private String message;
    CustomException(String exMessage){
        this.message = exMessage;
    }

    @Override
    public String getMessage(){
        return message;
    }
}
