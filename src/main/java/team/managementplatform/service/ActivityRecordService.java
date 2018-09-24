package team.managementplatform.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import team.managementplatform.pojo.ActivityRecord;
import team.managementplatform.pojo.ActivityRecordExample;

public interface ActivityRecordService {
	long countByExample(ActivityRecordExample example);

	int deleteByExample(ActivityRecordExample example);

	int deleteByPrimaryKey(Integer recordId);

	int insert(ActivityRecord record);

	int insertSelective(ActivityRecord record);

	List<ActivityRecord> selectByExample(ActivityRecordExample example);

	ActivityRecord selectByPrimaryKey(Integer recordId);

	int updateByExampleSelective(@Param("record") ActivityRecord record,
			@Param("example") ActivityRecordExample example);

	int updateByExample(@Param("record") ActivityRecord record, @Param("example") ActivityRecordExample example);

	int updateByPrimaryKeySelective(ActivityRecord record);

	int updateByPrimaryKey(ActivityRecord record);
}
