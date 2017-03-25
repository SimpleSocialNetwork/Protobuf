package com.arctro.ssn.protobuf.models;

import com.google.protobuf.GeneratedMessageV3;

/**
 * An interface for the most basic protobuf message
 * @author Ben McLean
 *
 * @param <T> The protobuf object to wrap
 */
public interface ProtobufWrapper<T extends GeneratedMessageV3> {
	/**
	 * Returns the wrapped protobuf object
	 * @return The wrapped protobuf object
	 */
	public T getBase();
}
