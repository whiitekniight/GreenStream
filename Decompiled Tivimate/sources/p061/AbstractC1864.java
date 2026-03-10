package p061;

import android.security.keystore.KeyGenParameterSpec;

/* JADX INFO: renamed from: ʽـ.ʽ */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1864 {

    /* JADX INFO: renamed from: ﹳٴ */
    public static final Object f6368 = null;

    static {
        new KeyGenParameterSpec.Builder("_androidx_security_master_key_", 3).setBlockModes(new String[]{"GCM"}).setEncryptionPaddings(new String[]{"NoPadding"}).setKeySize(256).build();
        f6368 = new Object();
    }
}
