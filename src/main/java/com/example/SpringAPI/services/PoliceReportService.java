package com.example.SpringAPI.services;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * Created by Keith on 5/22/17.
 */
@Service
public class PoliceReportService {
    RestTemplate template;

    public PoliceReportService(RestTemplate template) {
        this.template = template;
    }

    public PoliceDataList getUrlData() {
        HttpEntity<PoliceDataList> response = template.exchange("https://data.police.uk/api/crimes-street/all-crime?poly=52.268,0.543:52.794,0.238:52.130,0.478&date=2013-01", HttpMethod.GET, null, PoliceDataList.class);

        return response.getBody();
    }
}
