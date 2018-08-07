package com.oakinvest.cerise.myserver.service;

import com.oakinvest.cerise.dto.CurrentExchangeRateParameters;
import com.oakinvest.cerise.dto.CurrentExchangeRateResult;
import com.oakinvest.cerise.service.CurrentExchangeRateService;
import com.oakinvest.cerise.util.generic.CeriseService;
import org.springframework.stereotype.Service;

import java.util.LinkedList;
import java.util.List;

/**
 * Current exchange rate implementation.
 */
@Service
public class MyCurrentExchangeRateService extends CeriseService implements CurrentExchangeRateService {

    @Override
    public List<CurrentExchangeRateResult> getCurrentExchangeRate(final CurrentExchangeRateParameters parameters) {
        List<CurrentExchangeRateResult> results = new LinkedList<>();

        final CurrentExchangeRateResult dummyResponse = new CurrentExchangeRateResult();
        dummyResponse.setCp("MY_TEST");
        dummyResponse.setTime(1488767410.5463133);
        dummyResponse.addRates("typical", 1349.332215);
        dummyResponse.addRates("high", 1351.2);
        results.add(dummyResponse);

        return results;
    }

}
