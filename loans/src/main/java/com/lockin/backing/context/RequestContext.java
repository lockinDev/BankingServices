package com.lockin.backing.context;

import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;

@Component
@Getter
@Setter
public class RequestContext {

	public static final String CORRELATION_ID = "bank-correlation-id";

	private String correlationId = new String();

}
