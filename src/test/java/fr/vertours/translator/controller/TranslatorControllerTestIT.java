package fr.vertours.translator.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.junit.jupiter.api.Assertions.*;
import static org.hamcrest.CoreMatchers.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
class TranslatorControllerTestIT {

    @Autowired
    MockMvc mockMvc;

    @Test
    void getFrenchTranslation() throws Exception {
        mockMvc.perform(get("/french?number=8"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$", is("huit")));
    }

    @Test
    void getDeutscheTranslation() throws Exception {
        mockMvc.perform(get("/german?number=5"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$", is("fünf")));
    }

    @Test
    void getEnglishTranslation() throws Exception {
        mockMvc.perform(get("/english?number=14"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$", is("fourteen")));
    }
}