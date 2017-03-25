package com.arctro.ssn.protobuf.models;

import com.google.protobuf.GeneratedMessageV3;

/**
 * Wraps a protobuf collection message (i.e a list of protobuf messages)
 * @author Ben McLean
 *
 * @param <T> The protobuf collection message to wrap
 */
public interface ProtobufCollectionWrapper<T extends GeneratedMessageV3> extends ProtobufWrapper<T>{

}
