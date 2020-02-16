package io.nogada.sam.cranberry.cms.content;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Controller Class for restful api
 */
@RestController
public class ContentController {

    @GetMapping("/")
    @ResponseBody
    public Content getContent(){
        // throw new Exception("message");
        return new Content();
    }
    
}