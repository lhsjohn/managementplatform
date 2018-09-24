package team.managementplatform.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import team.managementplatform.mapper.ActivityMapper;
import team.managementplatform.pojo.Activity;
import team.managementplatform.pojo.ActivityExample;
import team.managementplatform.service.ActivityService;
@Service
public class ActivityServiceImpl implements ActivityService {

	@Autowired
	ActivityMapper activityMapper;

	@Override
	public long countByExample(ActivityExample example) {
		return activityMapper.countByExample(example);
	}

	@Override
	public int deleteByExample(ActivityExample example) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteByPrimaryKey(Integer activityId) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int insert(Activity record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int insertSelective(Activity record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Activity> selectByExampleWithBLOBs(ActivityExample example) {
		return activityMapper.selectByExampleWithBLOBs(example);
	}

	@Override
	public List<Activity> selectByExample(ActivityExample example) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Activity selectByPrimaryKey(Integer activityId) {
		return activityMapper.selectByPrimaryKey(activityId);
	}

	@Override
	public int updateByExampleSelective(Activity record, ActivityExample example) {
		return activityMapper.updateByExampleSelective(record, example);
	}

	@Override
	public int updateByExampleWithBLOBs(Activity record, ActivityExample example) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateByExample(Activity record, ActivityExample example) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateByPrimaryKeySelective(Activity record) {
		return activityMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKeyWithBLOBs(Activity record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateByPrimaryKey(Activity record) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
}
