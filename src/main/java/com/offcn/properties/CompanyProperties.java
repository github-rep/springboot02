package com.offcn.properties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ConfigurationProperties(
        prefix = "com.offcn"
)
@ToString
public class CompanyProperties {

    int year = 0;
    String address = "草莓园";
    String code = "12345";
}
