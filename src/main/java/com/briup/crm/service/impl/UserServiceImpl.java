package com.briup.crm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.briup.crm.bean.SysUser;
import com.briup.crm.bean.SysUserExample;
import com.briup.crm.dao.SysUserMapper;
import com.briup.crm.service.UserService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
@Service
public class UserServiceImpl implements UserService{
	@Autowired
	private SysUserMapper userMapper; 
	
	@Override
	public SysUser login(String name, String password) throws Exception {
		//根据用户名查询数据库中是否有对应的用户的信息
		SysUserExample example = new SysUserExample();
		example.createCriteria().andUsrNameEqualTo(name);
		List<SysUser> userlist = userMapper.selectByExample(example);
		if(userlist.size()>0) {
			SysUser user = userlist.get(0);
			//判断密码是否正确
			if(user.getUsrPassword().equals(password)) {
					return user;
			}else {
				throw new Exception("密码输入错误,请重新输入");
			}
		}else {
			throw new Exception("用户名输入错误,请重新输入");
		}
		
	}
	@Override
	public PageInfo<SysUser> findAllUser(int curPage, int size) {
		PageHelper.startPage(curPage, size);
		SysUserExample example = new SysUserExample();
		List<SysUser> userlist = userMapper.selectByExample(example);
		PageInfo<SysUser> userinfo = new PageInfo<SysUser>(userlist);
		return userinfo;
	}
	@Override
	public void saveOrUpdate(SysUser user) {
		if(user.getUsrId()==null) {
			userMapper.insertSelective(user);
		}else{
			userMapper.updateByPrimaryKeySelective(user);
		}
		
	}
	@Override
	public void deleteUserById(long id) {
		userMapper.deleteByPrimaryKey(id);		
	}
	@Override
	public SysUser findUserById(long id) {
		SysUser user = userMapper.selectByPrimaryKey(id);
		return user;
	}
	

}
