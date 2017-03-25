package com.arctro.ssn.protobuf.models.impl;

import com.arctro.ssn.protobuf.Protobuf;
import com.arctro.ssn.protobuf.models.IProtobufWrapper;


/**
 * Wraps an Session protobuf message
 * @author Ben McLean
 *
 */
public class Session extends IProtobufWrapper<Protobuf.Session> {

	public Session(com.arctro.ssn.protobuf.Protobuf.Session base) {
		super(base);
	}

}
