package com.boot.service.user;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.boot.domain.user.BootUser;
import com.boot.mapper.user.BootUserMapper;
@Service("bootUserService")
public class BootUserServiceImpl implements BootUserService {
	@Resource
	private BootUserMapper bootUserMapper;
	
	@Override
	public String insertBootUser(BootUser bootUser) {
		return null;
	}

}
