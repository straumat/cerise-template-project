package com.oakinvest.cerise.myserver.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.Matchers.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

/**
 * Currency-pair information implementation test.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class MyCurrencyPairInformationServiceTest {

    @Autowired
    private MockMvc mvc;

    /**
     * Test for Currency-pair information results.
     */
    @Test
    public void getCurrencyPairInformationResults() throws Exception {
        mvc.perform(get("/")
                .param("mode", "info")
                .param("cp", "XBTUSD-ver4,2")
                .contentType(MediaType.APPLICATION_FORM_URLENCODED))
                .andExpect(status().isOk())
                .andExpect(content().contentTypeCompatibleWith(MediaType.APPLICATION_JSON))
                .andExpect(content().string(not(containsString("\\n\\r"))))
                .andExpect(jsonPath("$", hasSize(1)))
                // First result.
                .andExpect(jsonPath("$[0].cp").value("MY_TEST"))
                .andExpect(jsonPath("$[0].quote").value("USD"))
                .andExpect(jsonPath("$[0].base").value("XBT"))
                .andExpect(jsonPath("$[0].locale").value("en_US"))
                .andExpect(jsonPath("$[0].desc").value("Smoothed averages"))
                .andExpect(jsonPath("$[0].longdesc").value("USD price quotes as compared to Bitcoin value\\n\\nRecommended for casual usage"))
                .andExpect(jsonPath("$[0].symbol[0][0]").value("-$"))
                .andExpect(jsonPath("$[0].symbol[0][1]").value("$"))
                .andExpect(jsonPath("$[0].symbol[1]").isEmpty())
                .andExpect(jsonPath("$[0].digits").value("Arabic"));
    }

}
