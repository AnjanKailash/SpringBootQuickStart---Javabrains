package com.javabrains.springbootstarter.topic;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {

	@RequestMapping("/topics")
	public List<Topic> getAllTopics() {
		List<Topic> topics = new ArrayList<Topic>();
		
		topics.add(new Topic("Spring", "Spring Framework", "Spring Framework Description"));
		topics.add(new Topic("Hibernate", "Hibernate ORM", "Hibernate ORM Description"));
		topics.add(new Topic("JavaScript", "JavaScript Scripting", "JavaScript Description"));
		
		return topics;
	}
}
