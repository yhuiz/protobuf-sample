// Generated by the protocol buffer compiler.  DO NOT EDIT!

package com.example.test.nano;

@SuppressWarnings("hiding")
public interface TestProtos {

  public static final class Test1 extends
      com.google.protobuf.nano.MessageNano {

    private static volatile Test1[] _emptyArray;
    public static Test1[] emptyArray() {
      // Lazily initializes the empty array
      if (_emptyArray == null) {
        synchronized (
            com.google.protobuf.nano.InternalNano.LAZY_INIT_LOCK) {
          if (_emptyArray == null) {
            _emptyArray = new Test1[0];
          }
        }
      }
      return _emptyArray;
    }

    // optional int32 a = 1;
    public int a;

    public Test1() {
      clear();
    }

    public Test1 clear() {
      a = 0;
      cachedSize = -1;
      return this;
    }

    @Override
    public void writeTo(com.google.protobuf.nano.CodedOutputByteBufferNano output)
        throws java.io.IOException {
      if (this.a != 0) {
        output.writeInt32(1, this.a);
      }
      super.writeTo(output);
    }

    @Override
    protected int computeSerializedSize() {
      int size = super.computeSerializedSize();
      if (this.a != 0) {
        size += com.google.protobuf.nano.CodedOutputByteBufferNano
            .computeInt32Size(1, this.a);
      }
      return size;
    }

    @Override
    public Test1 mergeFrom(
            com.google.protobuf.nano.CodedInputByteBufferNano input)
        throws java.io.IOException {
      while (true) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            return this;
          default: {
            if (!com.google.protobuf.nano.WireFormatNano.parseUnknownField(input, tag)) {
              return this;
            }
            break;
          }
          case 8: {
            this.a = input.readInt32();
            break;
          }
        }
      }
    }

    public static Test1 parseFrom(byte[] data)
        throws com.google.protobuf.nano.InvalidProtocolBufferNanoException {
      return com.google.protobuf.nano.MessageNano.mergeFrom(new Test1(), data);
    }

    public static Test1 parseFrom(
            com.google.protobuf.nano.CodedInputByteBufferNano input)
        throws java.io.IOException {
      return new Test1().mergeFrom(input);
    }
  }

  public static final class Test2 extends
      com.google.protobuf.nano.MessageNano {

    private static volatile Test2[] _emptyArray;
    public static Test2[] emptyArray() {
      // Lazily initializes the empty array
      if (_emptyArray == null) {
        synchronized (
            com.google.protobuf.nano.InternalNano.LAZY_INIT_LOCK) {
          if (_emptyArray == null) {
            _emptyArray = new Test2[0];
          }
        }
      }
      return _emptyArray;
    }

    // optional string s = 1;
    public java.lang.String s;

    public Test2() {
      clear();
    }

    public Test2 clear() {
      s = "";
      cachedSize = -1;
      return this;
    }

    @Override
    public void writeTo(com.google.protobuf.nano.CodedOutputByteBufferNano output)
        throws java.io.IOException {
      if (!this.s.equals("")) {
        output.writeString(1, this.s);
      }
      super.writeTo(output);
    }

    @Override
    protected int computeSerializedSize() {
      int size = super.computeSerializedSize();
      if (!this.s.equals("")) {
        size += com.google.protobuf.nano.CodedOutputByteBufferNano
            .computeStringSize(1, this.s);
      }
      return size;
    }

    @Override
    public Test2 mergeFrom(
            com.google.protobuf.nano.CodedInputByteBufferNano input)
        throws java.io.IOException {
      while (true) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            return this;
          default: {
            if (!com.google.protobuf.nano.WireFormatNano.parseUnknownField(input, tag)) {
              return this;
            }
            break;
          }
          case 10: {
            this.s = input.readString();
            break;
          }
        }
      }
    }

    public static Test2 parseFrom(byte[] data)
        throws com.google.protobuf.nano.InvalidProtocolBufferNanoException {
      return com.google.protobuf.nano.MessageNano.mergeFrom(new Test2(), data);
    }

    public static Test2 parseFrom(
            com.google.protobuf.nano.CodedInputByteBufferNano input)
        throws java.io.IOException {
      return new Test2().mergeFrom(input);
    }
  }

  public static final class User extends
      com.google.protobuf.nano.MessageNano {

    private static volatile User[] _emptyArray;
    public static User[] emptyArray() {
      // Lazily initializes the empty array
      if (_emptyArray == null) {
        synchronized (
            com.google.protobuf.nano.InternalNano.LAZY_INIT_LOCK) {
          if (_emptyArray == null) {
            _emptyArray = new User[0];
          }
        }
      }
      return _emptyArray;
    }

    // optional int32 id = 1;
    public int id;

    // optional string name = 2;
    public java.lang.String name;

    // repeated string icon_url = 3;
    public java.lang.String[] iconUrl;

    public User() {
      clear();
    }

    public User clear() {
      id = 0;
      name = "";
      iconUrl = com.google.protobuf.nano.WireFormatNano.EMPTY_STRING_ARRAY;
      cachedSize = -1;
      return this;
    }

    @Override
    public void writeTo(com.google.protobuf.nano.CodedOutputByteBufferNano output)
        throws java.io.IOException {
      if (this.id != 0) {
        output.writeInt32(1, this.id);
      }
      if (!this.name.equals("")) {
        output.writeString(2, this.name);
      }
      if (this.iconUrl != null && this.iconUrl.length > 0) {
        for (int i = 0; i < this.iconUrl.length; i++) {
          java.lang.String element = this.iconUrl[i];
          if (element != null) {
            output.writeString(3, element);
          }
        }
      }
      super.writeTo(output);
    }

    @Override
    protected int computeSerializedSize() {
      int size = super.computeSerializedSize();
      if (this.id != 0) {
        size += com.google.protobuf.nano.CodedOutputByteBufferNano
            .computeInt32Size(1, this.id);
      }
      if (!this.name.equals("")) {
        size += com.google.protobuf.nano.CodedOutputByteBufferNano
            .computeStringSize(2, this.name);
      }
      if (this.iconUrl != null && this.iconUrl.length > 0) {
        int dataCount = 0;
        int dataSize = 0;
        for (int i = 0; i < this.iconUrl.length; i++) {
          java.lang.String element = this.iconUrl[i];
          if (element != null) {
            dataCount++;
            dataSize += com.google.protobuf.nano.CodedOutputByteBufferNano
                .computeStringSizeNoTag(element);
          }
        }
        size += dataSize;
        size += 1 * dataCount;
      }
      return size;
    }

    @Override
    public User mergeFrom(
            com.google.protobuf.nano.CodedInputByteBufferNano input)
        throws java.io.IOException {
      while (true) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            return this;
          default: {
            if (!com.google.protobuf.nano.WireFormatNano.parseUnknownField(input, tag)) {
              return this;
            }
            break;
          }
          case 8: {
            this.id = input.readInt32();
            break;
          }
          case 18: {
            this.name = input.readString();
            break;
          }
          case 26: {
            int arrayLength = com.google.protobuf.nano.WireFormatNano
                .getRepeatedFieldArrayLength(input, 26);
            int i = this.iconUrl == null ? 0 : this.iconUrl.length;
            java.lang.String[] newArray = new java.lang.String[i + arrayLength];
            if (i != 0) {
              java.lang.System.arraycopy(this.iconUrl, 0, newArray, 0, i);
            }
            for (; i < newArray.length - 1; i++) {
              newArray[i] = input.readString();
              input.readTag();
            }
            // Last one without readTag.
            newArray[i] = input.readString();
            this.iconUrl = newArray;
            break;
          }
        }
      }
    }

    public static User parseFrom(byte[] data)
        throws com.google.protobuf.nano.InvalidProtocolBufferNanoException {
      return com.google.protobuf.nano.MessageNano.mergeFrom(new User(), data);
    }

    public static User parseFrom(
            com.google.protobuf.nano.CodedInputByteBufferNano input)
        throws java.io.IOException {
      return new User().mergeFrom(input);
    }
  }

  public static final class Signed extends
      com.google.protobuf.nano.MessageNano {

    private static volatile Signed[] _emptyArray;
    public static Signed[] emptyArray() {
      // Lazily initializes the empty array
      if (_emptyArray == null) {
        synchronized (
            com.google.protobuf.nano.InternalNano.LAZY_INIT_LOCK) {
          if (_emptyArray == null) {
            _emptyArray = new Signed[0];
          }
        }
      }
      return _emptyArray;
    }

    // optional int32 a = 1;
    public int a;

    // optional sint32 b = 2;
    public int b;

    public Signed() {
      clear();
    }

    public Signed clear() {
      a = 0;
      b = 0;
      cachedSize = -1;
      return this;
    }

    @Override
    public void writeTo(com.google.protobuf.nano.CodedOutputByteBufferNano output)
        throws java.io.IOException {
      if (this.a != 0) {
        output.writeInt32(1, this.a);
      }
      if (this.b != 0) {
        output.writeSInt32(2, this.b);
      }
      super.writeTo(output);
    }

    @Override
    protected int computeSerializedSize() {
      int size = super.computeSerializedSize();
      if (this.a != 0) {
        size += com.google.protobuf.nano.CodedOutputByteBufferNano
            .computeInt32Size(1, this.a);
      }
      if (this.b != 0) {
        size += com.google.protobuf.nano.CodedOutputByteBufferNano
            .computeSInt32Size(2, this.b);
      }
      return size;
    }

    @Override
    public Signed mergeFrom(
            com.google.protobuf.nano.CodedInputByteBufferNano input)
        throws java.io.IOException {
      while (true) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            return this;
          default: {
            if (!com.google.protobuf.nano.WireFormatNano.parseUnknownField(input, tag)) {
              return this;
            }
            break;
          }
          case 8: {
            this.a = input.readInt32();
            break;
          }
          case 16: {
            this.b = input.readSInt32();
            break;
          }
        }
      }
    }

    public static Signed parseFrom(byte[] data)
        throws com.google.protobuf.nano.InvalidProtocolBufferNanoException {
      return com.google.protobuf.nano.MessageNano.mergeFrom(new Signed(), data);
    }

    public static Signed parseFrom(
            com.google.protobuf.nano.CodedInputByteBufferNano input)
        throws java.io.IOException {
      return new Signed().mergeFrom(input);
    }
  }
}
