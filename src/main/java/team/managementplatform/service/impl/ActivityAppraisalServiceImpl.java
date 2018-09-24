package team.managementplatform.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import team.managementplatform.mapper.ActivityAppraisalMapper;
import team.managementplatform.pojo.ActivityAppraisal;
import team.managementplatform.pojo.ActivityAppraisalExample;
import team.managementplatform.service.ActivityAppraisalService;
@Service
public class ActivityAppraisalServiceImpl implements ActivityAppraisalService {

	@Autowired
	ActivityAppraisalMapper activityAppraisalMapper;
	@Override
	public long countByExample(ActivityAppraisalExample example) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteByExample(ActivityAppraisalExample example) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteByPrimaryKey(Integer appraisalId) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int insert(ActivityAppraisal record) {
		return activityAppraisalMapper.insert(record);
	}

	@Override
	public int insertSelective(ActivityAppraisal record) {
		return activityAppraisalMapper.insertSelective(record);
	}

	@Override
	public List<ActivityAppraisal> selectByExampleWithBLOBs(ActivityAppraisalExample example) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ActivityAppraisal> selectByExample(ActivityAppraisalExample example) {
		return activityAppraisalMapper.selectByExample(example);
	}

	@Override
	public ActivityAppraisal selectByPrimaryKey(Integer appraisalId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int updateByExampleSelective(ActivityAppraisal record, ActivityAppraisalExample example) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateByExampleWithBLOBs(ActivityAppraisal record, ActivityAppraisalExample example) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateByExample(ActivityAppraisal record, ActivityAppraisalExample example) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateByPrimaryKeySelective(ActivityAppraisal record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateByPrimaryKeyWithBLOBs(ActivityAppraisal record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateByPrimaryKey(ActivityAppraisal record) {
		// TODO Auto-generated method stub
		return 0;
	}

}
