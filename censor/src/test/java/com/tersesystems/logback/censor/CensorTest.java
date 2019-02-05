package com.tersesystems.logback.censor;

import com.typesafe.config.Config;
import com.typesafe.config.ConfigFactory;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CensorTest {

    @Test
    public void testCensor() throws Exception {
        Config config = ConfigFactory.load();
        String regexPath = CensorConstants.CENSOR_TEXT_REGEX;
        String replacementTextPath = CensorConstants.CENSOR_TEXT_REPLACEMENT;
        RegexCensor censor = new RegexCensor(config, regexPath, replacementTextPath);
        assertThat(censor.apply("hunter2")).isEqualTo("*******");
    }

    @Test
    public void testCensorWithNoMatch() throws Exception {
        Config config = ConfigFactory.load();
        String regexPath = CensorConstants.CENSOR_TEXT_REGEX;
        String replacementTextPath = CensorConstants.CENSOR_TEXT_REPLACEMENT;
        RegexCensor censor = new RegexCensor(config, regexPath, replacementTextPath);
        assertThat(censor.apply("password1")).isEqualTo("password1");
    }
}
