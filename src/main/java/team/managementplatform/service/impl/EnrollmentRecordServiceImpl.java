package team.managementplatform.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import team.managementplatform.mapper.EnrollmentRecordMapper;
import team.managementplatform.pojo.EnrollmentRecord;
import team.managementplatform.pojo.EnrollmentRecordExample;
import team.managementplatform.service.EnrollmentRecordService;
@Service
public class EnrollmentRecordServiceImpl implements EnrollmentRecordService {

	@Autowired
	EnrollmentRecordMapper enrollmentRecordMapper;
	@Override
	public long countByExample(EnrollmentRecordExample example) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteByExample(EnrollmentRecordExample example) {
		return enrollmentRecordMapper.deleteByExample(example);
	}

	@Override
	public int deleteByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int insert(EnrollmentRecord record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int insertSelective(EnrollmentRecord record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<EnrollmentRecord> selectByExample(EnrollmentRecordExample example) {
		return enrollmentRecordMapper.selectByExample(example);
	}

	@Override
	public EnrollmentRecord selectByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int updateByExampleSelective(EnrollmentRecord record, EnrollmentRecordExample example) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateByExample(EnrollmentRecord record, EnrollmentRecordExample example) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateByPrimaryKeySelective(EnrollmentRecord record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateByPrimaryKey(EnrollmentRecord record) {
		// TODO Auto-generated method stub
		return 0;
	}

}
