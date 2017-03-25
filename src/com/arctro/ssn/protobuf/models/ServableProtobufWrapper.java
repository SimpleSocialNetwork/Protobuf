package com.arctro.ssn.protobuf.models;

import com.google.protobuf.GeneratedMessageV3;

/**
 * Wraps servable (i.e stored in database) protobuf messages
 * @author Ben McLean
 *
 * @param <T> The servable protobuf message to wrap
 */
public interface ServableProtobufWrapper<T extends GeneratedMessageV3> extends ProtobufWrapper<T> {
	/**
	 * Returns the server ID of the protobuf message
	 * @return The server ID of the protobuf message
	 */
	public Integer getServerId();
}
