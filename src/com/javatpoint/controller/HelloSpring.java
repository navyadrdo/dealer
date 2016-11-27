    package com.javatpoint.controller;  
    import org.springframework.stereotype.Controller;  
    import org.springframework.web.bind.annotation.RequestMapping;  
    import org.springframework.web.servlet.ModelAndView;  
    @Controller  
    public class HelloSpring {  
        @RequestMapping("/HelloSpring")  
        public ModelAndView helloSpring() {  
            String message = "Hello World, Spring MVC @ Javatpoint";  
            return new ModelAndView("HelloSpring", "message", message);  
        }  
    }  