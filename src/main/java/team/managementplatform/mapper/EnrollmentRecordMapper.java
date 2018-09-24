package team.managementplatform.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import team.managementplatform.pojo.EnrollmentRecord;
import team.managementplatform.pojo.EnrollmentRecordExample;

public interface EnrollmentRecordMapper {
    long countByExample(EnrollmentRecordExample example);

    int deleteByExample(EnrollmentRecordExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(EnrollmentRecord record);

    int insertSelective(EnrollmentRecord record);

    List<EnrollmentRecord> selectByExample(EnrollmentRecordExample example);

    EnrollmentRecord selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") EnrollmentRecord record, @Param("example") EnrollmentRecordExample example);

    int updateByExample(@Param("record") EnrollmentRecord record, @Param("example") EnrollmentRecordExample example);

    int updateByPrimaryKeySelective(EnrollmentRecord record);

    int updateByPrimaryKey(EnrollmentRecord record);
}