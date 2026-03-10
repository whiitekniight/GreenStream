package kotlinx.serialization;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class MissingFieldException extends SerializationException {

    /* JADX INFO: renamed from: ʾˋ */
    public final List f4053;

    public MissingFieldException(List r1, String r2, MissingFieldException r3) {
        super(r2, r3);
        this.f4053 = r1;
    }
}
