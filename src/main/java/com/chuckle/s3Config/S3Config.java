package com.chuckle.s3Config;


import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.AWSCredentialsProvider;
import com.amazonaws.auth.AWSStaticCredentialsProvider;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.services.finspacedata.model.AwsCredentials;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3ClientBuilder;
import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class S3Config {


    @Value("${cloud.aws.credentials.access-key}")
    private String awsAccessKey;

    @Value("${cloud.aws.credentials.secret-key}")
    private String awsSecretKey;

    @Value("${cloud.aws.credentials.region.static}")
    private String region;


    @Bean
    public AmazonS3 client() {

        AWSCredentials awsCredentials = new BasicAWSCredentials(awsAccessKey, awsSecretKey);

        AmazonS3 awsS3 = AmazonS3ClientBuilder.standard().withCredentials(new AWSCredentialsProvider() {
            @Override
            public AWSCredentials getCredentials() {
                return awsCredentials;
            }

            @Override
            public void refresh() {

            }
        }).withRegion(region).build();
         return  awsS3;

    }

}

