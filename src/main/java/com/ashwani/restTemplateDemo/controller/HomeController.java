package com.ashwani.restTemplateDemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.ashwani.restTemplateDemo.service.HomeService;

@RestController
public class HomeController {

	
	@Autowired
	private HomeService homeService;
	
	@GetMapping("/")
	public String home() {
		return homeService.getFakeData();
	}
	
	@GetMapping("/{id}")
	public String getUser(@PathVariable String id) {
		return homeService.getFakeDataUsingId(id);
	}
	
	@GetMapping("/posts")
	public String getPosts() {
		return homeService.getAllPosts();
	}
	
	@GetMapping("/posts/{id}")
	public String getPostsById(@PathVariable String id) {
		return homeService.getPostById(id);
	}
	
	@GetMapping("/comments")
	public String getComments() {
		return homeService.getComments();
	}
	
	
	@GetMapping("/comments/{id}")
	public String getCommentsById(@PathVariable String id) {
		return homeService.getCommentsById(id);
	}
}
