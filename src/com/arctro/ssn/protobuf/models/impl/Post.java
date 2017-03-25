package com.arctro.ssn.protobuf.models.impl;

import com.arctro.ssn.protobuf.Protobuf;
import com.arctro.ssn.protobuf.models.IServableProtobufWrapper;

/**
 * Wraps an Post protobuf message
 * @author Ben McLean
 *
 */
public class Post extends IServableProtobufWrapper<Protobuf.Post>{

	public Post(com.arctro.ssn.protobuf.Protobuf.Post base) {
		super(base, base.getId());
	}

}
