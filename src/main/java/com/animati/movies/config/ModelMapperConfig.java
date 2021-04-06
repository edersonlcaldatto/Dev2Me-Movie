package com.animati.movies.config;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ModelMapperConfig {

    @Bean
    public ModelMapper modelMapper(){
        return new ModelMapper();

        // Quando nao usa o setter tem que fazer assim
        //        ModelMapper modelMapper = new ModelMapper();
        //        modelMapper.getConfiguration().setFieldMatchingEnabled(true);
        //        modelMapper.getConfiguration().setFieldAccessLevel(org.modelmapper.config.Configuration.AccessLevel.PRIVATE);
        //        return modelMapper;
    }

}
