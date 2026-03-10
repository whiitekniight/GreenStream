package androidx.datastore.preferences.protobuf;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public class InvalidProtocolBufferException extends IOException {

    /* JADX INFO: renamed from: ʾˋ */
    public boolean f353;

    public static class InvalidWireTypeException extends InvalidProtocolBufferException {
    }

    /* JADX INFO: renamed from: ʽ */
    public static InvalidProtocolBufferException m139() {
        return new InvalidProtocolBufferException("CodedInputStream encountered a malformed varint.");
    }

    /* JADX INFO: renamed from: ˈ */
    public static InvalidProtocolBufferException m140() {
        return new InvalidProtocolBufferException("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    /* JADX INFO: renamed from: ˑﹳ */
    public static InvalidProtocolBufferException m141() {
        return new InvalidProtocolBufferException("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    /* JADX INFO: renamed from: ⁱˊ */
    public static InvalidWireTypeException m142() {
        return new InvalidWireTypeException("Protocol message tag had invalid wire type.");
    }

    /* JADX INFO: renamed from: ﹳٴ */
    public static InvalidProtocolBufferException m143() {
        return new InvalidProtocolBufferException("Protocol message had invalid UTF-8.");
    }
}
