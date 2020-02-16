package io.nogada.sam.cranberry.cms.content;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Controller Class for restful api
 */
@RestController
public class ContentController {

    @GetMapping({"/content/{id}","/content"})
    @ResponseBody
    public Content getContent(@PathVariable(name = "id", required = false) String id){
        return new Content();
    }
    @GetMapping({"/contents/{page}","/contents"})
    @ResponseBody
    public Content getContents(@PathVariable(name = "page", required = false) String page){
        return new Content();
    }
    
}