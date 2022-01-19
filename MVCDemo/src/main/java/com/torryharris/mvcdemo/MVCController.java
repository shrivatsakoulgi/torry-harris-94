package com.torryharris.mvcdemo;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.torryharris.mvcdemo.model.User;

@Controller
public class MVCController {
	private static ArrayList<User> userList;
	
	static {
		userList= new ArrayList<User>();
		userList.add(new User("vinay","vinay@gmail.com",539879L,"Gorakhpur, UP",22,"yogiji"));
		userList.add(new User("kavya","kavya@gmail.com",342984729L,"Madikeri",22,"coffee"));
		userList.add(new User("shrenik","shrenik@gmail.com",539463879L,"Jalna, Maharashtra",22,"optimus"));
		userList.add(new User("shraddha","shraddha@gmail.com",928634059L,"Ratnagiri, Maharashtra",22,"apoos"));
	}
	
	@PostMapping("/login")
	public ModelAndView login(@RequestParam("username") String username, @RequestParam("password") String password) {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("response.jsp");
		boolean userAuthenticated=false;
		for(User user: userList) {
		if(username.equals(user.getUserName()) && password.equals(user.getPassword())) {
			userAuthenticated=true;
			mv.addObject("username", username);
			break;
			}
		}
		mv.addObject("status", userAuthenticated);
		return mv;
	}
	
	@PostMapping("/register")
	public ModelAndView register(@RequestParam("user") String userName,@RequestParam("email") String email,
			@RequestParam("phone") long phone,@RequestParam("address") String address,
			@RequestParam("age") int age,@RequestParam("password1") String password) {
	
		User user = new User(userName, email, phone, address, age, password);
		userList.add(user);
		System.out.println(user);
		ModelAndView mv = new ModelAndView();
		mv.setViewName("reg_success.jsp");
		mv.addObject("username",userName);
		return mv;
				
	}

}
