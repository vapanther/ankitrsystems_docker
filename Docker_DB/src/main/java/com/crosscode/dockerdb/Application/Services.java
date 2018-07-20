package com.crosscode.dockerdb.Application;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Services {
	
	@Autowired
	private DatabaseRepository data;
	
	@RequestMapping("/search")
	public List<AnkitDatabaseApplication2> getAllTopics()
	{
		return data.findAll();
		
	}
	@RequestMapping("/all")
    public List<AnkitDatabaseApplication2> users() {
		AnkitDatabaseApplication2 users = new AnkitDatabaseApplication2();
        users.setId(1);
        users.setName("Sam");
        users.setCity("Varanasi");
        data.save(users);

        return data.findAll();
    }
}
