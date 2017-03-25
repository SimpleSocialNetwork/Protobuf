package com.arctro.ssn.protobuf.models.impl;

import com.arctro.ssn.protobuf.Protobuf;
import com.arctro.ssn.protobuf.models.IProtobufWrapper;

/**
 * Wraps an PasswordStrength protobuf message
 * @author Ben McLean
 *
 */
public class PasswordStrength extends IProtobufWrapper<Protobuf.PasswordStrength>{

	public PasswordStrength(com.arctro.ssn.protobuf.Protobuf.PasswordStrength base) {
		super(base);
	}

}
