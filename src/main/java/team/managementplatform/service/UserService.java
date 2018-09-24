package team.managementplatform.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import team.managementplatform.pojo.User;
import team.managementplatform.pojo.UserExample;

public interface UserService {
	long countByExample(UserExample example);

	int deleteByExample(UserExample example);

	int deleteByPrimaryKey(Integer userId);

	int insert(User record);

	int insertSelective(User record);

	List<User> selectByExampleWithBLOBs(UserExample example);

	List<User> selectByExample(UserExample example);

	User selectByPrimaryKey(Integer userId);

	int updateByExampleSelective(@Param("record") User record, @Param("example") UserExample example);

	int updateByExampleWithBLOBs(@Param("record") User record, @Param("example") UserExample example);

	int updateByExample(@Param("record") User record, @Param("example") UserExample example);

	int updateByPrimaryKeySelective(User record);

	int updateByPrimaryKeyWithBLOBs(User record);

	int updateByPrimaryKey(User record);
}
