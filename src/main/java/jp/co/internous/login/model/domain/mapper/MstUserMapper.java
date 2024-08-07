package jp.co.internous.login.model.domain.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import jp.co.internous.login.model.domain.MstUser;




@Mapper
public interface MstUserMapper {
	
	@Select("SELECT * FORM mst_user WHERE user_name = #{userName} AND password =#{password}")
	MstUser findByUserNameAndPassword( String userName, String password);

}
