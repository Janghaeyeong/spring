package com.example.service;

import com.example.vo.Role;

public interface AdminService {
	
	void deleteUser(String id, Role role);
	
	void login(String id, String pwd);
}
