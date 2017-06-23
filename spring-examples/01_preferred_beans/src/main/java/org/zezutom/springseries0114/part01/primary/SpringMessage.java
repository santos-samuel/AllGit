package org.zezutom.springseries0114.part01.primary;

@Service("springMessage")
@Lazy
public class SpringMessage implements IMessage {

    @Override
    public String getMessage() {
        return "Spring is fun!";
    }
}
