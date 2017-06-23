package org.zezutom.springseries0114.part02.primary;

@Component
@Scope(value = "prototype")
public class TheThird implements IOrdinal {

    @Override
    public String count() {
        return "third";
    }
}
