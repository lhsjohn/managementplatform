package team.managementplatform.controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.ObjectMapper;

import team.managementplatform.pojo.Activity;
import team.managementplatform.pojo.ActivityExample;
import team.managementplatform.pojo.ActivityExample.Criteria;
import team.managementplatform.pojo.ActivityRecordExample;
import team.managementplatform.service.ActivityRecordService;
import team.managementplatform.service.ActivityService;

@RestController
@RequestMapping("/activity")
public class ActivityController {

	@Autowired
	ActivityService activityService;
	@Autowired
	ActivityRecordService activityRecordService;

	ObjectMapper mapper = new ObjectMapper();

	/*
	 * @Autowired VenueS
	 */

	// 获取活动列表
	@RequestMapping(value = "/get", method = RequestMethod.GET)
	public String getActivity(@RequestParam(required = false) String type, @RequestParam(required = false) String time,
			@RequestParam(required = false) String location, @RequestParam(required = false) String status) {
		ActivityExample example = new ActivityExample();
		Criteria criteria = example.createCriteria();
		String result = null;

		if (type != "all") {
			criteria.andActivityTypeEqualTo(type);
		}
		if (time != "all") {
			criteria.andActivityTimeEqualTo(time);
		}
		if (status != "all") {
			criteria.andStatusEqualTo(status);
		}
		if (location != "all") {
			criteria.andLocationEqualTo(location);
		}
		List<Activity> activityList = activityService.selectByExampleWithBLOBs(example);

		try {
			result = mapper.writeValueAsString(activityList);
		} catch (Exception e) {

			e.printStackTrace();
		}
		return result;
	}

	// 跳转报名页
	@RequestMapping(value = "/get/{activityId}", method = RequestMethod.GET)
	public String getTheActivity(@PathVariable Integer activityId) throws Exception {
		Activity activity = activityService.selectByPrimaryKey(activityId);
		String result = mapper.writeValueAsString(activity);
		return result;
	}

	// 参加活动
	@RequestMapping(value = "/update", method = RequestMethod.POST)
	public String updateActivity(@RequestParam Integer activityId) {
		String result = null;
		Activity activity = activityService.selectByPrimaryKey(activityId);
		Integer quantity = activity.getParticipantsQuantity();
		activity.setParticipantsQuantity(quantity + 1);
		if (activityService.updateByPrimaryKeySelective(activity) != 0) {
			result = "1";
		} else {
			result = "0";
		}
		return result;
	}

	// 获得回放
	@RequestMapping(value = "/get/playback/{activityId}", method = RequestMethod.GET)
	public String getPlayBack(@PathVariable Integer activityId, HttpServletResponse response) throws IOException {
		ActivityRecordExample example = new ActivityRecordExample();
		example.createCriteria().andActivityIdEqualTo(activityId);
		String path = activityRecordService.selectByExample(example).get(0).getVideoPath();
		String result = "0";

		File video = new File(path);
		try (InputStream in = new FileInputStream(video); ServletOutputStream out = response.getOutputStream();) {
			int length;
			byte[] buffer = new byte[4 * 1024];
			// 向前台输出视频流
			while ((length = in.read(buffer)) > 0) {
				out.write(buffer, 0, length);
			}
			result = "1";
		} catch (FileNotFoundException e) {
			System.out.println("文件读取失败, 文件不存在");
			e.printStackTrace();
		}
		return result;
	}

}
