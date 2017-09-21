package com.boot.mapper.user;

import com.boot.domain.user.BootUser;

public interface BootUserMapper {
	int insertSelective(BootUser bootUser);
	
}
