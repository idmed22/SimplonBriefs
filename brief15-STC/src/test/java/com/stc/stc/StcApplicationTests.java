package com.stc.stc;


import static org.assertj.core.api.Assertions.assertThat;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.stc.stc.dto.ParticipantDto;
import com.stc.stc.dto.UserDto;
import com.stc.stc.entity.Activity;
import com.stc.stc.entity.Admin;
import com.stc.stc.entity.Participant;
import com.stc.stc.entity.User;
import com.stc.stc.exception.ResourceNotFoundException;
import com.stc.stc.repository.ActivityRepository;
import com.stc.stc.repository.AdminRepository;
import com.stc.stc.repository.ParticipantRepository;
import com.stc.stc.repository.UserRepository;
import com.stc.stc.service.ActivityService;
import com.stc.stc.service.AdminService;
import com.stc.stc.service.ParticipantService;
import com.stc.stc.service.UserService;

@SpringBootTest
class StcApplicationTests {

	
	/*
	 * @Autowired private UserRepository userRepository;
	 * 
	 * @Autowired private UserService userService;
	 */
	/*
	 @Autowired
	 private AdminRepository adminRepository;
	 
	 @Autowired
	 private AdminService adminService;
	 
	 @Autowired
	 private ActivityRepository activityRepository;
	 
	 @Autowired
	 private ActivityService activityService;
     */
     
     
   
	
	   /*
		  @Test
		  void testCreateUser(){
		  User user =new User();
		  user.setId(2L);
		  user.setFullName("Mohamedd");
		  user.setEmail("med@testing.ma");
		  user.setEnabled(true); 
		  user.setMale(true); 
		  user.setPassword("passwordd");
		  user.setRole("Tester"); 
		  user.setTel("0703000000"); 
		  user.setUserName("ddddews");
		  userRepository.save(user);
		  }
		  */
	       /*
		  @Test
		  void getAllUsers() {
			    List<User>list = userRepository.findAll();
				assertThat(list).size().isGreaterThan(0);
		  }
		  */
	      /*
		  @Test 
			void TestDeleteUser() {
			  userService.delete(7L);
			}
		   */
	        /*
		  @Test  
			void TestUpdateUser() {
				User user = new User();
			    user = userRepository.findUserById(7L); 
				user.setUserName("med");
				userRepository.save(user);
			}
		  
		  */
			/*
			 * @Test void TestCreateAdmin() { Admin admin = new Admin(); admin.setId(12L);
			 * admin.setLevel("Frontend"); adminRepository.save(admin); }
			 */
	       
			/*
			 * @Test void TestUpdateAdmin() { Admin admin = new Admin(); admin =
			 * adminRepository.findAdminById(9L); admin.setLevel("Senior");
			 * adminRepository.save(admin);
			 * 
			 * }
			 */
			/*
			 * @Test void TestDeleteAmin() { adminService.delete(11L); }
			 */
	         
     
           
			/*
			 * @Test void TestCreateActivity() { Activity activity = new Activity();
			 * activity.setId(2L); activity.setName("Java EE");
			 * activity.setDescription("it's Platforme ... ");
			 * activity.setType("Trainning"); activity.setEnabled(true); LocalDate dt1
			 * =LocalDate.parse("2021-02-12"); activity.setStartedAt(dt1);
			 * activity.setEndedAt(dt1); activityRepository.save(activity); }
			 */
	     
			/*
			 * @Test void TestUpdateActivity() { Activity activity = new Activity();
			 * activity = activityRepository.findActivityById(1L);
			 * activity.setName("jakarta EE"); activity.setType("Event ! ! !");
			 * activityRepository.save(activity); }
			 */
        
	     /*
	     @Test 
	     void TestDeleteActivity() {
	    	 activityService.delete(2L);
	     }
	     */
}
