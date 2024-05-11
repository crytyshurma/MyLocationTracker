package com.example.locationtracker;

import com.google.gson.Gson;

import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import java.io.IOException;

public class LocationSender {
public void sendLocation(LocationData locationData)
{
    //converting LocationData Object to JSON
    Gson gson=new Gson();
    String json =gson.toJson(locationData);

    //creating http client
    try(CloseableHttpClient httpClient= HttpClients.createDefault()) {
        //creating http post request
        HttpPost httpPost = new HttpPost("https://example.com/api/location");
        //Set headers
        httpPost.setHeader("Content-Type", "application/json");

        //Set JSON as request body
        StringEntity entity = new StringEntity(json);
        httpPost.setEntity(entity);

        //Executing request
        try (CloseableHttpResponse response = httpClient.execute(httpPost)) {
            HttpEntity responseEntity = response.getEntity();
            //handling response if needed
            if (responseEntity != null) {
                System.out.println("Response: " + EntityUtils.toString(responseEntity));
            }
        }
    }catch(IOException e)
    {
        e.printStackTrace();
            }
        }
    }

