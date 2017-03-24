package com.arctro.ssn.protobuf.converters.impl;

import java.util.ArrayList;
import java.util.List;

import com.arctro.ssn.protobuf.converters.Converter;
import com.arctro.ssn.protobuf.models.impl.Tag;

public class TagStringConverter implements Converter<List<Tag>, List<String>> {

	@Override
	public List<String> convert(List<Tag> c) {
		List<String> l = new ArrayList<String>();
		for(int i = 0; i < c.size(); i++){
			l.add(c.get(i).getBase().getTag());
		}
		
		return l;
	}

}
