package org.zezutom.springseries0114.part01.qualifier;

@Service("lemon")
@Lazy
public class Lemon implements IFruit {

    @Override
    public String whoAmI() {
        return "lemon";
    }
}
