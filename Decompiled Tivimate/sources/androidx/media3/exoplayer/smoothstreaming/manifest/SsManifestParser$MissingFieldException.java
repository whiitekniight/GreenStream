package androidx.media3.exoplayer.smoothstreaming.manifest;

import androidx.media3.common.ParserException;

/* JADX INFO: loaded from: classes.dex */
public class SsManifestParser$MissingFieldException extends ParserException {
    public SsManifestParser$MissingFieldException(String r4) {
        super("Missing required field: ".concat(r4), null, true, 4);
    }
}
