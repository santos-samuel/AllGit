package org.zezutom.springseries0114.part01.primary;

@Primary
@Service
public class HelloWorldMessage implements IMessage {

    @Override
    public String getMessage() {
        return "Hello world!";
    }
}
