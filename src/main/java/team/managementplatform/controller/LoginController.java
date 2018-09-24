package team.managementplatform.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import team.managementplatform.pojo.User;
import team.managementplatform.pojo.UserExample;
import team.managementplatform.service.UserService;
import team.managementplatform.utils.SessionUtil;

@RestController
public class LoginController {

	@Autowired
	UserService userService;

	@RequestMapping("/login")
	public String login(HttpSession session, @RequestParam String code) {
		String openid = SessionUtil.getCurrentOpenid(code);
		UserExample example = new UserExample();
		example.createCriteria().andOpenidEqualTo(openid);
		User user = userService.selectByExample(example).get(0);
		session.setAttribute("user", user);
		return "success";
	}

}
