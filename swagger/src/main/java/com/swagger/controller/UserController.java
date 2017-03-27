package com.swagger.controller;


import java.util.HashMap; import java.util.Map;

import org.springframework.web.bind.annotation.RequestBody; import org.springframework.web.bind.annotation.RequestMapping; import org.springframework.web.bind.annotation.RequestMethod; import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api; import io.swagger.annotations.ApiImplicitParam; import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse; import io.swagger.annotations.ApiResponses;

@Api("用户服务") @RestController @RequestMapping("/user") public class UserController {
	@ApiOperation("用户注册")
	@ApiImplicitParams({
	    @ApiImplicitParam(paramType="query",defaultValue="user123",required=true,dataType="String",name="username",value="用户名"),
	    @ApiImplicitParam(paramType="query",defaultValue="password123",required=true,dataType="String",name="pwd",value="密码")
	})
	@ApiResponses({
	    @ApiResponse(code=400,message="请求参数不正确"),
	    @ApiResponse(code=401,message="请求未被授权"),
	    @ApiResponse(code=403,message="请求被阻止"),
	    @ApiResponse(code=404,message="请求页面不存在")
	})
	@RequestMapping(value= "/register", method=RequestMethod.GET)
	public Map<String,String> register(String username,String pwd){
	    Map<String, String> resultMap= new HashMap<>();
	    resultMap.put("msg", "200");
	    resultMap.put("username", username);
	    resultMap.put("pwd", pwd);
	    return resultMap;
	}

	@ApiOperation(value = "用户登录", notes = "用户登录,需要输入用户名和密码")
	@ApiParam(defaultValue="{\"username\":\"test\",\"pwd\":\"123456\"}",required=true,name="user",value="用户")
	@ApiResponses({
	    @ApiResponse(code=400,message="请求参数不正确"),
	    @ApiResponse(code=401,message="请求未被授权"),
	    @ApiResponse(code=403,message="请求被阻止"),
	    @ApiResponse(code=404,message="请求页面不存在")
	})
	@RequestMapping(value= "/login", method=RequestMethod.POST)
	public User login(@RequestBody User user){
	    return user;
	}

	
	class User{
		private String username;
		private String password;
		public String getUsername() {
			return username;
		}
		public void setUsername(String username) {
			this.username = username;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}	
		
		
		
	}
	
}
