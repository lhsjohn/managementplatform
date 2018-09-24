package team.managementplatform.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import team.managementplatform.mapper.ActivityRecordMapper;
import team.managementplatform.pojo.ActivityRecord;
import team.managementplatform.pojo.ActivityRecordExample;
import team.managementplatform.service.ActivityRecordService;
@Service
public class ActivityRecordServiceImpl implements ActivityRecordService {

	@Autowired
	ActivityRecordMapper activityRecordMapper;
	@Override
	public long countByExample(ActivityRecordExample example) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteByExample(ActivityRecordExample example) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteByPrimaryKey(Integer recordId) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int insert(ActivityRecord record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int insertSelective(ActivityRecord record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<ActivityRecord> selectByExample(ActivityRecordExample example) {
		return activityRecordMapper.selectByExample(example);
	}

	@Override
	public ActivityRecord selectByPrimaryKey(Integer recordId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int updateByExampleSelective(ActivityRecord record, ActivityRecordExample example) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateByExample(ActivityRecord record, ActivityRecordExample example) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateByPrimaryKeySelective(ActivityRecord record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateByPrimaryKey(ActivityRecord record) {
		// TODO Auto-generated method stub
		return 0;
	}

}
