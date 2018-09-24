package team.managementplatform.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import team.managementplatform.pojo.Activity;
import team.managementplatform.pojo.EnrollmentRecord;
import team.managementplatform.pojo.EnrollmentRecordExample;
import team.managementplatform.pojo.User;
import team.managementplatform.pojo.UserExample;
import team.managementplatform.service.ActivityService;
import team.managementplatform.service.EnrollmentRecordService;
import team.managementplatform.service.UserService;
import team.managementplatform.utils.SessionUtil;

@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	UserService userService;
	@Autowired
	EnrollmentRecordService enrollmentRecordService;
	@Autowired
	ActivityService activityService;

	// 注册用户
	@RequestMapping(value = "/insert", method = RequestMethod.POST)
	public String addUser(@RequestBody User user, @RequestParam String code) {

		String result;
		String openid = SessionUtil.getCurrentOpenid(code);
		UserExample example = new UserExample();
		example.createCriteria().andOpenidEqualTo(openid);
		User user2 = userService.selectByExample(example).get(0);
		if (user2 != null) {
			result = "2";
			return result;
		}
		if (userService.insertSelective(user) != 0) {
			result = "1";
		} else {
			result = "2";
		}
		return result;
	}

	// 获得用户
	@RequestMapping(value = "/get/{userId}", method = RequestMethod.GET)
	public User getUser(@PathVariable Integer userId) {
		return userService.selectByPrimaryKey(userId);
	}

	// 更新资料
	@RequestMapping(value = "/update", method = RequestMethod.POST)
	public String updateUser(@RequestBody User user, HttpSession session) {
		User user2 = (User) session.getAttribute("user");
		user.setUserId(user2.getUserId());
		String result;
		if (userService.updateByPrimaryKeySelective(user) != 0) {
			result = "1";
			session.setAttribute("user", user);
		} else {
			result = "2";
		}
		return result;
	}

	// 获得用户参与的活动
	@RequestMapping(value = "/get/activity/{status}", method = RequestMethod.GET)
	public List<Activity> getMyActivity(HttpSession session, @PathVariable String status) {
		User user = (User) session.getAttribute("user");
		Integer userId = user.getUserId();
		EnrollmentRecordExample enrollmentRecordExample = new EnrollmentRecordExample();
		enrollmentRecordExample.createCriteria().andEnrollStatusEqualTo(status).andUserIdEqualTo(userId);

		List<EnrollmentRecord> enrollmentRecordList = enrollmentRecordService.selectByExample(enrollmentRecordExample);
		List<Activity> activityList = new ArrayList<>();
		for (EnrollmentRecord enrollmentRecord : enrollmentRecordList) {
			Activity activity = activityService.selectByPrimaryKey(enrollmentRecord.getActivityId());
			activityList.add(activity);
		}
		return activityList;
	}

	// 取消报名
	@RequestMapping(value = "/update/activity/{activityId}", method = RequestMethod.DELETE)
	public String deleteEnrollmentRecord(HttpSession session, @PathVariable Integer activityId) {

	}

}
