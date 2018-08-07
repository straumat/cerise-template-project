package com.oakinvest.cerise.myserver.service;

import com.oakinvest.cerise.dto.SupportedCurrencyPairTokensParameters;
import com.oakinvest.cerise.dto.SupportedCurrencyPairTokensResult;
import com.oakinvest.cerise.service.SupportedCurrencyPairTokensService;
import org.springframework.stereotype.Service;

import java.util.LinkedList;
import java.util.List;

/**
 * Enumerating supported currency-pair token implementation.
 */
@Service
public class MySupportedCurrencyPairTokensService implements SupportedCurrencyPairTokensService {

    @Override
    public List<SupportedCurrencyPairTokensResult> getSupportedCurrencyPairTokens(final SupportedCurrencyPairTokensParameters parameters) {
        List<SupportedCurrencyPairTokensResult> results = new LinkedList<>();

        final SupportedCurrencyPairTokensResult dummyResponse = new SupportedCurrencyPairTokensResult();
        dummyResponse.setCp("MY_TEST");
        dummyResponse.setQuote("USD");
        dummyResponse.setBase("XBT");
        dummyResponse.setLocale("en_US");
        dummyResponse.setDesc("Smoothed averages");
        results.add(dummyResponse);

        return results;
    }

}
