package com.javen.controller;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.apache.commons.io.FileUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;  
import org.springframework.ui.Model;  
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;  
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.javen.model.User;
import com.javen.service.IUserService;
import com.javen.util.HttpServletRequestUtil;
  
  
@Controller  
@RequestMapping("/user")  
// /user/**
public class UserController {  
	private static Logger log=LoggerFactory.getLogger(UserController.class);
	 @Resource  
	 private IUserService userService;     
    
    // /user/userLogin?dom={login_name:'xzw',password:'123456'}
    @RequestMapping(value="/userLogin",method=RequestMethod.GET) 
	@ResponseBody 
    public Map<String, Object> userLogin(HttpServletRequest request){  
		Map<String, Object> modelMap = new HashMap<String, Object>();
//		String wechartStr = HttpServletRequestUtil.getString(request, "wechartStr");
		
//        String loginName = request.getParameter("login_name").toString();  
//        String password = request.getParameter("password").toString();  
        String loginName = "xzw";  
        String password = "123456";  
        User user = new User();
		
        user.setLoginName(loginName);
        user.setPassword(password);
        List<User> list = userService.queryUserList(user);
		if(list.size()>0) {
			modelMap.put("user", list.get(0));  
			modelMap.put("success", true);
			modelMap.put("errMsg", "登录成功");
		}else {
			modelMap.put("success", false);
			modelMap.put("errMsg", "用户账号或密码错误");
		}
		return modelMap;
    }  
}  