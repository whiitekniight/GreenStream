package p111;

import com.google.firebase.encoders.EncodingException;
import java.util.Map;
import p097.InterfaceC2214;
import p097.InterfaceC2215;
import p130.C2479;

/* JADX INFO: renamed from: ˆˉ.ﹳٴ */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2388 implements InterfaceC2214 {

    /* JADX INFO: renamed from: ﹳٴ */
    public final /* synthetic */ int f8562;

    public /* synthetic */ C2388(int r1) {
        this.f8562 = r1;
    }

    @Override // p097.InterfaceC2218
    /* JADX INFO: renamed from: ﹳٴ */
    public final void mo5053(Object r3, Object r4) {
        switch(this.f8562) {
            case 0: goto L9;
            case 1: goto L6;
            default: goto L5;
        };
    L6:
        Map.Entry r32 = (Map.Entry) r3;
        InterfaceC2215 r42 = (InterfaceC2215) r4;
        r42.mo5391(C2479.f8797, r32.getKey());
        r42.mo5391(C2479.f8798, r32.getValue());
        return;
    L5:
        throw new EncodingException("Couldn't find encoder for type " + r3.getClass().getCanonicalName());
    L9:
        throw new EncodingException("Couldn't find encoder for type " + r3.getClass().getCanonicalName());
    }
}
