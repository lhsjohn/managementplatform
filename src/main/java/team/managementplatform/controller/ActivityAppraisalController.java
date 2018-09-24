package team.managementplatform.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import team.managementplatform.pojo.ActivityAppraisal;
import team.managementplatform.pojo.ActivityAppraisalExample;
import team.managementplatform.service.ActivityAppraisalService;
import team.managementplatform.utils.TimeyyyyMMddHHmmSSUtil;

@RestController
@RequestMapping(value = "/activityAppraisal")
public class ActivityAppraisalController {

	@Autowired
	ActivityAppraisalService activityAppraisalService;

	// 获得评论
	@RequestMapping(value = "/get/{activityId}", method = RequestMethod.GET)
	public List<ActivityAppraisal> getActivityAppraisal(@PathVariable Integer activityId) {
		ActivityAppraisalExample activityAppraisalExample = new ActivityAppraisalExample();
		activityAppraisalExample.createCriteria().andActivityIdEqualTo(activityId);
		return activityAppraisalService.selectByExample(activityAppraisalExample);
	}

	//发表评论
	@RequestMapping(value="/insert",method= RequestMethod.POST)
	public String postAppraisal(@RequestBody ActivityAppraisal activityAppraisal) {
		String result="0";
		activityAppraisal.setAppraisalTime(TimeyyyyMMddHHmmSSUtil.getCurrentTime());
		if(activityAppraisalService.insertSelective(activityAppraisal)!=0) {
			result="1";
		}
		return result;
	}
}
