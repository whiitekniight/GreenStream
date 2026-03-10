package com.google.crypto.tink.shaded.protobuf;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public class InvalidProtocolBufferException extends IOException {

    /* JADX INFO: renamed from: ʾˋ */
    public boolean f2975;

    public static class InvalidWireTypeException extends InvalidProtocolBufferException {
    }

    /* JADX INFO: renamed from: ʽ */
    public static InvalidWireTypeException m2518() {
        return new InvalidWireTypeException("Protocol message tag had invalid wire type.");
    }

    /* JADX INFO: renamed from: ˈ */
    public static InvalidProtocolBufferException m2519() {
        return new InvalidProtocolBufferException("CodedInputStream encountered a malformed varint.");
    }

    /* JADX INFO: renamed from: ˑﹳ */
    public static InvalidProtocolBufferException m2520() {
        return new InvalidProtocolBufferException("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    /* JADX INFO: renamed from: ᵎﹶ */
    public static InvalidProtocolBufferException m2521() {
        return new InvalidProtocolBufferException("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    /* JADX INFO: renamed from: ⁱˊ */
    public static InvalidProtocolBufferException m2522() {
        return new InvalidProtocolBufferException("Protocol message had invalid UTF-8.");
    }

    /* JADX INFO: renamed from: ﹳٴ */
    public static InvalidProtocolBufferException m2523() {
        return new InvalidProtocolBufferException("Protocol message contained an invalid tag (zero).");
    }

    /* JADX INFO: renamed from: ﾞᴵ */
    public static InvalidProtocolBufferException m2524() {
        return new InvalidProtocolBufferException("Failed to parse the message.");
    }
}
