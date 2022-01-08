package com.mitocode.repository;

import org.slf4j.*;
import org.springframework.stereotype.Repository;
import com.mitocode.demo.DemoApplication;


@Repository
public class PersonaRepoImpl implements IPersonaRepo{

    private static Logger LOG = LoggerFactory.getLogger(DemoApplication.class);

    @Override
    public void registrar(String nombre){
        LOG.info("Se registro a " + nombre);
    }
}
