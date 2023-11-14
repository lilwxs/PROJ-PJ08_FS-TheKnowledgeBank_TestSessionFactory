package com.all.knowledge.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/document")
public class DocumentController {
    @GetMapping(value = {"/document", "tai-lieu"})
    public String showDocumentPage(Model model){
        model.addAttribute("title", "Tài liệu");
        return "pages/documentation/document";
    }

    @GetMapping(value = {"/document-detail", "tai-lieu-chi-tiet"})
    public String showDocumentDetailPage(Model model){
        model.addAttribute("title", "Tài liệu chi tiết");
        return "pages/documentation/documentDetail";
    }
}
