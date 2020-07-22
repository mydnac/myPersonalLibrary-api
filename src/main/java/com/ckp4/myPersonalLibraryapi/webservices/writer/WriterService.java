package com.ckp4.myPersonalLibraryapi.webservices.writer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class WriterService {

    @Autowired WriterRepository repository;

    public Writer getWriterById(Long id){
        return repository.findById(id).get();
    }

    public Writer createWriter(Writer writer){
        return repository.save(writer);
    }

    public Writer updateWriter(Long id, Writer writer){
        Writer writerToUpdate = repository.findById(id).get();
        writerToUpdate.setLastname(writer.getLastname());
        writerToUpdate.setFirstname(writer.getFirstname());
        return repository.save(writerToUpdate);
    }

    public void deleteWriter(Long id){
        repository.deleteById(id);
    }
}
