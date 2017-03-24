package com.arctro.ssn.protobuf.models;

import com.google.protobuf.GeneratedMessage;

public interface ServableProtobufWrapper<T extends GeneratedMessage> extends ProtobufWrapper<T> {
	public Integer getServerId();
}
