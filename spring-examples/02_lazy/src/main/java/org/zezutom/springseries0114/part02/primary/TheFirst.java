package org.zezutom.springseries0114.part02.primary;

@Component
@Primary
public class TheFirst implements IOrdinal {

    @Override
    public String count() {
        return "first";
    }
}
