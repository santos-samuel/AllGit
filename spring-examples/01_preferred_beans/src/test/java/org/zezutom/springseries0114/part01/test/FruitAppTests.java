package org.zezutom.springseries0114.part01.test;

import org.zezutom.springseries0114.part01.qualifier.IFruit;

import javax.annotation.Resource;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring-config.xml")
public class FruitAppTests {

    @Qualifier("apple")
    @Autowired
    private IFruit fruit;

    @Resource(name = "banana")
    private IFruit fruit2;

    @Test
    public void anAppleShouldBeAutowired() {
        Assert.assertEquals("apple", fruit.whoAmI());
    }

    @Test
    public void aBananaShouldBeTheResource() {
        Assert.assertEquals("banana", fruit2.whoAmI());
    }

}
