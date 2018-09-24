package team.managementplatform.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import team.managementplatform.pojo.Institution;
import team.managementplatform.pojo.InstitutionExample;

public interface InstitutionMapper {
    long countByExample(InstitutionExample example);

    int deleteByExample(InstitutionExample example);

    int deleteByPrimaryKey(Integer institutionId);

    int insert(Institution record);

    int insertSelective(Institution record);

    List<Institution> selectByExample(InstitutionExample example);

    Institution selectByPrimaryKey(Integer institutionId);

    int updateByExampleSelective(@Param("record") Institution record, @Param("example") InstitutionExample example);

    int updateByExample(@Param("record") Institution record, @Param("example") InstitutionExample example);

    int updateByPrimaryKeySelective(Institution record);

    int updateByPrimaryKey(Institution record);
}