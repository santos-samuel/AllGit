package org.zezutom.springseries0114.part02.primary;

@Component
@Lazy
public class TheSecond implements IOrdinal {
    @Override
    public String count() {
        return "second";
    }
}
