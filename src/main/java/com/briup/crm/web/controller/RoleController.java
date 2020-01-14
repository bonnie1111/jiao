package com.briup.crm.web.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.briup.crm.bean.SysRole;
import com.briup.crm.service.RoleService;

@Controller
@RequestMapping("/role")
public class RoleController {
	@Autowired
	private RoleService roleService;
	
	@RequestMapping("/toRole")
	public String toRole(HttpSession session) {
		List<SysRole> rolelist = roleService.findAllRoles();
		session.setAttribute("rolelist",rolelist);
		return "sysSet/role";
	}
	@RequestMapping("/saveOrUpdate")
	@ResponseBody
	public String saveOrUpdate(SysRole role) {
		roleService.saveOrUpdate(role);
		return "保存成功";
	}
	
	@RequestMapping("/findRoleById/{id}")
	@ResponseBody
	public SysRole findRoleById(@PathVariable long id) {
		SysRole role = roleService.findRoleById(id);
		return role;
	}
	@RequestMapping("/deleteRoleById/{id}")
	@ResponseBody
	public String deleteRoleById(@PathVariable long id) {
		roleService.deleteRoleById(id);
		return "删除成功";
	}
}
