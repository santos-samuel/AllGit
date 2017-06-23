package org.zezutom.springseries0114.part04.conf;

import org.zezutom.springseries0114.part04.model.MessageBuilder;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "org.zezutom.springseries0114.part04.web")
public class AppConfig extends WebMvcConfigurerAdapter {

    @Bean
    public MessageBuilder messageBuilder() {
        return new MessageBuilder();
    }
}
