package com.cos.blog.test;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController//스프링이 com.cos.blog패키지 이하를 스캔해서 모든 파일을 메모리에 new하는 것이 아님
		   //특정 어노테이션이 붙어있는 클래스 파일들을 new해서 Ioc스프링 컨테이너에 관리해준다

public class BlogControllerTest {

	//http://localhost:8080/test/hello
	@RequestMapping("/test/hello")
	public String hello() {
		return "<h1>hello spring boot</h1>";
	}

}
