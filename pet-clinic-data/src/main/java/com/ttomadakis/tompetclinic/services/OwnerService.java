package com.ttomadakis.tompetclinic.services;

import com.ttomadakis.tompetclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long>{

    Owner findByLastName(String lastName);
}
