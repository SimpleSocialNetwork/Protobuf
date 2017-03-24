package com.arctro.ssn.protobuf.models.impl;

import com.arctro.ssn.protobuf.Protobuf;
import com.arctro.ssn.protobuf.models.IServableProtobufWrapper;

public class ShortUser extends IServableProtobufWrapper<Protobuf.ShortUser>{

	public ShortUser(Protobuf.ShortUser base) {
		super(base, base.getId());
	}

}
