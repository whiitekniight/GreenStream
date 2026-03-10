package androidx.media3.common;

import java.io.IOException;
import p047.AbstractC1703;

/* JADX INFO: loaded from: classes.dex */
public class ParserException extends IOException {

    /* JADX INFO: renamed from: ʾˋ */
    public final boolean f1134;

    /* JADX INFO: renamed from: ᴵˊ */
    public final int f1135;

    public ParserException(String r1, Throwable r2, boolean r3, int r4) {
        super(r1, r2);
        this.f1134 = r3;
        this.f1135 = r4;
    }

    /* JADX INFO: renamed from: ʽ */
    public static ParserException m739(String r4) {
        return new ParserException(r4, null, false, 1);
    }

    /* JADX INFO: renamed from: ⁱˊ */
    public static ParserException m740(String r3, Exception r4) {
        return new ParserException(r3, r4, true, 4);
    }

    /* JADX INFO: renamed from: ﹳٴ */
    public static ParserException m741(RuntimeException r2, String r3) {
        return new ParserException(r3, r2, true, 1);
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        String r0 = super.getMessage();
        StringBuilder r1 = new StringBuilder();
        if (r0 == null) goto L5;
        String r02 = r0.concat(" ");
    L6:
        r1.append(r02);
        r1.append("{contentIsMalformed=");
        r1.append(this.f1134);
        r1.append(", dataType=");
        return AbstractC1703.m4493(r1, this.f1135, "}");
    L5:
        r02 = "";
        goto L6
    }
}
