package com.all.knowledge.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/upload")
public class UploadController {
        @RequestMapping(value = {"/file", "file"}, method = {RequestMethod.GET, RequestMethod.POST})
        public String showUploadFile(Model model){
            model.addAttribute("title", "Upload file");
            return "pages/upload/uploadFile";
        }
}
