package springmvc2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class IndexController {
	
	// view 이름을 반환, index.do을 호출하면 jsp/index.jsp로 반환(이동)
	@RequestMapping(value="/index.do", method= {RequestMethod.GET, RequestMethod.POST})
	public String index() {
		return "/index"; // /jsp/index.jsp 가 됨
	}

}
