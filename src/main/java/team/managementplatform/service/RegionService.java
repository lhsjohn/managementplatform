package team.managementplatform.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import team.managementplatform.pojo.Region;
import team.managementplatform.pojo.RegionExample;

public interface RegionService {

	long countByExample(RegionExample example);

	int deleteByExample(RegionExample example);

	int deleteByPrimaryKey(Integer regionId);

	int insert(Region record);

	int insertSelective(Region record);

	List<Region> selectByExample(RegionExample example);

	Region selectByPrimaryKey(Integer regionId);

	int updateByExampleSelective(@Param("record") Region record, @Param("example") RegionExample example);

	int updateByExample(@Param("record") Region record, @Param("example") RegionExample example);

	int updateByPrimaryKeySelective(Region record);

	int updateByPrimaryKey(Region record);
}
