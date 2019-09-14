package es.jr.msgbroker.demo.cloudstream.config;

import org.springframework.cloud.stream.annotation.EnableBinding;

import es.jr.msgbroker.demo.cloudstream.processor.BasicPaymentProcessor;

@EnableBinding({ BasicPaymentProcessor.class })
public class AppConfig {

}
