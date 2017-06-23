package org.zezutom.springseries0114.part01.qualifier;

@Service("apple")
public class Apple implements IFruit {

    @Override
    public String whoAmI() {
        return "apple";
    }
}
