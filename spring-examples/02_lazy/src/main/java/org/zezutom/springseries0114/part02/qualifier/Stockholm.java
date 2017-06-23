package org.zezutom.springseries0114.part02.qualifier;

@Component
@Scope(value = "prototype")
public class Stockholm implements ICapital {

    @Override
    public String name() {
        return "Stockholm";
    }
}
