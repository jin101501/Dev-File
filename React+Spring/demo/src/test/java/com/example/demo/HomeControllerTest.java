package com.example.demo;

import static org.hamcrest.Matchers.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.test.web.servlet.MockMvc;

@SpringBootTest
@AutoConfigureMockMvc
public class HomeControllerTest {
    @Autowired
    private MockMvc mockMvc;

    @Test
    @DisplayName("학생 조회")
    public void HomeController() throws Exception {
        this.mockMvc.perform(get("/api/portal/selectEmpAll")).andExpect(status().isOk());
    }

    @Test
    @DisplayName("학생 조회 SP")
    public void selectSpStudent() throws Exception {
        this.mockMvc.perform(get("/api/portal/selectStudent")
                .param("name", "루피"))
                .andExpect(status().isOk());
    }
}
