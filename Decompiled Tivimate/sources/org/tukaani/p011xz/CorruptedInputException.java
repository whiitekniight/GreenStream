package org.tukaani.p011xz;

/* JADX INFO: loaded from: classes.dex */
public class CorruptedInputException extends XZIOException {
    public CorruptedInputException() {
        super("Compressed data is corrupt");
    }
}
