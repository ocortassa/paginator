package org.github.ocortassa.paginator.test;

import org.github.ocortassa.paginator.SequenceGenerator;
import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SequenceGeneratorTest {

    private final static Logger LOGGER = LoggerFactory.getLogger(SequenceGeneratorTest.class);

    private SequenceGenerator seqGenerator;

    @Before
    public void setUp() {
        seqGenerator = new SequenceGenerator();
    }

    @Test
    public void doSequentialTest() {
        String result = seqGenerator.generateSequentialProgression(0);
        LOGGER.info(result);
        result = seqGenerator.generateSequentialProgression(2);
        LOGGER.info(result);
        result = seqGenerator.generateSequentialProgression(4);
        LOGGER.info(result);
        result = seqGenerator.generateSequentialProgression(8);
        LOGGER.info(result);
        result = seqGenerator.generateSequentialProgression(12);
        LOGGER.info(result);
        result = seqGenerator.generateSequentialProgression(100);
        LOGGER.info(result);
        result = seqGenerator.generateSequentialProgression(97);
        LOGGER.info(result);
    }

    @Test
    public void doFoldedTest() {
        String result;

        result = seqGenerator.generateFoldedProgression(0);
        LOGGER.info(result);
        result = seqGenerator.generateFoldedProgression(2);
        LOGGER.info(result);
        result = seqGenerator.generateFoldedProgression(4);
        LOGGER.info(result);
        result = seqGenerator.generateFoldedProgression(8);
        LOGGER.info(result);
        result = seqGenerator.generateFoldedProgression(12);
        LOGGER.info(result);
        result = seqGenerator.generateFoldedProgression(20);
        LOGGER.info(result);
        result = seqGenerator.generateFoldedProgression(100);
        LOGGER.info(result);
        result = seqGenerator.generateFoldedProgression(97);
        LOGGER.info(result);
    }

}
