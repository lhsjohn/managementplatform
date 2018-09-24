package team.managementplatform.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import team.managementplatform.pojo.Qualification;
import team.managementplatform.pojo.QualificationExample;

public interface QualificationMapper {
    long countByExample(QualificationExample example);

    int deleteByExample(QualificationExample example);

    int deleteByPrimaryKey(Integer qualificationId);

    int insert(Qualification record);

    int insertSelective(Qualification record);

    List<Qualification> selectByExample(QualificationExample example);

    Qualification selectByPrimaryKey(Integer qualificationId);

    int updateByExampleSelective(@Param("record") Qualification record, @Param("example") QualificationExample example);

    int updateByExample(@Param("record") Qualification record, @Param("example") QualificationExample example);

    int updateByPrimaryKeySelective(Qualification record);

    int updateByPrimaryKey(Qualification record);
}