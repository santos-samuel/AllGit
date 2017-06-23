package org.zezutom.springseries0114.part04.web;

import org.zezutom.springseries0114.part04.model.Message;
import org.zezutom.springseries0114.part04.model.MessageBuilder;

@Controller
@RequestMapping("/web/message")
public class WebController {

    @Autowired
    private MessageBuilder messageBuilder;

    @RequestMapping(method = RequestMethod.GET)
    public @ResponseBody
    Message message() {
        return messageBuilder.getInstance("Controller", "An old good controller.");
    }
}
