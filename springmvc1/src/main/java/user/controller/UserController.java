package user.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import user.domain.User;
import user.service.UserService;

@Controller
public class UserController {
	
	private UserService userService;
	
	@RequestMapping("/getUser.do")
	public ModelAndView getUser(@RequestParam String name) throws Exception {
		User user = new User();
		user.setName("ȫ�浿");
		user.setId(5);
		return new ModelAndView("/jsp/userView.jsp", "user", user);
	}

}




/* Model - Controller - View
 * 1. DispatcherServlet(Front Controller)
 * 2. Controller
 * 3. Service > Dao > Service > Controller
 * 4. Dao
 * 5. ModelAndView
 * 6. View
 * Dao(Model) - Service - Controller(Controller) - ModelAndView - View(View)
 */
