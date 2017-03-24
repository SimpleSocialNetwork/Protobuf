package com.arctro.ssn.protobuf.models;

import com.google.protobuf.GeneratedMessageV3;

public interface ServableProtobufWrapper<T extends GeneratedMessageV3> extends ProtobufWrapper<T> {
	public Integer getServerId();
}
