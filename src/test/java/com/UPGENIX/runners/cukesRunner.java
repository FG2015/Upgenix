package com.UPGENIX.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(


        plugin = {"html:target/cucumber-report.html",
                "json:target/cucumber.json"
        },
        features = "src/test/resources/features",
        glue = "com/UPGENIX/step_definitions",
        dryRun = false,
        tags = "@UPGNX10-299 or @Farid"

        //tags = "@UPGNX10-276 or @UPGNX10-290 or @UPGNX10-292 or @UPGNX10-294 or @UPGNX10-297"

)
public class cukesRunner {

    }

