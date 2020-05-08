package org.springframework.samples.petclinic.sfg.junit4;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.samples.petclinic.sfg.BaseConfig;
import org.springframework.samples.petclinic.sfg.HearingInterpreter;
import org.springframework.samples.petclinic.sfg.LaurelConfig;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes = { BaseConfig.class, LaurelConfig.class })
public class HearingInterpreterTest {

    @Autowired
    HearingInterpreter hearingInterpreter;

    @Test
    public void whatIHeard(){
        String word = hearingInterpreter.whatIheard();
        assertEquals("Laurel", word);
    }

}
