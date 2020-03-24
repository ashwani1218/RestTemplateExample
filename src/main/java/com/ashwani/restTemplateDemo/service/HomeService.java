package com.ashwani.restTemplateDemo.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class HomeService {

	private final String ENDPOINT = "https://jsonplaceholder.typicode.com/todos";
	private final String PostEnpoint = "https://jsonplaceholder.typicode.com/posts";
	private final String CommentEnpoint = "https://jsonplaceholder.typicode.com/comments";
	
	private RestTemplate restTemplate = new RestTemplate();
	
	public String getFakeData() {
		
		return restTemplate.getForObject(ENDPOINT, String.class);
	}

	
	public String getFakeDataUsingId(String id) {
		return restTemplate.getForObject(ENDPOINT+"/"+id, String.class);
	}


	public String getAllPosts() {
		return restTemplate.getForObject(PostEnpoint, String.class);
	}
	
	public String getPostById(String id) {
		return restTemplate.getForObject(PostEnpoint+"/"+id, String.class);
	}


	public String getComments() {
		
		return restTemplate.getForObject(CommentEnpoint, String.class);
	}
	
	public String getCommentsById(String id) {
		return restTemplate.getForObject(CommentEnpoint+"/"+id, String.class);
	}
}
