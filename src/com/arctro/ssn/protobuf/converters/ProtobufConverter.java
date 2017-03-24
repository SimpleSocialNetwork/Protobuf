package com.arctro.ssn.protobuf.converters;

import java.util.List;

import com.arctro.ssn.protobuf.models.ProtobufWrapper;

public interface ProtobufConverter<S extends ProtobufWrapper<?>, C extends ProtobufWrapper<?>> {
	
	public C toCollection(List<S> l);
	
	public List<S> toList(C c);
	
}
