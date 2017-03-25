package com.arctro.ssn.protobuf.converters;

import java.util.List;

import com.arctro.ssn.protobuf.models.ProtobufCollectionWrapper;
import com.arctro.ssn.protobuf.models.ProtobufWrapper;

/**
 * Converts a protobuf message from its singular form to its collected form
 * @author Ben McLean
 *
 * @param <S> The protobuf's singular form
 * @param <C> The protobuf's collected form
 */
public interface ProtobufConverter<S extends ProtobufWrapper<?>, C extends ProtobufCollectionWrapper<?>> {
	
	/**
	 * Converts a list of the singular forms to a collected form
	 * @param l The list of singulars
	 * @return The collected form
	 */
	public C toCollection(List<S> l);
	
	/**
	 * Converts the collected form to a list of singulars
	 * @param c The collected protobuf message
	 * @return A list of singulars
	 */
	public List<S> toList(C c);
	
}
