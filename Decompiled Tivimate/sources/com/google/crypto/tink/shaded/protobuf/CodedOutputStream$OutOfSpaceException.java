package com.google.crypto.tink.shaded.protobuf;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public class CodedOutputStream$OutOfSpaceException extends IOException {
    public CodedOutputStream$OutOfSpaceException() {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.");
    }

    public CodedOutputStream$OutOfSpaceException(IndexOutOfBoundsException r2) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.", r2);
    }

    public CodedOutputStream$OutOfSpaceException(String r2, IndexOutOfBoundsException r3) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.: ".concat(r2), r3);
    }
}
