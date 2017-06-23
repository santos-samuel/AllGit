package org.zezutom.springseries0114.part02;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;

@Component
@Aspect
public class BeanLogger {

    private Collection<String> beans = new HashSet<String>();

    @AfterReturning("execution(* org.zezutom.springseries0114.part02.*.*(..))" )
    public void logConstructor(JoinPoint joinPoint) {
        beans.add(joinPoint.getSignature().getName());
    }

    public Collection<String> getBeans() {
        return Collections.unmodifiableCollection(beans);
    }

    public void reload() {
        beans.clear();
    }
}
