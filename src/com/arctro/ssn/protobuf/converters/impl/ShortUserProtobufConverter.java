package com.arctro.ssn.protobuf.converters.impl;

import java.util.ArrayList;
import java.util.List;

import com.arctro.ssn.protobuf.Protobuf;
import com.arctro.ssn.protobuf.converters.ProtobufConverter;
import com.arctro.ssn.protobuf.models.impl.ShortUser;
import com.arctro.ssn.protobuf.models.impl.ShortUserCollection;

public class ShortUserProtobufConverter implements ProtobufConverter<ShortUser, ShortUserCollection>{

	@Override
	public ShortUserCollection toCollection(List<ShortUser> l) {
		Protobuf.ShortUserCollection.Builder rawBuilder = Protobuf.ShortUserCollection.newBuilder();
		
		for(int i = 0; i < l.size(); i++){
			rawBuilder.addList(l.get(i).getBase());
		}
		
		return new ShortUserCollection(rawBuilder.build());
	}

	@Override
	public List<ShortUser> toList(ShortUserCollection c) {
		List<ShortUser> p = new ArrayList<ShortUser>();
		Protobuf.ShortUserCollection raw = c.getBase();
		
		for(int i = 0; i < raw.getListCount(); i++){
			p.add(new ShortUser(raw.getList(i)));
		}
		
		return p;
	}

}
