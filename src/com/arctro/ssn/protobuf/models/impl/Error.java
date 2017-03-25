package com.arctro.ssn.protobuf.models.impl;

import com.arctro.ssn.protobuf.Protobuf;
import com.arctro.ssn.protobuf.models.IProtobufWrapper;

/**
 * Wraps an Error protobuf message
 * @author Ben McLean
 *
 */
public class Error extends IProtobufWrapper<Protobuf.Error>{

	public Error(com.arctro.ssn.protobuf.Protobuf.Error base) {
		super(base);
	}

}
