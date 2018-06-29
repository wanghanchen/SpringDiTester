package spring.MVC;

import java.util.logging.Logger;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class StudentController {

	static Logger log = Logger.getLogger(StudentController.class.getName());
	
	@RequestMapping(value="/student", method=RequestMethod.GET)
	public String student(){
		log.info("Going to enter student");
		//return new ModelAndView("student", "command", new Student());//法1
		return "student";
	}
	
	@RequestMapping(value="/addStudent", method=RequestMethod.POST)
	public String addStudent(@ModelAttribute("SpringWeb")Student student,
			ModelMap model){
		if(student.getName().length()<5){
			throw new SpringException("Given name is too short");
		}else{
			model.addAttribute("name", student.getName());
		}
		
		if(student.getAge()<10){
			throw new SpringException("Given age is too low");
		}else{
			model.addAttribute("age", student.getAge());
		}
		
		
		model.addAttribute("id", student.getId());
		return "result";
	}
}
