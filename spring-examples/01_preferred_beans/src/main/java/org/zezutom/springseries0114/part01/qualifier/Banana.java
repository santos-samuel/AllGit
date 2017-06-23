package org.zezutom.springseries0114.part01.qualifier;

@Service("banana")
public class Banana implements IFruit {

    @Override
    public String whoAmI() {
        return "banana";
    }
}
