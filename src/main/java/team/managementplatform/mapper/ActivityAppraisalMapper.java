package team.managementplatform.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import team.managementplatform.pojo.ActivityAppraisal;
import team.managementplatform.pojo.ActivityAppraisalExample;

public interface ActivityAppraisalMapper {
    long countByExample(ActivityAppraisalExample example);

    int deleteByExample(ActivityAppraisalExample example);

    int deleteByPrimaryKey(Integer appraisalId);

    int insert(ActivityAppraisal record);

    int insertSelective(ActivityAppraisal record);

    List<ActivityAppraisal> selectByExampleWithBLOBs(ActivityAppraisalExample example);

    List<ActivityAppraisal> selectByExample(ActivityAppraisalExample example);

    ActivityAppraisal selectByPrimaryKey(Integer appraisalId);

    int updateByExampleSelective(@Param("record") ActivityAppraisal record, @Param("example") ActivityAppraisalExample example);

    int updateByExampleWithBLOBs(@Param("record") ActivityAppraisal record, @Param("example") ActivityAppraisalExample example);

    int updateByExample(@Param("record") ActivityAppraisal record, @Param("example") ActivityAppraisalExample example);

    int updateByPrimaryKeySelective(ActivityAppraisal record);

    int updateByPrimaryKeyWithBLOBs(ActivityAppraisal record);

    int updateByPrimaryKey(ActivityAppraisal record);
}