package com.problems.codechef;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Service;



@Service
public class CodeChefProblemsToSolve implements ApplicationRunner {

    public static final Logger logger= LoggerFactory.getLogger(CodeChefProblemsToSolve.class);

    public void run(ApplicationArguments arguments){
        logger.info("Starting the Application");
    }
}
