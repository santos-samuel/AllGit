package org.zezutom.springseries0114.part04.test;

import org.zezutom.springseries0114.part04.conf.AppConfig;
import org.zezutom.springseries0114.part04.model.Message;
import org.zezutom.springseries0114.part04.web.ComponentController;
import org.zezutom.springseries0114.part04.web.ServiceController;
import org.zezutom.springseries0114.part04.web.WebController;

@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration(classes = AppConfig.class)
public class ControllerTests {

    @Autowired
    private WebApplicationContext context;

    @Autowired
    private ComponentController componentController;

    @Autowired
    private ServiceController serviceController;

    @Autowired
    private WebController webController;

    private MockMvc mockMvc;

    @Before
    public void setUp() {
        mockMvc = MockMvcBuilders.webAppContextSetup(context).build();
    }

    @Test
    public void webMessage() {
        assertMessage("/web/message", webController.message());
    }

    @Test
    public void serviceMessage() {
        assertMessage("/service/message", serviceController.message());
    }

    @Test
    public void componentMessage() {
        assertMessage("/component/message", componentController.message());
    }

    private void assertMessage(String url, Message expectedMessage) {
        try {
            MvcResult result = mockMvc.perform(get(url))
                    .andExpect(status().isOk())
                    .andReturn();

            MockHttpServletResponse response = result.getResponse();

            assertNotNull(response);
            assertThat(response.getContentAsString(),
                    is("{\"title\":\"" + expectedMessage.getTitle() + "\",\"text\":\"" + expectedMessage.getText() + "\"}"));
        }
        catch (Exception ex) {
            fail(ex.getMessage());
        }

    }
}
