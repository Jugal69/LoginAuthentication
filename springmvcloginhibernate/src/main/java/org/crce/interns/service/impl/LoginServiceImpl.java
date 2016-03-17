/*
 * author:Khusaal Giri
 */
package org.crce.interns.service.impl;

import org.crce.interns.dao.*;
import org.crce.interns.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/*
 * Task: Calls DAO
 */
@Service("loginService")
public class LoginServiceImpl implements LoginService {

	@Autowired
	private LoginDAO loginDAO;

	/*
	 * Task; Sets DAO
	 * Return type: Void	
	 */
	public void setLoginDAO(LoginDAO loginDAO) {
		this.loginDAO = loginDAO;
	}

	/*
	 *Task: Checks Login(Calls DAO)
	 *Return Type: String
	 */
			
	public String checkLogin(String userName, String userPassword) {
		System.out.println("In Service class...Check Login");
		return loginDAO.checkLogin(userName, userPassword);
	}
}