package org.example.config;

import org.springframework.context.annotation.*;

@Configuration
@ComponentScan(basePackages = {"org.example.bean","org.example.proxy","org.example.repository","org.example.service"})
public class ProjectConfig {

}
