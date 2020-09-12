package com.manycode.app.resources;

import java.util.Random;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.manycode.app.model.User2;

@RestController
public class UserResource2 {
	private static Logger LOG = LoggerFactory.getLogger(UserResource2.class);

    @RequestMapping("/user/{userId}")
    public User2 getUserRatings(@PathVariable("userId") String userId) {
    	int iii = 0;      
		for (int ii = 0; ii < 2; ii++) {
	        while (true) {
			    iii =getRandomNumberInRange(1000, 2000);
			    LOG.info("intento:" + iii);
	            if (iii==1974) { break;}
	        }
		}        	
    	
        User2 userRating = new User2();
        userRating.initData(userId + ":" +iii);
        return userRating;
    }
      
    
    @GetMapping(value ="/testdestino")
	public String welcome() {
		return "Hola al mundo de Many  con  microservicios 1841";
	}	
    
	private static int getRandomNumberInRange(int min, int max) {
		
		Random r = new Random();
		return r.ints(min, (max + 1)).limit(1).findFirst().getAsInt();
		
	}	
}
