// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Animal.proto

package com.example.datapersistance.protobuf;

/**
 * Protobuf type {@code FindByIdResponseAnimal}
 */
public final class FindByIdResponseAnimal extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:FindByIdResponseAnimal)
    FindByIdResponseAnimalOrBuilder {
private static final long serialVersionUID = 0L;
  // Use FindByIdResponseAnimal.newBuilder() to construct.
  private FindByIdResponseAnimal(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private FindByIdResponseAnimal() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new FindByIdResponseAnimal();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private FindByIdResponseAnimal(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10: {
            com.example.datapersistance.protobuf.AnimalMessage.Builder subBuilder = null;
            if (animal_ != null) {
              subBuilder = animal_.toBuilder();
            }
            animal_ = input.readMessage(com.example.datapersistance.protobuf.AnimalMessage.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(animal_);
              animal_ = subBuilder.buildPartial();
            }

            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (com.google.protobuf.UninitializedMessageException e) {
      throw e.asInvalidProtocolBufferException().setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.example.datapersistance.protobuf.AnimalOuterClass.internal_static_FindByIdResponseAnimal_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.example.datapersistance.protobuf.AnimalOuterClass.internal_static_FindByIdResponseAnimal_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.example.datapersistance.protobuf.FindByIdResponseAnimal.class, com.example.datapersistance.protobuf.FindByIdResponseAnimal.Builder.class);
  }

  public static final int ANIMAL_FIELD_NUMBER = 1;
  private com.example.datapersistance.protobuf.AnimalMessage animal_;
  /**
   * <code>.AnimalMessage animal = 1;</code>
   * @return Whether the animal field is set.
   */
  @java.lang.Override
  public boolean hasAnimal() {
    return animal_ != null;
  }
  /**
   * <code>.AnimalMessage animal = 1;</code>
   * @return The animal.
   */
  @java.lang.Override
  public com.example.datapersistance.protobuf.AnimalMessage getAnimal() {
    return animal_ == null ? com.example.datapersistance.protobuf.AnimalMessage.getDefaultInstance() : animal_;
  }
  /**
   * <code>.AnimalMessage animal = 1;</code>
   */
  @java.lang.Override
  public com.example.datapersistance.protobuf.AnimalMessageOrBuilder getAnimalOrBuilder() {
    return getAnimal();
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (animal_ != null) {
      output.writeMessage(1, getAnimal());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (animal_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getAnimal());
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.example.datapersistance.protobuf.FindByIdResponseAnimal)) {
      return super.equals(obj);
    }
    com.example.datapersistance.protobuf.FindByIdResponseAnimal other = (com.example.datapersistance.protobuf.FindByIdResponseAnimal) obj;

    if (hasAnimal() != other.hasAnimal()) return false;
    if (hasAnimal()) {
      if (!getAnimal()
          .equals(other.getAnimal())) return false;
    }
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (hasAnimal()) {
      hash = (37 * hash) + ANIMAL_FIELD_NUMBER;
      hash = (53 * hash) + getAnimal().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.example.datapersistance.protobuf.FindByIdResponseAnimal parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.example.datapersistance.protobuf.FindByIdResponseAnimal parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.example.datapersistance.protobuf.FindByIdResponseAnimal parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.example.datapersistance.protobuf.FindByIdResponseAnimal parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.example.datapersistance.protobuf.FindByIdResponseAnimal parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.example.datapersistance.protobuf.FindByIdResponseAnimal parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.example.datapersistance.protobuf.FindByIdResponseAnimal parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.example.datapersistance.protobuf.FindByIdResponseAnimal parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.example.datapersistance.protobuf.FindByIdResponseAnimal parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.example.datapersistance.protobuf.FindByIdResponseAnimal parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.example.datapersistance.protobuf.FindByIdResponseAnimal parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.example.datapersistance.protobuf.FindByIdResponseAnimal parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.example.datapersistance.protobuf.FindByIdResponseAnimal prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code FindByIdResponseAnimal}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:FindByIdResponseAnimal)
      com.example.datapersistance.protobuf.FindByIdResponseAnimalOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.example.datapersistance.protobuf.AnimalOuterClass.internal_static_FindByIdResponseAnimal_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.example.datapersistance.protobuf.AnimalOuterClass.internal_static_FindByIdResponseAnimal_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.example.datapersistance.protobuf.FindByIdResponseAnimal.class, com.example.datapersistance.protobuf.FindByIdResponseAnimal.Builder.class);
    }

    // Construct using com.example.datapersistance.protobuf.FindByIdResponseAnimal.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (animalBuilder_ == null) {
        animal_ = null;
      } else {
        animal_ = null;
        animalBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.example.datapersistance.protobuf.AnimalOuterClass.internal_static_FindByIdResponseAnimal_descriptor;
    }

    @java.lang.Override
    public com.example.datapersistance.protobuf.FindByIdResponseAnimal getDefaultInstanceForType() {
      return com.example.datapersistance.protobuf.FindByIdResponseAnimal.getDefaultInstance();
    }

    @java.lang.Override
    public com.example.datapersistance.protobuf.FindByIdResponseAnimal build() {
      com.example.datapersistance.protobuf.FindByIdResponseAnimal result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.example.datapersistance.protobuf.FindByIdResponseAnimal buildPartial() {
      com.example.datapersistance.protobuf.FindByIdResponseAnimal result = new com.example.datapersistance.protobuf.FindByIdResponseAnimal(this);
      if (animalBuilder_ == null) {
        result.animal_ = animal_;
      } else {
        result.animal_ = animalBuilder_.build();
      }
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.example.datapersistance.protobuf.FindByIdResponseAnimal) {
        return mergeFrom((com.example.datapersistance.protobuf.FindByIdResponseAnimal)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.example.datapersistance.protobuf.FindByIdResponseAnimal other) {
      if (other == com.example.datapersistance.protobuf.FindByIdResponseAnimal.getDefaultInstance()) return this;
      if (other.hasAnimal()) {
        mergeAnimal(other.getAnimal());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.example.datapersistance.protobuf.FindByIdResponseAnimal parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.example.datapersistance.protobuf.FindByIdResponseAnimal) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.example.datapersistance.protobuf.AnimalMessage animal_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.example.datapersistance.protobuf.AnimalMessage, com.example.datapersistance.protobuf.AnimalMessage.Builder, com.example.datapersistance.protobuf.AnimalMessageOrBuilder> animalBuilder_;
    /**
     * <code>.AnimalMessage animal = 1;</code>
     * @return Whether the animal field is set.
     */
    public boolean hasAnimal() {
      return animalBuilder_ != null || animal_ != null;
    }
    /**
     * <code>.AnimalMessage animal = 1;</code>
     * @return The animal.
     */
    public com.example.datapersistance.protobuf.AnimalMessage getAnimal() {
      if (animalBuilder_ == null) {
        return animal_ == null ? com.example.datapersistance.protobuf.AnimalMessage.getDefaultInstance() : animal_;
      } else {
        return animalBuilder_.getMessage();
      }
    }
    /**
     * <code>.AnimalMessage animal = 1;</code>
     */
    public Builder setAnimal(com.example.datapersistance.protobuf.AnimalMessage value) {
      if (animalBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        animal_ = value;
        onChanged();
      } else {
        animalBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.AnimalMessage animal = 1;</code>
     */
    public Builder setAnimal(
        com.example.datapersistance.protobuf.AnimalMessage.Builder builderForValue) {
      if (animalBuilder_ == null) {
        animal_ = builderForValue.build();
        onChanged();
      } else {
        animalBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.AnimalMessage animal = 1;</code>
     */
    public Builder mergeAnimal(com.example.datapersistance.protobuf.AnimalMessage value) {
      if (animalBuilder_ == null) {
        if (animal_ != null) {
          animal_ =
            com.example.datapersistance.protobuf.AnimalMessage.newBuilder(animal_).mergeFrom(value).buildPartial();
        } else {
          animal_ = value;
        }
        onChanged();
      } else {
        animalBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.AnimalMessage animal = 1;</code>
     */
    public Builder clearAnimal() {
      if (animalBuilder_ == null) {
        animal_ = null;
        onChanged();
      } else {
        animal_ = null;
        animalBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.AnimalMessage animal = 1;</code>
     */
    public com.example.datapersistance.protobuf.AnimalMessage.Builder getAnimalBuilder() {
      
      onChanged();
      return getAnimalFieldBuilder().getBuilder();
    }
    /**
     * <code>.AnimalMessage animal = 1;</code>
     */
    public com.example.datapersistance.protobuf.AnimalMessageOrBuilder getAnimalOrBuilder() {
      if (animalBuilder_ != null) {
        return animalBuilder_.getMessageOrBuilder();
      } else {
        return animal_ == null ?
            com.example.datapersistance.protobuf.AnimalMessage.getDefaultInstance() : animal_;
      }
    }
    /**
     * <code>.AnimalMessage animal = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.example.datapersistance.protobuf.AnimalMessage, com.example.datapersistance.protobuf.AnimalMessage.Builder, com.example.datapersistance.protobuf.AnimalMessageOrBuilder> 
        getAnimalFieldBuilder() {
      if (animalBuilder_ == null) {
        animalBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.example.datapersistance.protobuf.AnimalMessage, com.example.datapersistance.protobuf.AnimalMessage.Builder, com.example.datapersistance.protobuf.AnimalMessageOrBuilder>(
                getAnimal(),
                getParentForChildren(),
                isClean());
        animal_ = null;
      }
      return animalBuilder_;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:FindByIdResponseAnimal)
  }

  // @@protoc_insertion_point(class_scope:FindByIdResponseAnimal)
  private static final com.example.datapersistance.protobuf.FindByIdResponseAnimal DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.example.datapersistance.protobuf.FindByIdResponseAnimal();
  }

  public static com.example.datapersistance.protobuf.FindByIdResponseAnimal getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<FindByIdResponseAnimal>
      PARSER = new com.google.protobuf.AbstractParser<FindByIdResponseAnimal>() {
    @java.lang.Override
    public FindByIdResponseAnimal parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new FindByIdResponseAnimal(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<FindByIdResponseAnimal> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<FindByIdResponseAnimal> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.example.datapersistance.protobuf.FindByIdResponseAnimal getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

