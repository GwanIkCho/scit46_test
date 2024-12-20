//package com.app.scit_task.test;
//
//import org.apache.hc.core5.http.HttpEntity;
//import org.apache.hc.core5.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.client.RestTemplate;
//
//import java.net.http.HttpHeaders;
//
//public class MusicSearch {
//    public String search(String accessToken, String q){ //q는 검색어
//
//        RestTemplate rest = new RestTemplate();
//        HttpHeaders headers = new HttpHeaders();
//        headers.add("Authorization", "Bearer " + accessToken);;
//        headers.add("Host", "api.spotify.com");
//        headers.add("Content-type", "application/json");
//        String body = "";
//
//        HttpEntity<String> requestEntity = new HttpEntity<String>(body, headers);
//        ResponseEntity<String> responseEntity = rest.exchange("https://api.spotify.com/v1/search?type=track&q=" + q, HttpMethod.GET, requestEntity, String.class);
//        HttpStatus httpStatus = responseEntity.getStatusCode();
//        int status = httpStatus.value(); //상태 코드가 들어갈 status 변수
//        String response = responseEntity.getBody();
//        System.out.println("Response status: " + status);
//        System.out.println(response);
//
//        return response;
//    }
//}