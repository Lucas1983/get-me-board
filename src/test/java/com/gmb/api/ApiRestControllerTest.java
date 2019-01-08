package com.gmb.api;

import com.gmb.api.ApiRestController;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@WebMvcTest(controllers = ApiRestController.class)
public class ApiRestControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void testRestApi_1() throws Exception {

        mockMvc.perform(get("/api/test1"))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(content().string("Test REST API 1"));
    }

    @Test
    public void testRestApi_2() throws Exception {

        mockMvc.perform(get("/api/test2"))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(content().string("Test REST API 2"));
    }
}
