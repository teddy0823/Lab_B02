package com.fsse2401.lab_b02.api;

import com.fsse2401.lab_b02.data.domainObject.CreatePersonResponseData;
import com.fsse2401.lab_b02.data.dto.request.CreatePersonRequestDto;
import com.fsse2401.lab_b02.data.dto.response.CreatePersonResponseDto;
import com.fsse2401.lab_b02.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonApi {

    private  final PersonService personService;

    @Autowired
    public PersonApi(PersonService personService){
        this.personService = personService;
    }

//    @Autowired
//    PersonService personService;

    @PostMapping("/person")
    public void createPerson(@RequestBody CreatePersonRequestDto createPersonRequestDto){
        CreatePersonResponseData createPersonResponseData = new CreatePersonResponseData(
                createPersonRequestDto.getFirstName(),
                createPersonRequestDto.getLastName(),
                createPersonRequestDto.getHkid()
        );

        CreatePersonResponseData createPersonResponseData = personService.createPerson(createPersonRequestData);

        CreatePersonResponseDto createPersonResponseDto = new CreatePersonResponseDto(
                createPersonResponseData.getFirstName(),
                createPersonResponseData.getLastName(),
                createPersonResponseData.getHkid()
        );

        return createPersonResponseDto;


    }
}
