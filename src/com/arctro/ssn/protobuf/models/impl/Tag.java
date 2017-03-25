package com.arctro.ssn.protobuf.models.impl;

import com.arctro.ssn.protobuf.Protobuf;
import com.arctro.ssn.protobuf.models.IServableProtobufWrapper;


/**
 * Wraps an Tag protobuf message
 * @author Ben McLean
 *
 */
public class Tag extends IServableProtobufWrapper<Protobuf.Tag>{

	public Tag(com.arctro.ssn.protobuf.Protobuf.Tag base) {
		super(base, base.getId());
	}

}
