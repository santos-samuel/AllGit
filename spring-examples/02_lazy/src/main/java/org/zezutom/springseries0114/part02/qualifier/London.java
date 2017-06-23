package org.zezutom.springseries0114.part02.qualifier;

@Component
@Lazy
public class London implements ICapital {
    @Override
    public String name() {
        return "London";
    }
}
