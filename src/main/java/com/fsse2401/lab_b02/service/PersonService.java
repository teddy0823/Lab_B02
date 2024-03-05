package com.fsse2401.lab_b02.service;

import com.fsse2401.lab_b02.data.domainObject.CreatePersonRequestData;
import com.fsse2401.lab_b02.data.domainObject.CreatePersonResponseData;

public interface PersonService {
   CreatePersonResponseData createPerson(CreatePersonRequestData createPersonRequestData);
}
