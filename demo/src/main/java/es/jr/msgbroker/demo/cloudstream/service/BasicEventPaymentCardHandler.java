package es.jr.msgbroker.demo.cloudstream.service;

import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Component;

import es.jr.msgbroker.demo.cloudstream.model.PaymentCard;
import es.jr.msgbroker.demo.cloudstream.processor.BasicPaymentProcessor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
public class BasicEventPaymentCardHandler {

	private static final Double INTEREST = 1.15;

	@StreamListener(BasicPaymentProcessor.INPUT)
	@SendTo(BasicPaymentProcessor.OUTPUT)
	public PaymentCard paymentCardEventHandle(PaymentCard paymentCard) {
		log.debug("Applied interest 0.15%");
		paymentCard.setAmount(paymentCard.getAmount() * INTEREST);
		return paymentCard;		
	}

}

