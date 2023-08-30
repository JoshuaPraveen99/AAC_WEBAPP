package com.aac.webapp.serviceTest;

import com.aac.webapp.dto.ConsumerReportInt;
import com.aac.webapp.repository.ConsumerRepository;
import com.aac.webapp.service.Webservice;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import java.util.ArrayList;
import java.util.List;


import static org.assertj.core.api.ClassBasedNavigableListAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

public class ServiceImplTest {

    @Mock
    Webservice webservice;

    @Mock
    ConsumerRepository consumerRepository;

    @Mock
    ConsumerReportInt consumerReportInt1;

    @Mock
    ConsumerReportInt consumerReportInt2;

    @BeforeEach
    public void setup() {
        MockitoAnnotations.initMocks(this);
    }


    @Test
    public void getConsumerDetailsTest(){



        when(consumerReportInt1.getName()).thenReturn("Joshua");
        when(consumerReportInt1.getProfession()).thenReturn("AASE");
        when(consumerReportInt1.getProject()).thenReturn("CDTS-ADS");
        when(consumerReportInt1.getSalary()).thenReturn(41000);

        when(consumerReportInt2.getName()).thenReturn("Poshua");
        when(consumerReportInt2.getProfession()).thenReturn("ASE");
        when(consumerReportInt2.getProject()).thenReturn("CDTS-ADS");
        when(consumerReportInt2.getSalary()).thenReturn(28000);

        List<ConsumerReportInt> expectedconsumerReportIntList = new ArrayList<>();
        expectedconsumerReportIntList.add(consumerReportInt1);
        expectedconsumerReportIntList.add(consumerReportInt2);



        when(consumerRepository.getConsumerdetails()).thenReturn(expectedconsumerReportIntList);

        List<ConsumerReportInt> actualConsumerReportIntList= webservice.getConsumerDetails();

        assertEquals(expectedconsumerReportIntList,actualConsumerReportIntList);




    }
}
