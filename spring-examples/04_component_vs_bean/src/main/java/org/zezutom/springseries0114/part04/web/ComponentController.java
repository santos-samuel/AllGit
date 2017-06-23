package org.zezutom.springseries0114.part04.web;

import org.zezutom.springseries0114.part04.model.Message;
import org.zezutom.springseries0114.part04.model.MessageBuilder;

@Component
@RequestMapping("/component/message")
public class ComponentController {

    @Autowired
    private MessageBuilder messageBuilder;

    @RequestMapping(method = RequestMethod.GET)
    public @ResponseBody
    Message message() {
        return messageBuilder.getInstance("Component", "greetings from a component!");
    }

}
