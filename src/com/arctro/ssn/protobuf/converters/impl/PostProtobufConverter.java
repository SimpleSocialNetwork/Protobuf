package com.arctro.ssn.protobuf.converters.impl;

import java.util.ArrayList;
import java.util.List;

import com.arctro.ssn.protobuf.Protobuf;
import com.arctro.ssn.protobuf.converters.ProtobufConverter;
import com.arctro.ssn.protobuf.models.impl.Post;
import com.arctro.ssn.protobuf.models.impl.PostCollection;

public class PostProtobufConverter implements ProtobufConverter<Post, PostCollection>{

	@Override
	public PostCollection toCollection(List<Post> l) {
		Protobuf.PostCollection.Builder rawBuilder = Protobuf.PostCollection.newBuilder();
		
		for(int i = 0; i < l.size(); i++){
			rawBuilder.addList(l.get(i).getBase());
		}
		
		return new PostCollection(rawBuilder.build());
	}

	@Override
	public List<Post> toList(PostCollection c) {
		List<Post> p = new ArrayList<Post>();
		Protobuf.PostCollection raw = c.getBase();
		
		for(int i = 0; i < raw.getListCount(); i++){
			p.add(new Post(raw.getList(i)));
		}
		
		return p;
	}

}
