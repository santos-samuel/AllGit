package org.zezutom.springseries0114.part02.qualifier;

@Component
public class Prague implements ICapital {

    @Override
    public String name() {
        return "Prague";
    }
}
