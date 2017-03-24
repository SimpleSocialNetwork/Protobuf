package com.arctro.ssn.protobuf.converters.impl;

import java.util.ArrayList;
import java.util.List;

import com.arctro.ssn.protobuf.Protobuf;
import com.arctro.ssn.protobuf.converters.ProtobufConverter;
import com.arctro.ssn.protobuf.models.impl.Tag;
import com.arctro.ssn.protobuf.models.impl.TagCollection;

public class TagProtobufConverter implements ProtobufConverter<Tag, TagCollection>{

	@Override
	public TagCollection toCollection(List<Tag> l) {
		Protobuf.TagCollection.Builder rawBuilder = Protobuf.TagCollection.newBuilder();
		
		for(int i = 0; i < l.size(); i++){
			rawBuilder.addList(l.get(i).getBase());
		}
		
		return new TagCollection(rawBuilder.build());
	}

	@Override
	public List<Tag> toList(TagCollection c) {
		List<Tag> p = new ArrayList<Tag>();
		Protobuf.TagCollection raw = c.getBase();
		
		for(int i = 0; i < raw.getListCount(); i++){
			p.add(new Tag(raw.getList(i)));
		}
		
		return p;
	}

}
