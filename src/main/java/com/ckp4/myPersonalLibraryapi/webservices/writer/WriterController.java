package com.ckp4.myPersonalLibraryapi.webservices.writer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/writers")
@CrossOrigin
public class WriterController {

    @Autowired
    WriterService service;

    @GetMapping("/{id}")
    public Writer getWriterById(@PathVariable Long id){
        return service.getWriterById(id);
    }

    @PostMapping()
    public Writer createWriter(@RequestBody Writer writer){
        return service.createWriter(writer);
    }

    @PutMapping("/{id}")
    public Writer updateWriter(@PathVariable Long id, @RequestBody Writer writer){
        return service.updateWriter(id, writer);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id){
        service.deleteWriter(id);
    }

}
