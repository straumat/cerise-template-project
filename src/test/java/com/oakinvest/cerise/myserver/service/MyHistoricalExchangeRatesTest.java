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
 * Historical exchange rates implementation test.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class MyHistoricalExchangeRatesTest {

    @Autowired
    private MockMvc mvc;

    /**
     * Historical exchange rates test results.
     */
    @Test
    public void getHistoricalExchangeRatesResults() throws Exception {

        // Testing all the data.
        mvc.perform(get("/")
                .param("mode", "history")
                .param("cp", "XBTUSD-ver4,2")
                .contentType(MediaType.APPLICATION_FORM_URLENCODED))
                .andExpect(status().isOk())
                .andExpect(content().contentTypeCompatibleWith(MediaType.APPLICATION_JSON))
                .andExpect(content().string(not(containsString("\\n\\r"))))
                .andExpect(jsonPath("$", hasSize(1)))
                // First result.
                .andExpect(jsonPath("$[0].cp").value("MY_TEST"))
                .andExpect(jsonPath("$[0].time").value(1488760000))
                .andExpect(jsonPath("$[0].rates.typical").value(1300));
    }

}
