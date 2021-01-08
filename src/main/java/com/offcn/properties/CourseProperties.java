package com.offcn.properties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
@ConfigurationProperties(prefix = "course")
@Configuration
@PropertySource(value = "myapplication.properties")
public class CourseProperties {

    String type = "公考";
    String time = "10d";
    String price = "5.6w";

}
