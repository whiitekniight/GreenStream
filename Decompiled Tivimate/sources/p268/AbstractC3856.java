package p268;

import android.os.Build;
import com.parse.ˑ;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.IvParameterSpec;
import p005j$.util.Objects;
import p416.AbstractC5287;

/* JADX INFO: renamed from: יٴ.ʽ */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3856 {

    /* JADX INFO: renamed from: ﹳٴ */
    public static final ˑ f14129 = null;

    static {
        f14129 = new ˑ(6);
    }

    /* JADX INFO: renamed from: ﹳٴ */
    public static AlgorithmParameterSpec m7947(byte[] r2, int r3, int r4) {
        int r0 = AbstractC5287.f19006;
        if (Objects.equals(System.getProperty("java.vendor"), "The Android Project") == true) goto L5;
        Integer r02 = null;
    L6:
        if (r02 == null) goto L12;
        if (r02.intValue() > 19) goto L12;
        return new IvParameterSpec(r2, r3, r4);
    L12:
        return new GCMParameterSpec(128, r2, r3, r4);
    L5:
        r02 = Integer.valueOf(Build.VERSION.SDK_INT);
        goto L6
    }
}
