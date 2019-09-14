package es.jr.msgbroker.demo.cloudstream.model;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class PaymentCard {

	private int paymentId;
	private String description;
	private double amount;
}
