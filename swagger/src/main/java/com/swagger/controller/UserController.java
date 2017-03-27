package com.swagger.controller;


import java.util.HashMap; import java.util.Map;

import org.springframework.web.bind.annotation.RequestBody; import org.springframework.web.bind.annotation.RequestMapping; import org.springframework.web.bind.annotation.RequestMethod; import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api; import io.swagger.annotations.ApiImplicitParam; import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse; import io.swagger.annotations.ApiResponses;

@Api("�û�����") @RestController @RequestMapping("/user") public class UserController {
	@ApiOperation("�û�ע��")
	@ApiImplicitParams({
	    @ApiImplicitParam(paramType="query",defaultValue="user123",required=true,dataType="String",name="username",value="�û���"),
	    @ApiImplicitParam(paramType="query",defaultValue="password123",required=true,dataType="String",name="pwd",value="����")
	})
	@ApiResponses({
	    @ApiResponse(code=400,message="�����������ȷ"),
	    @ApiResponse(code=401,message="����δ����Ȩ"),
	    @ApiResponse(code=403,message="������ֹ"),
	    @ApiResponse(code=404,message="����ҳ�治����")
	})
	@RequestMapping(value= "/register", method=RequestMethod.GET)
	public Map<String,String> register(String username,String pwd){
	    Map<String, String> resultMap= new HashMap<>();
	    resultMap.put("msg", "200");
	    resultMap.put("username", username);
	    resultMap.put("pwd", pwd);
	    return resultMap;
	}

	@ApiOperation(value = "�û���¼", notes = "�û���¼,��Ҫ�����û���������")
	@ApiParam(defaultValue="{\"username\":\"test\",\"pwd\":\"123456\"}",required=true,name="user",value="�û�")
	@ApiResponses({
	    @ApiResponse(code=400,message="�����������ȷ"),
	    @ApiResponse(code=401,message="����δ����Ȩ"),
	    @ApiResponse(code=403,message="������ֹ"),
	    @ApiResponse(code=404,message="����ҳ�治����")
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
